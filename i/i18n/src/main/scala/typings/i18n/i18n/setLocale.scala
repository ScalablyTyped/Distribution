package typings.i18n.i18n

import typings.i18n.Express.Request
import typings.i18n.Express.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.setLocale")
@js.native
object setLocale extends js.Object {
  //#endregion
  //#region Locale
  /**
    * Change the current active locale
    * @param locale - The locale to set as default
    */
  def apply(locale: String): Unit = js.native
  /**
    * Change the current active locale for specified response
    * @param objects - The object(s) to change locale on
    * @param locale - The locale to set as default
    * @param [inheritance=false] - Disables inheritance if true
    */
  // tslint:disable-next-line:unified-signatures
  def apply(objects: js.Any, locale: String): Unit = js.native
  def apply(objects: js.Any, locale: String, inheritance: Boolean): Unit = js.native
  def apply(objects: js.Array[_], locale: String): Unit = js.native
  def apply(objects: js.Array[_], locale: String, inheritance: Boolean): Unit = js.native
  /**
    * Change the current active locale for specified response
    * @param response - The request or response to change locale on
    * @param locale - The locale to set as default
    * @param [inheritance=false] - Disables inheritance if true
    */
  // tslint:disable-next-line:unified-signatures
  def apply(requestOrResponse: Request, locale: String): Unit = js.native
  def apply(requestOrResponse: Request, locale: String, inheritance: Boolean): Unit = js.native
  def apply(requestOrResponse: Response, locale: String): Unit = js.native
  def apply(requestOrResponse: Response, locale: String, inheritance: Boolean): Unit = js.native
}

