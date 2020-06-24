package jp.techacademy.yusuke.kotlinlog

import android.util.Log

abstract class Human: Animal {
    constructor(name: String, age: Int, hobby: String): super(name, age, hobby) {
    }

    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
    override fun think(){
        Log.d("kotlintest", "私は" + this.hobby + "について考える。")
    }
}