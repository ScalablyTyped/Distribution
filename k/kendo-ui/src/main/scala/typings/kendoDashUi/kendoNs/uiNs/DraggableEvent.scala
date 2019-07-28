package typings.kendoDashUi.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableEvent extends js.Object {
  var sender: js.UndefOr[Draggable] = js.undefined
}

object DraggableEvent {
  @scala.inline
  def apply(sender: Draggable = null): DraggableEvent = {
    val __obj = js.Dynamic.literal()
    if (sender != null) __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[DraggableEvent]
  }
}

