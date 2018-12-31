package typings
package igniteDashUiLib

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
  var firstColumnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the row index for the first cell in a range selection.
  	 */
  var firstRowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column index for the last cell in a range selection.
  	 */
  var lastColumnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the row index for the last cell in a range selection.
  	 */
  var lastRowIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to selected cells object array.
  	 */
  var selectedCells: js.UndefOr[js.Array[_]] = js.undefined
}

