package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellRightClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to cell DOM element.
  	 */
  var cellElement: js.UndefOr[stdLib.Element] = js.undefined
  /**
  	 * Gets the column index of the DOM element.
  	 */
  var colIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key.
  	 */
  var colKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the row DOM element.
  	 */
  var row: js.UndefOr[stdLib.Element] = js.undefined
  /**
  	 * Gets the row index.
  	 */
  var rowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the row key.
  	 */
  var rowKey: js.UndefOr[js.Any] = js.undefined
}

object CellRightClickEventUIParam {
  @scala.inline
  def apply(
    cellElement: stdLib.Element = null,
    colIndex: scala.Int | scala.Double = null,
    colKey: java.lang.String = null,
    owner: js.Any = null,
    row: stdLib.Element = null,
    rowIndex: scala.Int | scala.Double = null,
    rowKey: js.Any = null
  ): CellRightClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cellElement != null) __obj.updateDynamic("cellElement")(cellElement)
    if (colIndex != null) __obj.updateDynamic("colIndex")(colIndex.asInstanceOf[js.Any])
    if (colKey != null) __obj.updateDynamic("colKey")(colKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (row != null) __obj.updateDynamic("row")(row)
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey)
    __obj.asInstanceOf[CellRightClickEventUIParam]
  }
}

