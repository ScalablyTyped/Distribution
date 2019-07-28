package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramPanEvent extends DiagramEvent {
  var pan: js.UndefOr[Point] = js.undefined
}

object DiagramPanEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Diagram, pan: Point = null): DiagramPanEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (pan != null) __obj.updateDynamic("pan")(pan)
    __obj.asInstanceOf[DiagramPanEvent]
  }
}

