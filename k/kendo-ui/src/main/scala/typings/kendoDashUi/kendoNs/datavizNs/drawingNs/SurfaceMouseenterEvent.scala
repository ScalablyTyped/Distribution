package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceMouseenterEvent extends SurfaceEvent {
  var element: js.UndefOr[typings.kendoDashUi.kendoNs.drawingNs.Element] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SurfaceMouseenterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Surface,
    element: typings.kendoDashUi.kendoNs.drawingNs.Element = null,
    originalEvent: js.Any = null
  ): SurfaceMouseenterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[SurfaceMouseenterEvent]
  }
}

