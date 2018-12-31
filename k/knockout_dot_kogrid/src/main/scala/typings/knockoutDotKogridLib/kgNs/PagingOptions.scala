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

