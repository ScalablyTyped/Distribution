package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeEnteringEventUIParam extends js.Object {
  /**
  	 * Gets the cell for which the control is going into edit mode.
  	 */
  var cell: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object EditModeEnteringEventUIParam {
  @scala.inline
  def apply(cell: String = null, owner: js.Any = null): EditModeEnteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[EditModeEnteringEventUIParam]
  }
}

