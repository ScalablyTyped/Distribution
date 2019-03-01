package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeExitingEventUIParam extends js.Object {
  /**
  	 * Get or set a boolean indicating whether the changes will be made to the cell's value when edit mode ends.
  	 */
  var acceptChanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Get a boolean indicating if the edit mode is being forced to exit edit mode in which case it cannot be cancelled.
  	 */
  var canCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the cell for which the control is exiting edit mode.
  	 */
  var cell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the edit text that will be used to update the cell(s).
  	 */
  var editText: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object EditModeExitingEventUIParam {
  @scala.inline
  def apply(
    acceptChanges: js.UndefOr[scala.Boolean] = js.undefined,
    canCancel: js.UndefOr[scala.Boolean] = js.undefined,
    cell: java.lang.String = null,
    editText: java.lang.String = null,
    owner: js.Any = null
  ): EditModeExitingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acceptChanges)) __obj.updateDynamic("acceptChanges")(acceptChanges)
    if (!js.isUndefined(canCancel)) __obj.updateDynamic("canCancel")(canCancel)
    if (cell != null) __obj.updateDynamic("cell")(cell)
    if (editText != null) __obj.updateDynamic("editText")(editText)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[EditModeExitingEventUIParam]
  }
}

