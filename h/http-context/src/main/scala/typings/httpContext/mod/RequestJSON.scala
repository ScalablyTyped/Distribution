package typings.httpContext.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestJSON extends js.Object {
  var header: IncomingHttpHeaders = js.native
  var method: String = js.native
  var url: String = js.native
}

object RequestJSON {
  @scala.inline
  def apply(header: IncomingHttpHeaders, method: String, url: String): RequestJSON = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestJSON]
  }
  @scala.inline
  implicit class RequestJSONOps[Self <: RequestJSON] (val x: Self) extends AnyVal {
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
    def setHeader(value: IncomingHttpHeaders): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

