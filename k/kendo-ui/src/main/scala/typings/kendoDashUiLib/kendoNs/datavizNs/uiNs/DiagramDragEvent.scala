package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramDragEvent extends DiagramEvent {
  var connectionHandle: js.UndefOr[java.lang.String] = js.undefined
  var connections: js.UndefOr[js.Any] = js.undefined
  var shapes: js.UndefOr[js.Any] = js.undefined
}

object DiagramDragEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    connectionHandle: java.lang.String = null,
    connections: js.Any = null,
    shapes: js.Any = null
  ): DiagramDragEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
    if (connectionHandle != null) __obj.updateDynamic("connectionHandle")(connectionHandle)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    __obj.asInstanceOf[DiagramDragEvent]
  }
}

