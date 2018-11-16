package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UserPromptDisplayingEventUIParam extends js.Object {
  /**
  	 * Get a boolean indicating if the operation that triggered the prompt can be cancelled.
  	 */
  var canCancel: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Get a boolean indicating if a message will be displayed to the end user.
  	 */
  var displayMessage: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets the exception for the error, if there was one.
  	 */
  var exception: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get or set the message that will be displayed.
  	 */
  var message: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get the [action](ig.spreadsheet.SpreadsheetUserPromptTrigger) that caused the prompt to be displayed.
  	 */
  var trigger: js.UndefOr[java.lang.String] = js.undefined
}

