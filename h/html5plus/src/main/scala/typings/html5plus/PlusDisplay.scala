package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display模块管理应用可使用的显示区域信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
trait PlusDisplay extends js.Object {
  /**
    * 应用可使用的屏幕高度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    *     如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionHeight: js.UndefOr[Double] = js.undefined
  /**
    * 应用可使用的屏幕宽度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    *     如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionWidth: js.UndefOr[Double] = js.undefined
}

object PlusDisplay {
  @scala.inline
  def apply(
    resolutionHeight: js.UndefOr[Double] = js.undefined,
    resolutionWidth: js.UndefOr[Double] = js.undefined
  ): PlusDisplay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resolutionHeight)) __obj.updateDynamic("resolutionHeight")(resolutionHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resolutionWidth)) __obj.updateDynamic("resolutionWidth")(resolutionWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusDisplay]
  }
}

