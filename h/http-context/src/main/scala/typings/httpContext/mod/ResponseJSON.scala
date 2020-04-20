package typings.httpContext.mod

import typings.node.httpMod.OutgoingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseJSON extends js.Object {
  var header: OutgoingHttpHeaders
  var message: String
  var status: Double
}

object ResponseJSON {
  @scala.inline
  def apply(header: OutgoingHttpHeaders, message: String, status: Double): ResponseJSON = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseJSON]
  }
}

