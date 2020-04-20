package typings.imperium.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "evaluateRouteActions")
@js.native
object evaluateRouteActions extends js.Object {
  def apply(req: Request_[ParamsDictionary, _, _, Query], action: js.Array[Action], context: Context_): Actions = js.native
}

