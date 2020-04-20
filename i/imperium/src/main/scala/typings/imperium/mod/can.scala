package typings.imperium.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("imperium", "can")
@js.native
object can extends js.Object {
  def apply(actionS: String): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(actionS: js.Array[Action | String]): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
  def apply(actionS: Action): js.Promise[RequestHandler[ParamsDictionary, _, _, Query]] = js.native
}

