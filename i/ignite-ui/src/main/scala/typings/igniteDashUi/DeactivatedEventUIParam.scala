package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeactivatedEventUIParam extends js.Object {
  /**
  	 * Used to get reference to this igToolbarButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DeactivatedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): DeactivatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivatedEventUIParam]
  }
}

