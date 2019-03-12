package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogCloseEvent extends DialogEvent {
  var userTriggered: js.UndefOr[scala.Boolean] = js.undefined
}

object DialogCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Dialog,
    userTriggered: js.UndefOr[scala.Boolean] = js.undefined
  ): DialogCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (!js.isUndefined(userTriggered)) __obj.updateDynamic("userTriggered")(userTriggered)
    __obj.asInstanceOf[DialogCloseEvent]
  }
}

