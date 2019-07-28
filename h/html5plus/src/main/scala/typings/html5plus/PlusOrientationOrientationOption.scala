package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，监听设备方向感应器参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
  */
trait PlusOrientationOrientationOption extends js.Object {
  /**
    * 更新方向信息的时间间隔
    * 数值类型，单位为ms，默认值为500ms。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/orientation.html](http://www.html5plus.org/doc/zh_cn/orientation.html)
    */
  var frequency: js.UndefOr[Double] = js.undefined
}

object PlusOrientationOrientationOption {
  @scala.inline
  def apply(frequency: Int | Double = null): PlusOrientationOrientationOption = {
    val __obj = js.Dynamic.literal()
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusOrientationOrientationOption]
  }
}

