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
trait PlusAccelerometerAcceleration extends js.Object {
  /**
    * x轴方向的加速度
    * 获取当前设备x轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var xAxis: js.UndefOr[Double] = js.undefined
  /**
    * y轴方向的加速度
    * 获取当前设备y轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var yAxis: js.UndefOr[Double] = js.undefined
  /**
    * z轴方向的加速度
    * 获取当前设备z轴方向的加速度，浮点型数据，与物理学中的加速度值一致。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var zAxis: js.UndefOr[Double] = js.undefined
}

object PlusAccelerometerAcceleration {
  @scala.inline
  def apply(xAxis: Int | Double = null, yAxis: Int | Double = null, zAxis: Int | Double = null): PlusAccelerometerAcceleration = {
    val __obj = js.Dynamic.literal()
    if (xAxis != null) __obj.updateDynamic("xAxis")(xAxis.asInstanceOf[js.Any])
    if (yAxis != null) __obj.updateDynamic("yAxis")(yAxis.asInstanceOf[js.Any])
    if (zAxis != null) __obj.updateDynamic("zAxis")(zAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusAccelerometerAcceleration]
  }
}

