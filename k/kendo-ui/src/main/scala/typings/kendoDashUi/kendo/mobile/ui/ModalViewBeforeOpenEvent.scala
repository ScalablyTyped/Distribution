package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalViewBeforeOpenEvent extends ModalViewEvent {
  var target: js.UndefOr[JQuery] = js.undefined
}

object ModalViewBeforeOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: ModalView,
    target: JQuery = null
  ): ModalViewBeforeOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[ModalViewBeforeOpenEvent]
  }
}

