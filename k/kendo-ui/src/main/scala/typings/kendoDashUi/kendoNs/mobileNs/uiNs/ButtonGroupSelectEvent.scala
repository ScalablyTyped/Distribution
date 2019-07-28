package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonGroupSelectEvent extends ButtonGroupEvent {
  var index: js.UndefOr[Double] = js.undefined
}

object ButtonGroupSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ButtonGroup,
    index: Int | Double = null
  ): ButtonGroupSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonGroupSelectEvent]
  }
}

