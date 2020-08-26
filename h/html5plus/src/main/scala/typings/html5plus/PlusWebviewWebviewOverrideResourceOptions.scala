package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 拦截Webview窗口资源请求的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
  */
@js.native
trait PlusWebviewWebviewOverrideResourceOptions extends js.Object {
  /**
    * 重定向的资源数据编码
    * 如未设置，则使用默认值"UTF-8"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var encoding: js.UndefOr[String] = js.native
  /**
    * 设置重定向资源数据的http头数据
    * 可设置标注http头数据（如Content-type）,也可设置自定义数据。
    *     通常可通过此属性来设置拦截资源的缓存策略（如Cache-control）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var header: js.UndefOr[js.Any] = js.native
  /**
    * 区配需要拦截请求资源的URL地址
    * 支持正则表达式，默认值为空字符串（即不拦截）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var `match`: js.UndefOr[String] = js.native
  /**
    * 重定向的资源数据类型
    * RFC2045/RFC2046/RFC2047/RFC2048/RFC2049规范中定义的数据类型。
    *     如普通文本（text/plain）、PNG图像(image/png)、GIF图形(image/gif)、JPEG图形(image/jpeg)。
    *     如果未指定mime类型，则根据重定向资源路径自动区配。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var mime: js.UndefOr[String] = js.native
  /**
    * 拦截重定向的资源地址
    * 仅支持本地资源地址，如"_www"、"_doc"、"_downloads"、"_documents"等开头的路径。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/webview.html](http://www.html5plus.org/doc/zh_cn/webview.html)
    */
  var redirect: js.UndefOr[String] = js.native
}

object PlusWebviewWebviewOverrideResourceOptions {
  @scala.inline
  def apply(): PlusWebviewWebviewOverrideResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusWebviewWebviewOverrideResourceOptions]
  }
  @scala.inline
  implicit class PlusWebviewWebviewOverrideResourceOptionsOps[Self <: PlusWebviewWebviewOverrideResourceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setHeader(value: js.Any): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setMatch(value: String): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatch: Self = this.set("match", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setRedirect(value: String): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
  
}

