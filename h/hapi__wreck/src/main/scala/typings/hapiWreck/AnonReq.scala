package typings.hapiWreck

import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  var req: ClientRequest
}

object AnonReq {
  @scala.inline
  def apply(req: ClientRequest): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReq]
  }
}

