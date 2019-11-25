package typings.knockoutDotKogrid.kg

import typings.knockout.KnockoutObservable
import typings.knockout.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PagingOptions extends js.Object {
  /** currentPage: the uhm... current page. */
  var currentPage: js.UndefOr[KnockoutObservable[Double]] = js.undefined
  /** pageSize: currently selected page size.  */
  var pageSize: js.UndefOr[KnockoutObservable[Double]] = js.undefined
  /**  pageSizes: list of available page sizes.  */
  var pageSizes: js.UndefOr[KnockoutObservableArray[Double]] = js.undefined
  /** totalServerItems: Total items are on the server.  */
  var totalServerItems: js.UndefOr[KnockoutObservable[Double]] = js.undefined
}

object PagingOptions {
  @scala.inline
  def apply(
    currentPage: KnockoutObservable[Double] = null,
    pageSize: KnockoutObservable[Double] = null,
    pageSizes: KnockoutObservableArray[Double] = null,
    totalServerItems: KnockoutObservable[Double] = null
  ): PagingOptions = {
    val __obj = js.Dynamic.literal()
    if (currentPage != null) __obj.updateDynamic("currentPage")(currentPage.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageSizes != null) __obj.updateDynamic("pageSizes")(pageSizes.asInstanceOf[js.Any])
    if (totalServerItems != null) __obj.updateDynamic("totalServerItems")(totalServerItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[PagingOptions]
  }
}

