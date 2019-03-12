package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupCollapseEvent extends GridEvent {
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
}

object GridGroupCollapseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    element: kendoDashUiLib.JQuery = null,
    group: js.Any = null
  ): GridGroupCollapseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[GridGroupCollapseEvent]
  }
}

