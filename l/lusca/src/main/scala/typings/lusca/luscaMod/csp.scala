package typings.lusca.luscaMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "csp")
@js.native
object csp extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: cspOptions): RequestHandler[ParamsDictionary] = js.native
}

