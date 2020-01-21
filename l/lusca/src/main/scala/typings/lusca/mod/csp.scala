package typings.lusca.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "csp")
@js.native
object csp extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: cspOptions): RequestHandler[ParamsDictionary] = js.native
}

