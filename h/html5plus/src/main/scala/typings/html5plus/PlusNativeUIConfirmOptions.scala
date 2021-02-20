package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 确认对话框的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
@js.native
trait PlusNativeUIConfirmOptions extends StObject {
  
  /**
    * 确认对话框上显示的按钮
    * 字符串数组，每项对应在确认对话框上显示一个按钮，用户点击后通过confirmCB返回用户点击按钮的在数组中的索引值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var buttons: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 确认对话框显示的标题
    * 如果不设置此属性值，则不显示标题。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * 对话框在屏幕中的垂直分享对齐方式
    * 可取值：
    *         "top" - 表示垂直居顶对齐；
    *         "center" - 表示垂直居中对齐；
    *         "bottom" - 表示垂直居底对齐。
    *     默认值为"center"（垂直居中对齐）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var verticalAlign: js.UndefOr[String] = js.native
}
object PlusNativeUIConfirmOptions {
  
  @scala.inline
  def apply(): PlusNativeUIConfirmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIConfirmOptions]
  }
  
  @scala.inline
  implicit class PlusNativeUIConfirmOptionsMutableBuilder[Self <: PlusNativeUIConfirmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[_]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: js.Any*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
  }
}
