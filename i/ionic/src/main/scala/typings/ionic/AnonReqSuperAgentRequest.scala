package typings.ionic

import typings.ionic.httpMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReqSuperAgentRequest extends js.Object {
  var req: SuperAgentRequest
}

object AnonReqSuperAgentRequest {
  @scala.inline
  def apply(req: SuperAgentRequest): AnonReqSuperAgentRequest = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReqSuperAgentRequest]
  }
}

