package typings.imperium.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "evaluateUserActions")
@js.native
object evaluateUserActions extends js.Object {
  def apply(req: Request_[ParamsDictionary], roles: js.Array[Role_]): js.Promise[js.Array[Action]] = js.native
}

