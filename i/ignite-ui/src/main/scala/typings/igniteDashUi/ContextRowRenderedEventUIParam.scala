package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextRowRenderedEventUIParam extends js.Object {
  /**
  	 * Gets the current context row mode.
  	 */
  var contextRowMode: js.UndefOr[String] = js.undefined
  /**
  	 * Gets current page index.
  	 */
  var currentPageIndex: js.UndefOr[Double] = js.undefined
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

object ContextRowRenderedEventUIParam {
  @scala.inline
  def apply(
    contextRowMode: String = null,
    currentPageIndex: Int | Double = null,
    dataRow: js.Any = null,
    owner: js.Any = null,
    parentRows: js.Array[_] = null
  ): ContextRowRenderedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (contextRowMode != null) __obj.updateDynamic("contextRowMode")(contextRowMode)
    if (currentPageIndex != null) __obj.updateDynamic("currentPageIndex")(currentPageIndex.asInstanceOf[js.Any])
    if (dataRow != null) __obj.updateDynamic("dataRow")(dataRow)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentRows != null) __obj.updateDynamic("parentRows")(parentRows)
    __obj.asInstanceOf[ContextRowRenderedEventUIParam]
  }
}

