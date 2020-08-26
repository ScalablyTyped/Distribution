package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 监听设备加速度感应器参数
  * JSON对象，用于设置获取设备加速度信息的参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
@js.native
trait PlusAccelerometerAccelerometerOption extends js.Object {
  /**
    * 更新加速度信息间隔时间
    * 监听器获取加速度信息的时间间隔，单位为ms，默认值为500ms
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var frequency: js.UndefOr[Double] = js.native
}

object PlusAccelerometerAccelerometerOption {
  @scala.inline
  def apply(): PlusAccelerometerAccelerometerOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAccelerometerAccelerometerOption]
  }
  @scala.inline
  implicit class PlusAccelerometerAccelerometerOptionOps[Self <: PlusAccelerometerAccelerometerOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrequency(value: Double): Self = this.set("frequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrequency: Self = this.set("frequency", js.undefined)
  }
  
}

