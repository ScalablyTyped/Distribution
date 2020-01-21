package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiColumnComboBox
  def isDefaultPrevented(): Boolean
}

object MultiColumnComboBoxEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: MultiColumnComboBox): MultiColumnComboBoxEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MultiColumnComboBoxEvent]
  }
}

