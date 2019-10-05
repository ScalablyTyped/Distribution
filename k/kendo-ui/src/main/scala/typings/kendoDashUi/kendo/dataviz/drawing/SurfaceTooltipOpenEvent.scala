package typings.kendoDashUi.kendo.dataviz.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipOpenEvent extends SurfaceEvent {
  var element: js.UndefOr[typings.kendoDashUi.kendo.drawing.Element] = js.undefined
  var target: js.UndefOr[typings.kendoDashUi.kendo.drawing.Element] = js.undefined
}

object SurfaceTooltipOpenEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Surface,
    element: typings.kendoDashUi.kendo.drawing.Element = null,
    target: typings.kendoDashUi.kendo.drawing.Element = null
  ): SurfaceTooltipOpenEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SurfaceTooltipOpenEvent]
  }
}

