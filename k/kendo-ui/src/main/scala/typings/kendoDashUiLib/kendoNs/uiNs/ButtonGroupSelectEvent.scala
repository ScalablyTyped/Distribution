package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupSelectEvent extends ButtonGroupEvent {
  var indices: js.UndefOr[js.Any] = js.undefined
}

object ButtonGroupSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ButtonGroup,
    indices: js.Any = null
  ): ButtonGroupSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[ButtonGroupSelectEvent]
  }
}

