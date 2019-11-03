package typings.lusca.luscaMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "hsts")
@js.native
object hsts extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: hstsOptions): RequestHandler[ParamsDictionary] = js.native
}

