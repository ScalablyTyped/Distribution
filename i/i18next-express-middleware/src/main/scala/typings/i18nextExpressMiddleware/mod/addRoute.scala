package typings.i18nextExpressMiddleware.mod

import typings.express.mod.RequestHandler
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
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
    fc: RequestHandler[ParamsDictionary, _, _, Query]
  ): Unit = js.native
  def apply(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler[ParamsDictionary, _, _, Query]
  ): Unit = js.native
}

