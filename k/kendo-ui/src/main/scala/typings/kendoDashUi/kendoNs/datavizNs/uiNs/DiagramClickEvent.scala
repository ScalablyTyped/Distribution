package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramClickEvent extends DiagramEvent {
  var item: js.UndefOr[js.Any] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var point: js.UndefOr[Point] = js.undefined
}

object DiagramClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    item: js.Any = null,
    meta: js.Any = null,
    point: Point = null
  ): DiagramClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (point != null) __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[DiagramClickEvent]
  }
}

