package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDialogFilteringEventUIParam extends js.Object {
  /**
  	 * Gets reference to filtering dialog DOM element.
  	 */
  var dialog: js.UndefOr[String] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object FilterDialogFilteringEventUIParam {
  @scala.inline
  def apply(dialog: String = null, owner: js.Any = null): FilterDialogFilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (dialog != null) __obj.updateDynamic("dialog")(dialog.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDialogFilteringEventUIParam]
  }
}

