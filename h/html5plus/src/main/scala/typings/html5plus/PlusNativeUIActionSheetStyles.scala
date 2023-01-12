package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，原生选择按钮框的样式参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
  */
trait PlusNativeUIActionSheetStyles extends StObject {
  
  /**
    * 选择框上的按钮，ActionButtonStyles对象数组
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var buttons: js.UndefOr[js.Array[PlusNativeUI]] = js.undefined
  
  /**
    * 取消按钮上显示的文字内容
    * 不设置此属性，则不显示取消按钮。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var cancel: js.UndefOr[String] = js.undefined
  
  /**
    * 选择按钮框的标题
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/nativeui.html](http://www.html5plus.org/doc/zh_cn/nativeui.html)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlusNativeUIActionSheetStyles {
  
  inline def apply(): PlusNativeUIActionSheetStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNativeUIActionSheetStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusNativeUIActionSheetStyles] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[PlusNativeUI]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: PlusNativeUI*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
