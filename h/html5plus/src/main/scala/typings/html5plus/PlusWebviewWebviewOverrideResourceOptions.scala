package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 拦截Webview窗口资源请求的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewOverrideResourceOptions extends StObject {
  
  /**
    * 重定向的资源数据编码
    * 如未设置，则使用默认值"UTF-8"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var encoding: js.UndefOr[String] = js.undefined
  
  /**
    * 设置重定向资源数据的http头数据
    * 可设置标注http头数据（如Content-type）,也可设置自定义数据。
    *     通常可通过此属性来设置拦截资源的缓存策略（如Cache-control）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var header: js.UndefOr[Any] = js.undefined
  
  /**
    * 区配需要拦截请求资源的URL地址
    * 支持正则表达式，默认值为空字符串（即不拦截）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.undefined
  
  /**
    * 重定向的资源数据类型
    * RFC2045/RFC2046/RFC2047/RFC2048/RFC2049规范中定义的数据类型。
    *     如普通文本（text/plain）、PNG图像(image/png)、GIF图形(image/gif)、JPEG图形(image/jpeg)。
    *     如果未指定mime类型，则根据重定向资源路径自动区配。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mime: js.UndefOr[String] = js.undefined
  
  /**
    * 拦截重定向的资源地址
    * 仅支持本地资源地址，如"_www"、"_doc"、"_downloads"、"_documents"等开头的路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var redirect: js.UndefOr[String] = js.undefined
}
object PlusWebviewWebviewOverrideResourceOptions {
  
  inline def apply(): PlusWebviewWebviewOverrideResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewOverrideResourceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusWebviewWebviewOverrideResourceOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    
    inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    
    inline def setRedirect(value: String): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
  }
}
