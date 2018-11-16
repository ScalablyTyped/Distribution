package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ContextRowRenderedEventUIParam extends js.Object {
  /**
  	 * Gets the current context row mode.
  	 */
  var contextRowMode: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to the first data row. Null if there are no records.
  	 */
  var dataRow: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to igTreeGridPaging.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets array of the parent rows(of the ui.dataRow). If the dataRow is null(for instance filter is applied and no records are shown) then it is empty array. Otherwise it contains all ancestors ordered by level(including the current dataRow) - the first item is root level, the last array item is the current ui.dataRow
  	 */
  var parentRows: js.UndefOr[js.Array[_]] = js.undefined
}

