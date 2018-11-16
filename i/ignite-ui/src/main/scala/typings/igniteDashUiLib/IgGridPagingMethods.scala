package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridPagingMethods extends js.Object {
  def changeGlobalLanguage(): scala.Unit = js.native
  def changeGlobalRegional(): scala.Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.iggridpaging#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.iggridpaging#options:language) or [locale](ui.iggridpaging#options:locale) option setter
  	 */
  def changeLocale(): scala.Unit = js.native
  /**
  	 * Destroys the igGridPaging feature by removing all elements in the pager area, unbinding events, and resetting data to discard data filtering on paging.
  	 */
  def destroy(): scala.Unit = js.native
  /**
  	 * Gets/Sets the current page index, delegates data binding and paging to [$.ig.DataSource](ig.datasource).
  	 *
  	 * @param index The page index to go to.
  	 */
  def pageIndex(): scala.Double = js.native
  /**
  	 * Gets/Sets the current page index, delegates data binding and paging to [$.ig.DataSource](ig.datasource).
  	 *
  	 * @param index The page index to go to.
  	 */
  def pageIndex(index: scala.Double): scala.Double = js.native
  /**
  	 * Gets/Sets the page size. If no parameter is specified, just returns the current page size.
  	 *
  	 * @param size The new page size.
  	 */
  def pageSize(): scala.Double = js.native
  /**
  	 * Gets/Sets the page size. If no parameter is specified, just returns the current page size.
  	 *
  	 * @param size The new page size.
  	 */
  def pageSize(size: scala.Double): scala.Double = js.native
}

