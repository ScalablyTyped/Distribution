package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeExitedEventUIParam extends js.Object {
  /**
  	 * Gets the cell for which the control has exited edit mode.
  	 */
  var cell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object EditModeExitedEventUIParam {
  @scala.inline
  def apply(cell: java.lang.String = null, owner: js.Any = null): EditModeExitedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[EditModeExitedEventUIParam]
  }
}

