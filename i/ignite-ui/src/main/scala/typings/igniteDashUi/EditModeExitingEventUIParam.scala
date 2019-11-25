package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeExitingEventUIParam extends js.Object {
  /**
  	 * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
  	 */
  var acceptChanges: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
  	 */
  var canCancel: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the cell for which the control is exiting edit mode.
  	 */
  var cell: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the edit text that will be used to update the cell(s).
  	 */
  var editText: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object EditModeExitingEventUIParam {
  @scala.inline
  def apply(
    acceptChanges: js.UndefOr[Boolean] = js.undefined,
    canCancel: js.UndefOr[Boolean] = js.undefined,
    cell: String = null,
    editText: String = null,
    owner: js.Any = null
  ): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptChanges)) __obj.updateDynamic("acceptChanges")(acceptChanges.asInstanceOf[js.Any])
    if (!js.isUndefined(canCancel)) __obj.updateDynamic("canCancel")(canCancel.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (editText != null) __obj.updateDynamic("editText")(editText.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
}

