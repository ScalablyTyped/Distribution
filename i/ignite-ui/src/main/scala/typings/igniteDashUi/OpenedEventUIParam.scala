package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to menu widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object OpenedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): OpenedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[OpenedEventUIParam]
  }
}

