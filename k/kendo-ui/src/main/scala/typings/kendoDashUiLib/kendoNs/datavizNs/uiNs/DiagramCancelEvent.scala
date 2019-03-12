package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramCancelEvent extends DiagramEvent {
  var connection: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
  var container: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
  var shape: js.UndefOr[kendoDashUiLib.kendoNs.dataNs.Model] = js.undefined
}

object DiagramCancelEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => scala.Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    connection: kendoDashUiLib.kendoNs.dataNs.Model = null,
    container: kendoDashUiLib.JQuery = null,
    shape: kendoDashUiLib.kendoNs.dataNs.Model = null
  ): DiagramCancelEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (container != null) __obj.updateDynamic("container")(container)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    __obj.asInstanceOf[DiagramCancelEvent]
  }
}

