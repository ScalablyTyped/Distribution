package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonClickEvent extends ButtonEvent {
  var event: js.UndefOr[js.Any] = js.undefined
}

object ButtonClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Button,
    event: js.Any = null
  ): ButtonClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (event != null) __obj.updateDynamic("event")(event)
    __obj.asInstanceOf[ButtonClickEvent]
  }
}

