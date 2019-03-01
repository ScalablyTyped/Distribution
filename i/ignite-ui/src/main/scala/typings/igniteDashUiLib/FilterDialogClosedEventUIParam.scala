package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogClosedEventUIParam extends js.Object {
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogClosedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): FilterDialogClosedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogClosedEventUIParam]
  }
}

