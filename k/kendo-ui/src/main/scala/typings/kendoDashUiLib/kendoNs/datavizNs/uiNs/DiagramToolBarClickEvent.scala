package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramToolBarClickEvent extends DiagramEvent {
  var action: js.UndefOr[java.lang.String] = js.undefined
  var connections: js.UndefOr[js.Any] = js.undefined
  var shapes: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[kendoDashUiLib.JQuery] = js.undefined
}

object DiagramToolBarClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: Diagram,
    action: java.lang.String = null,
    connections: js.Any = null,
    shapes: js.Any = null,
    target: kendoDashUiLib.JQuery = null
  ): DiagramToolBarClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DiagramToolBarClickEvent]
  }
}

