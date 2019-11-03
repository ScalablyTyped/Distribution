package typings.imperium.imperiumMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "can")
@js.native
object can extends js.Object {
  def apply(actionS: String): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary]] = js.native
  def apply(actionS: Action): js.Promise[RequestHandler[ParamsDictionary]] = js.native
}

