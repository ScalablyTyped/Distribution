package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[knockoutLib.KnockoutObservable[scala.Double]] = js.undefined
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[knockoutLib.KnockoutObservable[scala.Double]] = js.undefined
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[knockoutLib.KnockoutObservableArray[scala.Double]] = js.undefined
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[knockoutLib.KnockoutObservable[scala.Double]] = js.undefined
}

object PagingOptions {
  @scala.inline
  def apply(
    currentPage: knockoutLib.KnockoutObservable[scala.Double] = null,
    pageSize: knockoutLib.KnockoutObservable[scala.Double] = null,
    pageSizes: knockoutLib.KnockoutObservableArray[scala.Double] = null,
    totalServerItems: knockoutLib.KnockoutObservable[scala.Double] = null
  ): PagingOptions = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize)
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes)
    if (totalServerItems != null) __obj.updateDynamic("totalServerItems")(totalServerItems)
    __obj.asInstanceOf[PagingOptions]
  }
}

