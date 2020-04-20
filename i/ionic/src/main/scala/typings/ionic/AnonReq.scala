package typings.ionic

import typings.ionic.definitionsMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  var req: SuperAgentRequest
}

object AnonReq {
  @scala.inline
  def apply(req: SuperAgentRequest): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReq]
  }
}

