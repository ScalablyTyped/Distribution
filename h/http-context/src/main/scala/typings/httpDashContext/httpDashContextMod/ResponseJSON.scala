package typings.httpDashContext.httpDashContextMod

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
    val __obj = js.Dynamic.literal(header = header, message = message, status = status)
  
    __obj.asInstanceOf[ResponseJSON]
  }
}

