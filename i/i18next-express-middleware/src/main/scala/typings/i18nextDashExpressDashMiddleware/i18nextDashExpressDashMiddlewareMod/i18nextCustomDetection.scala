package typings.i18nextDashExpressDashMiddleware.i18nextDashExpressDashMiddlewareMod

import typings.express.expressMod.Request
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait i18nextCustomDetection extends js.Object {
  var name: String = js.native
  def cacheUserLanguage(req: Request, res: Response): Unit = js.native
  def cacheUserLanguage(req: Request, res: Response, lng: js.Any): Unit = js.native
  def cacheUserLanguage(req: Request, res: Response, lng: js.Any, options: js.Object): Unit = js.native
  def lookup(req: Request, res: Response): Unit = js.native
  def lookup(req: Request, res: Response, options: js.Object): Unit = js.native
}

