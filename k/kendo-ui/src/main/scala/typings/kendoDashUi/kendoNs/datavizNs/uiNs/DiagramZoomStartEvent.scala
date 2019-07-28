package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramZoomStartEvent extends DiagramEvent {
  var point: js.UndefOr[Point] = js.undefined
  var zoom: js.UndefOr[Double] = js.undefined
}

object DiagramZoomStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    point: Point = null,
    zoom: Int | Double = null
  ): DiagramZoomStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (point != null) __obj.updateDynamic("point")(point)
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramZoomStartEvent]
  }
}

