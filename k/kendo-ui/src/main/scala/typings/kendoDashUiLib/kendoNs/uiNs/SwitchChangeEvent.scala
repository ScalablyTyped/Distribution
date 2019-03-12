package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchChangeEvent extends SwitchEvent {
  var checked: js.UndefOr[js.Any] = js.undefined
}

object SwitchChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Switch,
    checked: js.Any = null
  ): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[SwitchChangeEvent]
  }
}

