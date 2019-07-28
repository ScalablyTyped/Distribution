package typings.httpDashContext.httpDashContextMod

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
    val __obj = js.Dynamic.literal(header = header, method = method, url = url)
  
    __obj.asInstanceOf[RequestJSON]
  }
}

