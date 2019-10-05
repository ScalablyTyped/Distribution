package typings.kendoDashUi.kendo.dataviz.ui

import typings.kendoDashUi.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramToolBarClickEvent extends DiagramEvent {
  var action: js.UndefOr[String] = js.undefined
  var connections: js.UndefOr[js.Any] = js.undefined
  var shapes: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[JQuery] = js.undefined
}

object DiagramToolBarClickEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    action: String = null,
    connections: js.Any = null,
    shapes: js.Any = null,
    target: JQuery = null
  ): DiagramToolBarClickEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
    if (action != null) __obj.updateDynamic("action")(action)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (shapes != null) __obj.updateDynamic("shapes")(shapes)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DiagramToolBarClickEvent]
  }
}

