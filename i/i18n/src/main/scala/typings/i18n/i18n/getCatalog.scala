package typings.i18n.i18n

import typings.i18n.Express.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("i18n.getCatalog")
@js.native
object getCatalog extends js.Object {
  //#endregion
  //#region Catalog
  /**
    * Get the current global catalog
    * @returns The current global catalog
    */
  def apply(): GlobalCatalog = js.native
  /**
    * Get the catalog for the given locale
    * @param locale - The locale to get catalog for
    * @returns The specified locale catalog
    */
  def apply(locale: String): LocaleCatalog = js.native
  /**
    * Get the current active locale catalog for specified request
    * @param request - The request to get locale catalog for
    * @param [locale] - The locale to get catalog for
    * @returns The current locale catalog for the specified request
    */
  def apply(request: Request): LocaleCatalog = js.native
  def apply(request: Request, locale: String): LocaleCatalog = js.native
}

