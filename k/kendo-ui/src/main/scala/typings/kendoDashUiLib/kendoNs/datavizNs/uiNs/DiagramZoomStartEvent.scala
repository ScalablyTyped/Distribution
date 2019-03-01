package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramZoomStartEvent extends DiagramEvent {
  var point: js.UndefOr[kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point] = js.undefined
  var zoom: js.UndefOr[scala.Double] = js.undefined
}

object DiagramZoomStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    point: kendoDashUiLib.kendoNs.datavizNs.diagramNs.Point = null,
    zoom: scala.Int | scala.Double = null
  ): DiagramZoomStartEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (point != null) __obj.updateDynamic("point")(point)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramZoomStartEvent]
  }
}

