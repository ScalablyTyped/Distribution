package typings.ionic.anon

import typings.ionic.definitionsMod.SuperAgentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  var req: SuperAgentRequest
}

object Req {
  @scala.inline
  def apply(req: SuperAgentRequest): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

