package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EditRangePasswordNeededEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Get an array of [protected range](ig.excel.WorksheetProtectedRange) objects that should be unlocked.
  	 */
  var ranges: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Get a parameterless function that may be invoked to unlock the associated ranges.
  	 */
  var unprotect: js.UndefOr[js.Any] = js.undefined
}

