package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceMouseleaveEvent extends SurfaceEvent {
  var element: js.UndefOr[Element] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SurfaceMouseleaveEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: Element = null,
    originalEvent: js.Any = null
  ): SurfaceMouseleaveEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[SurfaceMouseleaveEvent]
  }
}

