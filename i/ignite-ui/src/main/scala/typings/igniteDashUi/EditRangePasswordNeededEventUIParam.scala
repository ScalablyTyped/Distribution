package typings.igniteDashUi

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

object EditRangePasswordNeededEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, ranges: js.Array[_] = null, unprotect: js.Any = null): EditRangePasswordNeededEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (unprotect != null) __obj.updateDynamic("unprotect")(unprotect.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditRangePasswordNeededEventUIParam]
  }
}

