package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 创建加载HTML数据参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
trait PlusWebviewWebviewLoadDataOptions extends js.Object {
  /**
    * 页面的Base URL
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var baseURL: js.UndefOr[String] = js.undefined
  /**
    * HTML数据的编码类型
    * 默认值为"utf-8"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * HTML数据的数据类型
    * 默认值为"text/html"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mimeType: js.UndefOr[String] = js.undefined
}

object PlusWebviewWebviewLoadDataOptions {
  @scala.inline
  def apply(baseURL: String = null, encoding: String = null, mimeType: String = null): PlusWebviewWebviewLoadDataOptions = {
    val __obj = js.Dynamic.literal()
    if (baseURL != null) __obj.updateDynamic("baseURL")(baseURL)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[PlusWebviewWebviewLoadDataOptions]
  }
}

