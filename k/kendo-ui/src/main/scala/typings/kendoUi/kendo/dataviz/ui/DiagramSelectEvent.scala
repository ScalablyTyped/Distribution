package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramSelectEvent extends DiagramEvent {
  var deselected: js.UndefOr[js.Any] = js.undefined
  var selected: js.UndefOr[js.Any] = js.undefined
}

object DiagramSelectEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: Diagram,
    deselected: js.Any = null,
    selected: js.Any = null
  ): DiagramSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (deselected != null) __obj.updateDynamic("deselected")(deselected.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramSelectEvent]
  }
}

