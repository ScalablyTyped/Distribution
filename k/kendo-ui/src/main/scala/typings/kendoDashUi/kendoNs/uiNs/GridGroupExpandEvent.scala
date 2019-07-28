package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridGroupExpandEvent extends GridEvent {
  var element: js.UndefOr[JQuery] = js.undefined
  var group: js.UndefOr[js.Any] = js.undefined
}

object GridGroupExpandEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Grid,
    element: JQuery = null,
    group: js.Any = null
  ): GridGroupExpandEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (group != null) __obj.updateDynamic("group")(group)
    __obj.asInstanceOf[GridGroupExpandEvent]
  }
}

