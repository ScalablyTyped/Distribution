package typings
package httpDashContextLib.httpDashContextMod.HttpContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseJSON extends js.Object {
  var header: nodeLib.httpMod.OutgoingHttpHeaders
  var message: java.lang.String
  var status: scala.Double
}

object ResponseJSON {
  @scala.inline
  def apply(header: nodeLib.httpMod.OutgoingHttpHeaders, message: java.lang.String, status: scala.Double): ResponseJSON = {
    val __obj = js.Dynamic.literal(header = header, message = message, status = status)
  
    __obj.asInstanceOf[ResponseJSON]
  }
}

