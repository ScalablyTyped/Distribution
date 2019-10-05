package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.kendo.dataviz.diagram.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramItemRotateEvent extends DiagramEvent {
  var item: js.UndefOr[Shape] = js.undefined
}

object DiagramItemRotateEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    item: Shape = null
  ): DiagramItemRotateEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (item != null) __obj.updateDynamic("item")(item)
    __obj.asInstanceOf[DiagramItemRotateEvent]
  }
}

