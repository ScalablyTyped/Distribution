package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Webview窗口动画样式
  * 用于指定动画窗口的起始位置、目标位置等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewAnimationStyles extends StObject {
  
  /**
    * 画窗口的起始左侧位置
    * 支持百分比、像素值，默认值为当前窗口的位置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var fromLeft: js.UndefOr[String] = js.undefined
  
  /**
    * 画窗口的目标左侧位置
    * 持百分比、像素值。
    *     注意：如果设置的位置与起始位置一直，则无动画效果。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var toLeft: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewAnimationStyles {
  
  inline def apply(): PlusWebviewWebviewAnimationStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewAnimationStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusWebviewWebviewAnimationStyles] (val x: Self) extends AnyVal {
    
    inline def setFromLeft(value: String): Self = StObject.set(x, "fromLeft", value.asInstanceOf[js.Any])
    
    inline def setFromLeftUndefined: Self = StObject.set(x, "fromLeft", js.undefined)
    
    inline def setToLeft(value: String): Self = StObject.set(x, "toLeft", value.asInstanceOf[js.Any])
    
    inline def setToLeftUndefined: Self = StObject.set(x, "toLeft", js.undefined)
  }
}
