package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 拦截Webview窗口资源请求的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewOverrideResourceOptions extends js.Object {
  /**
    * 重定向的资源数据编码
    * 如未设置，则使用默认值"UTF-8"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 设置重定向资源数据的http头数据
    * 可设置标注http头数据（如Content-type）,也可设置自定义数据。
    * 	通常可通过此属性来设置拦截资源的缓存策略（如Cache-control）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 区配需要拦截请求资源的URL地址
    * 支持正则表达式，默认值为空字符串（即不拦截）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 重定向的资源数据类型
    * RFC2045/RFC2046/RFC2047/RFC2048/RFC2049规范中定义的数据类型。
    * 	如普通文本（text/plain）、PNG图像(image/png)、GIF图形(image/gif)、JPEG图形(image/jpeg)。
    * 	如果未指定mime类型，则根据重定向资源路径自动区配。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 拦截重定向的资源地址
    * 仅支持本地资源地址，如"_www"、"_doc"、"_downloads"、"_documents"等开头的路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var redirect: js.UndefOr[java.lang.String] = js.undefined
}

object PlusWebviewWebviewOverrideResourceOptions {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    header: js.Any = null,
    `match`: java.lang.String = null,
    mime: java.lang.String = null,
    redirect: java.lang.String = null
  ): PlusWebviewWebviewOverrideResourceOptions = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (header != null) __obj.updateDynamic("header")(header)
    if (`match` != null) __obj.updateDynamic("match")(`match`)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    __obj.asInstanceOf[PlusWebviewWebviewOverrideResourceOptions]
  }
}

