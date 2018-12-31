package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveWorksheetChangedEventUIParam extends js.Object {
  /**
  	 * Gets the current active [worksheet](ig.excel.Worksheet).
  	 */
  var newActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the new active worksheet or null if newActiveWorksheet is null.
  	 */
  var newActiveWorksheetName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the previous active [worksheet](ig.excel.Worksheet).
  	 */
  var oldActiveWorksheet: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the name of the previous active worksheet or null if oldActiveWorksheet is null.
  	 */
  var oldActiveWorksheetName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

