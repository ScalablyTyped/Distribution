package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Connection
import typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Shape
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramAddEvent extends DiagramEvent {
  var connection: js.UndefOr[Connection] = js.undefined
  var shape: js.UndefOr[Shape] = js.undefined
}

object DiagramAddEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    connection: Connection = null,
    shape: Shape = null
  ): DiagramAddEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[DiagramAddEvent]
  }
}

