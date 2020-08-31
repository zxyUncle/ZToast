package com.zuiyue.ztoastdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zxy.ztoast.snackbar.ZToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            ZToast.setColorI("#FFC107")
            ZToast.showI(this,"showI")
        }
        btn2.setOnClickListener {
            ZToast.setColorS("#FFC107")
            ZToast.showS(this,"showS")
        }
        btn3.setOnClickListener {
            ZToast.setColorE("#FFC107")
            ZToast.showE(this,"showE")
        }
    }
}
