package typings.kendoDashUi.kendo.mobile.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopOverOpenEvent extends PopOverEvent {
  var target: js.UndefOr[JQuery] = js.undefined
}

object PopOverOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: PopOver,
    target: JQuery = null
  ): PopOverOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[PopOverOpenEvent]
  }
}

