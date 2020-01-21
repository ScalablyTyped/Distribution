package typings.hapiHapi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  var req: IncomingMessage
  var res: ServerResponse
}

object AnonReq {
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonReq]
  }
}

