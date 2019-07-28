package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogOpenedEventUIParam extends js.Object {
  /**
  	 * Gets reference to the filtering dialog DOM element.
  	 */
  var dialog: js.UndefOr[String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogOpenedEventUIParam {
  @scala.inline
  def apply(dialog: String = null, owner: js.Any = null): FilterDialogOpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialog != null) __obj.updateDynamic("dialog")(dialog)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[FilterDialogOpenedEventUIParam]
  }
}

