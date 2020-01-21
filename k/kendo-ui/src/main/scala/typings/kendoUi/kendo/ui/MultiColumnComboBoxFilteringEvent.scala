package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxFilteringEvent extends MultiColumnComboBoxEvent {
  var filter: js.UndefOr[js.Any] = js.undefined
}

object MultiColumnComboBoxFilteringEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: MultiColumnComboBox,
    filter: js.Any = null
  ): MultiColumnComboBoxFilteringEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnComboBoxFilteringEvent]
  }
}

