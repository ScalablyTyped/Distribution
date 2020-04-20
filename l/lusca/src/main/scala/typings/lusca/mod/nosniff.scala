package typings.lusca.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "nosniff")
@js.native
object nosniff extends js.Object {
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
}

