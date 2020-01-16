package typings.atHapiWreck

import typings.node.httpMod.ClientRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Req extends js.Object {
  var req: ClientRequest
}

object Anon_Req {
  @scala.inline
  def apply(req: ClientRequest): Anon_Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Req]
  }
}

