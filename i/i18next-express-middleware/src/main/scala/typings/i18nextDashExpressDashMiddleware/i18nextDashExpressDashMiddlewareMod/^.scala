package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Handler
import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("i18next-express-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def addRoute(i18next: I18next, route: String, lngs: js.Array[String], app: App, fc: RequestHandler): Unit = js.native
  def addRoute(
    i18next: I18next,
    route: String,
    lngs: js.Array[String],
    app: App,
    verb: String,
    fc: RequestHandler
  ): Unit = js.native
  def getResourcesHandler(i18next: I18next): Handler = js.native
  def getResourcesHandler(i18next: I18next, options: GetResourcesHandlerOptions): Handler = js.native
  def handle(i18next: I18next): Handler = js.native
  def handle(i18next: I18next, options: HandleOptions): Handler = js.native
  def missingKeyHandler(i18next: I18next): Handler = js.native
  def missingKeyHandler(i18next: I18next, options: MissingKeyHandlerOptions): Handler = js.native
}

