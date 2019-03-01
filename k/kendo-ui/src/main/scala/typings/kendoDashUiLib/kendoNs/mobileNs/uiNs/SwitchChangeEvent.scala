package typings
package kendoDashUiLib.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchChangeEvent extends SwitchEvent {
  var checked: js.UndefOr[js.Any] = js.undefined
}

object SwitchChangeEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Switch,
    checked: js.Any = null
  ): SwitchChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (checked != null) __obj.updateDynamic("checked")(checked)
    __obj.asInstanceOf[SwitchChangeEvent]
  }
}

