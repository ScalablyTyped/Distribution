package typings.html5plus

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 日期选择对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIPickDateOption extends StObject {
  
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
  implicit class PlusNativeUIPickDateOptionMutableBuilder[Self <: PlusNativeUIPickDateOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setMaxDate(value: Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
    
    @scala.inline
    def setMinDate(value: Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
    
    @scala.inline
    def setPopover(value: js.Any): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
