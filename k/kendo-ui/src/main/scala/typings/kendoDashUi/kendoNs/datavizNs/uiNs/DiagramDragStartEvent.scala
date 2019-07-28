package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramDragStartEvent extends DiagramEvent {
  var connectionHandle: js.UndefOr[String] = js.undefined
  var connections: js.UndefOr[js.Any] = js.undefined
  var shapes: js.UndefOr[js.Any] = js.undefined
}

object DiagramDragStartEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    connectionHandle: String = null,
    connections: js.Any = null,
    shapes: js.Any = null
  ): DiagramDragStartEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (connectionHandle != null) __obj.updateDynamic("connectionHandle")(connectionHandle)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    __obj.asInstanceOf[DiagramDragStartEvent]
  }
}

