package typings.lusca.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "xframe")
@js.native
object xframe extends js.Object {
  def apply(value: String): RequestHandler[ParamsDictionary] = js.native
}

