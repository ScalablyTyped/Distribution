package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", "addRoute")
@js.native
object addRoute extends js.Object {
  def apply(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    fc: RequestHandler[ParamsDictionary]
  ): Unit = js.native
  def apply(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler[ParamsDictionary]
  ): Unit = js.native
}

