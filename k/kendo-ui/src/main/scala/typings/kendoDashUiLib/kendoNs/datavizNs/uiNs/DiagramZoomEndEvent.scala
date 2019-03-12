package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramZoomEndEvent extends DiagramEvent {
  var point: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object DiagramZoomEndEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = null,
    zoom: scala.Int | scala.Double = null
  ): DiagramZoomEndEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (point != null) __obj.updateDynamic("point")(point)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramZoomEndEvent]
  }
}

