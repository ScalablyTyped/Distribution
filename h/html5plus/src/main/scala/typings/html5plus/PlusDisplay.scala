package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Display模块管理应用可使用的显示区域信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
  */
@js.native
trait PlusDisplay extends js.Object {
  /**
    * 应用可使用的屏幕高度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    *     如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionHeight: js.UndefOr[Double] = js.native
  /**
    * 应用可使用的屏幕宽度逻辑分辨率
    * 设备屏幕区域包括系统状态栏显示区域和应用显示区域，display获取的是应用显示区域的逻辑分辨率，单位为px。
    *     如果需要获取实际分辨率则需要乘以比例值scale。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/device.html](http://www.html5plus.org/doc/zh_cn/device.html)
    */
  var resolutionWidth: js.UndefOr[Double] = js.native
}

object PlusDisplay {
  @scala.inline
  def apply(): PlusDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusDisplay]
  }
  @scala.inline
  implicit class PlusDisplayOps[Self <: PlusDisplay] (val x: Self) extends AnyVal {
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
    def setResolutionHeight(value: Double): Self = this.set("resolutionHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionHeight: Self = this.set("resolutionHeight", js.undefined)
    @scala.inline
    def setResolutionWidth(value: Double): Self = this.set("resolutionWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionWidth: Self = this.set("resolutionWidth", js.undefined)
  }
  
}

