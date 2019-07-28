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
trait PlusNativeUIPickDateOption extends js.Object {
  /**
    * 日期选择对话框默认显示的日期
    * 如果未设置默认显示的日期，则显示当前的日期。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var date: js.UndefOr[Date] = js.undefined
  /**
    * 日期选择对话框可选择的最大日期
    * Date类型对象，如果未设置可选择的最大日期，则使用系统默认可选择的最大日期值。
    * 	其值必须大于minDate设置的值，否则使用系统默认可选择的最大日期值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var maxDate: js.UndefOr[Date] = js.undefined
  /**
    * 日期选择对话框可选择的最小日期
    * Date类型对象，如果未设置可选择的最小日期，则使用系统默认可选择的最小日期值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var minDate: js.UndefOr[Date] = js.undefined
  /**
    * 时间选择对话框弹出指示区域
    * JSON类型对象，格式如{top:10;left:10;width:200;height:200;}，所有值为像素值，其值为相对于容器Webview的位置。
    * 	如未设置此值，默认在屏幕居中显示。仅在iPad上有效，其它设备忽略此值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var popover: js.UndefOr[js.Any] = js.undefined
  /**
    * 日期选择对话框显示的标题
    * 如果未设置标题，则默认显示标题为当前选择的日期。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.undefined
}

object PlusNativeUIPickDateOption {
  @scala.inline
  def apply(
    date: Date = null,
    maxDate: Date = null,
    minDate: Date = null,
    popover: js.Any = null,
    title: String = null
  ): PlusNativeUIPickDateOption = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date)
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate)
    if (minDate != null) __obj.updateDynamic("minDate")(minDate)
    if (popover != null) __obj.updateDynamic("popover")(popover)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[PlusNativeUIPickDateOption]
  }
}

