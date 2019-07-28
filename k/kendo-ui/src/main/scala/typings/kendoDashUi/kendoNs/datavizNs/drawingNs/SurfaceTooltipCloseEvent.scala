package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceTooltipCloseEvent extends SurfaceEvent {
  var element: js.UndefOr[typings.kendoDashUi.kendoNs.drawingNs.Element] = js.undefined
  var target: js.UndefOr[typings.kendoDashUi.kendoNs.drawingNs.Element] = js.undefined
}

object SurfaceTooltipCloseEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Surface,
    element: typings.kendoDashUi.kendoNs.drawingNs.Element = null,
    target: typings.kendoDashUi.kendoNs.drawingNs.Element = null
  ): SurfaceTooltipCloseEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[SurfaceTooltipCloseEvent]
  }
}

