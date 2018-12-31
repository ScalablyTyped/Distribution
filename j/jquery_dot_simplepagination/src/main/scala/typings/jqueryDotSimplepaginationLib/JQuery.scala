package typings
package jqueryDotSimplepaginationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def pagination(): JQuery = js.native
  def pagination(method: java.lang.String): js.Any = js.native
  def pagination(method: java.lang.String, value: js.Any): js.Any = js.native
  def pagination(options: SimplePaginationOptions): JQuery = js.native
  /**
    * destroy - Visually destroys the pagination, any existing settings are kept.
    * 
    * @param destroy
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_destroy(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.destroy): JQuery = js.native
  /**
    * disable - Disables pagination functionality.
    * 
    * @param disable
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_disable(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.disable): JQuery = js.native
  /**
    * drawPage - takes a page number as a parameter and it sets the "currentPage" value to the given page number and draws the pagination
    * 
    * @param drawPage
    * @param {number} pageNumber 
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_drawPage(
    method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.drawPage,
    pageNumber: scala.Double
  ): JQuery = js.native
  /**
    * enable - Enables the pagination after it was previously disabled.
    * 
    * @param enable
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_enable(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.enable): JQuery = js.native
  /**
    * getCurrentPage - Returns the current page number.
    * 
    * @param getCurrentPage
    * @returns {number} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_getCurrentPage(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.getCurrentPage): scala.Double = js.native
  @JSName("pagination")
  def pagination_getItemsOnPage(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.getItemsOnPage): scala.Double = js.native
  /**
    * getPagesCount - Returns the total number of pages.
    * 
    * @param getPagesCount
    * @returns {number} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_getPagesCount(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.getPagesCount): scala.Double = js.native
  /**
    * nextPage - Select the next page.
    * 
    * @param nextPage
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_nextPage(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.nextPage): JQuery = js.native
  /**
    * prevPage - Selects the previous page.
    * 
    * @param prevPage
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_prevPage(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.prevPage): JQuery = js.native
  /**
    * redraw - The pagination is drawn again using the existing settings. (useful after you have destroyed a pagination for example)
    * 
    * @param redraw
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_redraw(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.redraw): JQuery = js.native
  @JSName("pagination")
  def pagination_selectPage(method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.selectPage): JQuery = js.native
  /**
    * selectPage - Select a page based on page number.
    * 
    * @param selectPage
    * @param {number} pageNumber 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_selectPage(
    method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.selectPage,
    pageNumber: scala.Double
  ): scala.Unit = js.native
  @JSName("pagination")
  def pagination_setPagesCount(
    method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.setPagesCount,
    count: scala.Double
  ): scala.Unit = js.native
  /**
    * updateItems - allows to dynamically change how many items are rendered by the pagination
    * 
    * @param updateItems
    * @param {number} items 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_updateItems(
    method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.updateItems,
    items: scala.Double
  ): scala.Unit = js.native
  /**
    * updateItemsOnPage - allows to dynamically change how many items are rendered on each page
    * 
    * @param updateItemsOnPage
    * @param {number} itemsOnPage 
    * @returns {JQuery} 
    * @memberof JQuery
    */
  @JSName("pagination")
  def pagination_updateItemsOnPage(
    method: jqueryDotSimplepaginationLib.jqueryDotSimplepaginationLibStrings.updateItemsOnPage,
    itemsOnPage: scala.Double
  ): JQuery = js.native
}

