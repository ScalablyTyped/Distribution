package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridNavigateEvent extends GridEvent {
  var element: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object GridNavigateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Grid,
    element: kendoDashUiLib.JQuery = null
  ): GridNavigateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    __obj.asInstanceOf[GridNavigateEvent]
  }
}

