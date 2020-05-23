package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveCellChangedEventUIParam extends js.Object {
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ActiveCellChangedEventUIParam {
  @scala.inline
  def apply(cell: js.Any = null, owner: js.Any = null): ActiveCellChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveCellChangedEventUIParam]
  }
}

