package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.kendoNs.dataNs.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramCancelEvent extends DiagramEvent {
  var connection: js.UndefOr[Model] = js.undefined
  var container: js.UndefOr[JQuery] = js.undefined
  var shape: js.UndefOr[Model] = js.undefined
}

object DiagramCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    connection: Model = null,
    container: JQuery = null,
    shape: Model = null
  ): DiagramCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (container != null) __obj.updateDynamic("container")(container)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[DiagramCancelEvent]
  }
}

