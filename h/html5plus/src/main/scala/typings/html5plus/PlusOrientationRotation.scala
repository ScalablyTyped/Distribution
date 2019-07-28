package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，设备方向信息数据
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
trait PlusOrientationRotation extends js.Object {
  /**
    * 以z方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var alpha: js.UndefOr[Double] = js.undefined
  /**
    * 以x方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为-180到180（不等于180）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var beta: js.UndefOr[Double] = js.undefined
  /**
    * 以y方向为轴心的旋转角度
    * 浮点数类型，只读属性，取值范围为-180到180（不等于180）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var gamma: js.UndefOr[Double] = js.undefined
  /**
    * 设备方向值的误差值
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  /**
    * 设备方向与地球磁场北极方向的角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var magneticHeading: js.UndefOr[Double] = js.undefined
  /**
    * 设备方向与地球真实北极方向的角度
    * 浮点数类型，只读属性，取值范围为0到360（不等于360）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var trueHeading: js.UndefOr[Double] = js.undefined
}

object PlusOrientationRotation {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    beta: Int | Double = null,
    gamma: Int | Double = null,
    headingAccuracy: Int | Double = null,
    magneticHeading: Int | Double = null,
    trueHeading: Int | Double = null
  ): PlusOrientationRotation = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (beta != null) __obj.updateDynamic("beta")(beta.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (headingAccuracy != null) __obj.updateDynamic("headingAccuracy")(headingAccuracy.asInstanceOf[js.Any])
    if (magneticHeading != null) __obj.updateDynamic("magneticHeading")(magneticHeading.asInstanceOf[js.Any])
    if (trueHeading != null) __obj.updateDynamic("trueHeading")(trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusOrientationRotation]
  }
}

