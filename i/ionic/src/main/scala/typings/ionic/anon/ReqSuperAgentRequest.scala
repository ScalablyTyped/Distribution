package typings.ionic.anon

import typings.ionic.httpMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReqSuperAgentRequest extends js.Object {
  var req: SuperAgentRequest
}

object ReqSuperAgentRequest {
  @scala.inline
  def apply(req: SuperAgentRequest): ReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReqSuperAgentRequest]
  }
}

