package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupSelectEvent extends ButtonGroupEvent {
  var indices: js.UndefOr[js.Any] = js.undefined
}

object ButtonGroupSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ButtonGroup,
    indices: js.Any = null
  ): ButtonGroupSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (indices != null) __obj.updateDynamic("indices")(indices)
    __obj.asInstanceOf[ButtonGroupSelectEvent]
  }
}

