package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeValidationErrorEventUIParam extends js.Object {
  /**
    * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
    */
  var action: js.UndefOr[String] = js.undefined
  /**
    * Get a boolean indicating whether the cell is allowed to stay in edit mode.
    */
  var canStayInEditMode: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets the cell for which the control is in edit mode.
    */
  var cell: js.UndefOr[String] = js.undefined
  /**
    * Gets a reference to the spreadsheet widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Get the [rule](ig.excel.DataValidationRule) which failed validation.
    */
  var validationRule: js.UndefOr[String] = js.undefined
}

object EditModeValidationErrorEventUIParam {
  @scala.inline
  def apply(
    action: String = null,
    canStayInEditMode: js.UndefOr[Boolean] = js.undefined,
    cell: String = null,
    owner: js.Any = null,
    validationRule: String = null
  ): EditModeValidationErrorEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (!js.isUndefined(canStayInEditMode)) __obj.updateDynamic("canStayInEditMode")(canStayInEditMode.get.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (validationRule != null) __obj.updateDynamic("validationRule")(validationRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditModeValidationErrorEventUIParam]
  }
}

