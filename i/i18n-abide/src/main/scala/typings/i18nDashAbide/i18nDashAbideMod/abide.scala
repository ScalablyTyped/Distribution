package typings.i18nDashAbide.i18nDashAbideMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18n-abide", "abide")
@js.native
object abide extends js.Object {
  def apply(): RequestHandler[ParamsDictionary] = js.native
  def apply(options: AbideOptions): RequestHandler[ParamsDictionary] = js.native
}

