package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeExitedEventUIParam extends js.Object {
  /**
  	 * Gets the cell for which the control has exited edit mode.
  	 */
  var cell: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object EditModeExitedEventUIParam {
  @scala.inline
  def apply(cell: String = null, owner: js.Any = null): EditModeExitedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditModeExitedEventUIParam]
  }
}

