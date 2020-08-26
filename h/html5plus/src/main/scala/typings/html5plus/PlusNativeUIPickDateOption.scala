package typings.html5plus

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 日期选择对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIPickDateOption extends js.Object {
  /**
    * 日期选择对话框默认显示的日期
    * 如果未设置默认显示的日期，则显示当前的日期。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var date: js.UndefOr[Date] = js.native
  /**
    * 日期选择对话框可选择的最大日期
    * Date类型对象，如果未设置可选择的最大日期，则使用系统默认可选择的最大日期值。
    *     其值必须大于minDate设置的值，否则使用系统默认可选择的最大日期值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var maxDate: js.UndefOr[Date] = js.native
  /**
    * 日期选择对话框可选择的最小日期
    * Date类型对象，如果未设置可选择的最小日期，则使用系统默认可选择的最小日期值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var minDate: js.UndefOr[Date] = js.native
  /**
    * 时间选择对话框弹出指示区域
    * JSON类型对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，其值为相对于容器Webview的位置。
    *     如未设置此值，默认在屏幕居中显示。仅在iPad上有效，其它设备忽略此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var popover: js.UndefOr[js.Any] = js.native
  /**
    * 日期选择对话框显示的标题
    * 如果未设置标题，则默认显示标题为当前选择的日期。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.native
}

object PlusNativeUIPickDateOption {
  @scala.inline
  def apply(): PlusNativeUIPickDateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIPickDateOption]
  }
  @scala.inline
  implicit class PlusNativeUIPickDateOptionOps[Self <: PlusNativeUIPickDateOption] (val x: Self) extends AnyVal {
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
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setMaxDate(value: Date): Self = this.set("maxDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDate: Self = this.set("maxDate", js.undefined)
    @scala.inline
    def setMinDate(value: Date): Self = this.set("minDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDate: Self = this.set("minDate", js.undefined)
    @scala.inline
    def setPopover(value: js.Any): Self = this.set("popover", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

