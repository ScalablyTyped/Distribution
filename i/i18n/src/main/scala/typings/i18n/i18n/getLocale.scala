package typings.i18n.i18n

import typings.i18n.Express.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.getLocale")
@js.native
object getLocale extends js.Object {
  /**
    * Get the current active locale for specified request
    * @param [request] - The request to get locale for
    * @returns The current locale in request
    */
  def apply(): String = js.native
  def apply(request: Request): String = js.native
}

