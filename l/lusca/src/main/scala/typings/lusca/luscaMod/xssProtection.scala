package typings.lusca.luscaMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", "xssProtection")
@js.native
object xssProtection extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: xssProtectionOptions): RequestHandler[ParamsDictionary] = js.native
}

