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
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

