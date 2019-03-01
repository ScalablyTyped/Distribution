package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookDirtiedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the spreadsheet widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object WorkbookDirtiedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): WorkbookDirtiedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[WorkbookDirtiedEventUIParam]
  }
}

