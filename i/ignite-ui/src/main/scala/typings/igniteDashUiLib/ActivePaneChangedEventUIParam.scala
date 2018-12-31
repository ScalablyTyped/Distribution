package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivePaneChangedEventUIParam extends js.Object {
  /**
  	 * Gets the active cell of the new active pane or null if there is no active pane.
  	 */
  var activeCell: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the current active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var newActivePane: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the previous active [pane](ig.spreadsheet.SpreadsheetPane).
  	 */
  var oldActivePane: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current visible range of the new active pane or null if there is no active pane.
  	 */
  var visibleRange: js.UndefOr[java.lang.String] = js.undefined
}

