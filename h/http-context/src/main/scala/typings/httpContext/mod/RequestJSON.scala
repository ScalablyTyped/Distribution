package typings.httpContext.mod

import typings.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestJSON extends js.Object {
  var header: IncomingHttpHeaders
  var method: String
  var url: String
}

object RequestJSON {
  @scala.inline
  def apply(header: IncomingHttpHeaders, method: String, url: String): RequestJSON = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestJSON]
  }
}

