package typings.imperium.imperiumMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "evaluateUserActions")
@js.native
object evaluateUserActions extends js.Object {
  def apply(req: Request[ParamsDictionary], roles: js.Array[Role]): js.Promise[js.Array[Action]] = js.native
}

