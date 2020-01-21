package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgTreeGridPagingMethods extends js.Object {
  def changeGlobalLanguage(): Unit = js.native
  def changeGlobalRegional(): Unit = js.native
  /**
  	 * Changes the all locales into the widget element to the language specified in [options.language](ui.igtreegridpaging#options:language)
  	 * Note that this method is for rare scenarios, see [language](ui.igtreegridpaging#options:language) or [locale](ui.igtreegridpaging#options:locale) option setter
  	 */
  def changeLocale(): Unit = js.native
  /**
  	 * Destroys the igTreeGridPaging feature by removing all elements in the pager area, unbinding events, and resetting data to discard data filtering on paging
  	 */
  def destroy(): Unit = js.native
  /**
  	 * Get jQuery representation of of the context row. It is rendered in the header. If there isn't such element - creates it.
  	 */
  def getContextRow(): js.Object = js.native
  /**
  	 * Get jQuery representation of element that holds text area of the context row. If there isn't such element - creates it.
  	 */
  def getContextRowTextArea(): js.Object = js.native
  /**
  	 * Gets/Sets the current page index, delegates data binding and paging to [$.ig.DataSource](ig.datasource).
  	 *
  	 * @param index The page index to go to.
  	 */
  def pageIndex(): Double = js.native
  def pageIndex(index: Double): Double = js.native
  /**
  	 * Gets/Sets the page size. If no parameter is specified, just returns the current page size.
  	 *
  	 * @param size The new page size.
  	 */
  def pageSize(): Double = js.native
  def pageSize(size: Double): Double = js.native
}

