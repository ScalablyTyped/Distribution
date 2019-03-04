package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SurfaceMouseenterEvent extends SurfaceEvent {
  var element: js.UndefOr[kendoDashUiLib.kendoNs.drawingNs.Element] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object SurfaceMouseenterEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Surface,
    element: kendoDashUiLib.kendoNs.drawingNs.Element = null,
    originalEvent: js.Any = null
  ): SurfaceMouseenterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (element != null) __obj.updateDynamic("element")(element)
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent)
    __obj.asInstanceOf[SurfaceMouseenterEvent]
  }
}

