package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the cell object.
  	 */
  var cell: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to GridSelection.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to selected cells object array.
  	 */
  var selectedCells: js.UndefOr[js.Array[_]] = js.undefined
}

object CellSelectionChangedEventUIParam {
  @scala.inline
  def apply(cell: js.Any = null, owner: js.Any = null, selectedCells: js.Array[_] = null): CellSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (selectedCells != null) __obj.updateDynamic("selectedCells")(selectedCells)
    __obj.asInstanceOf[CellSelectionChangedEventUIParam]
  }
}

