package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowCloseEvent extends WindowEvent {
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}

object WindowCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Window,
    userTriggered: js.UndefOr[Boolean] = js.undefined
  ): WindowCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (!js.isUndefined(userTriggered)) __obj.updateDynamic("userTriggered")(userTriggered)
    __obj.asInstanceOf[WindowCloseEvent]
  }
}

