package typings.i18n.i18n

import typings.i18n.Express.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.overrideLocaleFromQuery")
@js.native
object overrideLocaleFromQuery extends js.Object {
  //#endregion
  /**
    * Override the current request locale by using the query param (?locale=en)
    * @param [request] - The request to override locale for
    */
  def apply(): Unit = js.native
  def apply(request: Request): Unit = js.native
}

