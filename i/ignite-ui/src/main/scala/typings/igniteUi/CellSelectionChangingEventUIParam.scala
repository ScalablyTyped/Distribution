package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectionChangingEventUIParam extends js.Object {
  /**
  	 * Gets reference to the cell object.
  	 */
  var cell: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the column index for the first cell in a range selection.
  	 */
  var firstColumnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the row index for the first cell in a range selection.
  	 */
  var firstRowIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the column index for the last cell in a range selection.
  	 */
  var lastColumnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the row index for the last cell in a range selection.
  	 */
  var lastRowIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to selected cells object array.
  	 */
  var selectedCells: js.UndefOr[js.Array[_]] = js.undefined
}

object CellSelectionChangingEventUIParam {
  @scala.inline
  def apply(
    cell: js.Any = null,
    firstColumnIndex: Int | Double = null,
    firstRowIndex: Int | Double = null,
    lastColumnIndex: Int | Double = null,
    lastRowIndex: Int | Double = null,
    owner: js.Any = null,
    selectedCells: js.Array[_] = null
  ): CellSelectionChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (firstColumnIndex != null) __obj.updateDynamic("firstColumnIndex")(firstColumnIndex.asInstanceOf[js.Any])
    if (firstRowIndex != null) __obj.updateDynamic("firstRowIndex")(firstRowIndex.asInstanceOf[js.Any])
    if (lastColumnIndex != null) __obj.updateDynamic("lastColumnIndex")(lastColumnIndex.asInstanceOf[js.Any])
    if (lastRowIndex != null) __obj.updateDynamic("lastRowIndex")(lastRowIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selectedCells != null) __obj.updateDynamic("selectedCells")(selectedCells.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellSelectionChangingEventUIParam]
  }
}

