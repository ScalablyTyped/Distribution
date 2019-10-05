package typings.i18n.i18n

import typings.i18n.Express.Request
import typings.i18n.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.init")
@js.native
object init extends js.Object {
  /**
    * Initialize i18n middleware for express
    * @param request - Current express request
    * @param response - Current express response
    * @param next - Callback to continue process
    */
  def apply(request: Request, response: Response): Unit = js.native
  def apply(request: Request, response: Response, next: js.Function0[Unit]): Unit = js.native
}

