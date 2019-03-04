package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupExpandEvent extends GridEvent {
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
}

object GridGroupExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Grid,
    element: kendoDashUiLib.JQuery = null,
    group: js.Any = null
  ): GridGroupExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[GridGroupExpandEvent]
  }
}

