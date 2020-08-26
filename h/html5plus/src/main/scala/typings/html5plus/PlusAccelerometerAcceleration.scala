package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 设备加速度信息对象
  * JSON对象，保存获取设备的加速度信息，包括x、y、z三个方向的加速度信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
  */
@js.native
trait PlusAccelerometerAcceleration extends js.Object {
  /**
    * x轴方向的加速度
    * 获取当前设备x轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var xAxis: js.UndefOr[Double] = js.native
  /**
    * y轴方向的加速度
    * 获取当前设备y轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var yAxis: js.UndefOr[Double] = js.native
  /**
    * z轴方向的加速度
    * 获取当前设备z轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var zAxis: js.UndefOr[Double] = js.native
}

object PlusAccelerometerAcceleration {
  @scala.inline
  def apply(): PlusAccelerometerAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusAccelerometerAcceleration]
  }
  @scala.inline
  implicit class PlusAccelerometerAccelerationOps[Self <: PlusAccelerometerAcceleration] (val x: Self) extends AnyVal {
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
    def setXAxis(value: Double): Self = this.set("xAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXAxis: Self = this.set("xAxis", js.undefined)
    @scala.inline
    def setYAxis(value: Double): Self = this.set("yAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYAxis: Self = this.set("yAxis", js.undefined)
    @scala.inline
    def setZAxis(value: Double): Self = this.set("zAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZAxis: Self = this.set("zAxis", js.undefined)
  }
  
}

