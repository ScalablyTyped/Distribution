package typings.kendoDashUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogCloseEvent extends DialogEvent {
  var userTriggered: js.UndefOr[Boolean] = js.undefined
}

object DialogCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Dialog,
    userTriggered: js.UndefOr[Boolean] = js.undefined
  ): DialogCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (!js.isUndefined(userTriggered)) __obj.updateDynamic("userTriggered")(userTriggered.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogCloseEvent]
  }
}

