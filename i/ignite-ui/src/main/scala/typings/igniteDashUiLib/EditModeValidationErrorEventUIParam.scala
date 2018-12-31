package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditModeValidationErrorEventUIParam extends js.Object {
  /**
  	 * Get or set the [action](ig.spreadsheet.SpreadsheetEditModeValidationErrorAction)  to take in response to the failed validation.
  	 */
  var action: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get a boolean indicating whether the cell is allowed to stay in edit mode.
  	 */
  var canStayInEditMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the cell for which the control is in edit mode.
  	 */
  var cell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the [rule](ig.excel.DataValidationRule) which failed validation.
  	 */
  var validationRule: js.UndefOr[java.lang.String] = js.undefined
}

