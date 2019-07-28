package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeactivatingEventUIParam extends js.Object {
  /**
  	 * Used to get reference to this igToolbarButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DeactivatingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): DeactivatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[DeactivatingEventUIParam]
  }
}

