package typings.hapi

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: IncomingMessage
  var res: ServerResponse
}

object Anon_Req {
  @scala.inline
  def apply(req: IncomingMessage, res: ServerResponse): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Req]
  }
}

