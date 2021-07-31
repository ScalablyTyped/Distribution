package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 监听Webview窗口资源加载的属性
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewListenResourceOptions extends StObject {
  
  /**
    * 区配是否需要处理的URL资源
    * 支持正则表达式，默认值为对所有URL资源请求生效（相当于正则表达式“.*”）。
    *     如果Webview加载的资源区配条件，则触发回调事件。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewListenResourceOptions {
  
  @scala.inline
  def apply(): PlusWebviewWebviewListenResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewListenResourceOptions]
  }
  
  @scala.inline
  implicit class PlusWebviewWebviewListenResourceOptionsMutableBuilder[Self <: PlusWebviewWebviewListenResourceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
