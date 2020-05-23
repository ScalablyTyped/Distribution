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
trait PlusAccelerometerAccelerometerOption extends js.Object {
  /**
    * 更新加速度信息间隔时间
    * 监听器获取加速度信息的时间间隔，单位为ms，默认值为500ms
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/accelerometer.html](http://www.html5plus.org/doc/zh_cn/accelerometer.html)
    */
  var frequency: js.UndefOr[Double] = js.undefined
}

object PlusAccelerometerAccelerometerOption {
  @scala.inline
  def apply(frequency: js.UndefOr[Double] = js.undefined): PlusAccelerometerAccelerometerOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusAccelerometerAccelerometerOption]
  }
}

