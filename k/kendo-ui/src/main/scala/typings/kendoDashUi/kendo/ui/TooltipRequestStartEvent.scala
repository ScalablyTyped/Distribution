package typings.kendoDashUi.kendo.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipRequestStartEvent extends TooltipEvent {
  var options: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object TooltipRequestStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Tooltip,
    options: js.Any = null,
    target: JQuery = null
  ): TooltipRequestStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (options != null) __obj.updateDynamic("options")(options)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[TooltipRequestStartEvent]
  }
}

