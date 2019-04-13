package typings
package httpDashContextLib.httpDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestJSON extends js.Object {
  var header: nodeLib.httpMod.IncomingHttpHeaders
  var method: java.lang.String
  var url: java.lang.String
}

object RequestJSON {
  @scala.inline
  def apply(header: nodeLib.httpMod.IncomingHttpHeaders, method: java.lang.String, url: java.lang.String): RequestJSON = {
    val __obj = js.Dynamic.literal(header = header, method = method, url = url)
  
    __obj.asInstanceOf[RequestJSON]
  }
}

