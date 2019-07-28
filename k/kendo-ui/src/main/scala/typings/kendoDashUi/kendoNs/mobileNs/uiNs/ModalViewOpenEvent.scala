package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewOpenEvent extends ModalViewEvent {
  var target: js.UndefOr[JQuery] = js.undefined
}

object ModalViewOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ModalView,
    target: JQuery = null
  ): ModalViewOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ModalViewOpenEvent]
  }
}

