package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 原生控件在窗口中显示的位置
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewPosition extends StObject {
  
  /**
    * 控件在页面中绝对定位，如果页面存在滚动条不随窗口内容滚动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var absolute: js.UndefOr[String] = js.undefined
  
  /**
    * 控件在页面中停靠，停靠的位置通过dock属性进行定义
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var dock: js.UndefOr[String] = js.undefined
  
  /**
    * 控件在页面中正常定位，如果页面存在滚动条则随窗口内容滚动
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var static: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewPosition {
  
  @scala.inline
  def apply(): PlusWebviewWebviewPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewPosition]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewPositionMutableBuilder[Self <: PlusWebviewWebviewPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsolute(value: String): Self = StObject.set(x, "absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteUndefined: Self = StObject.set(x, "absolute", js.undefined)
    
    @scala.inline
    def setDock(value: String): Self = StObject.set(x, "dock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDockUndefined: Self = StObject.set(x, "dock", js.undefined)
    
    @scala.inline
    def setStatic(value: String): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
  }
}
