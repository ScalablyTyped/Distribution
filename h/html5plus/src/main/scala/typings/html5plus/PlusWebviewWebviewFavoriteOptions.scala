package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 窗口收藏参数
  * 在流应用环境中调用收藏功能时使用的参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewFavoriteOptions extends StObject {
  
  /**
    * 收藏的页面地址
    * 必须是网络地址。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * 收藏时显示的图标
    * 在收藏列表中显示的图标，默认使用应用图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  
  /**
    * 收藏时显示的标题
    * 在收藏列表中显示的标题字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var title: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewFavoriteOptions {
  
  inline def apply(): PlusWebviewWebviewFavoriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewFavoriteOptions]
  }
  
  extension [Self <: PlusWebviewWebviewFavoriteOptions](x: Self) {
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
