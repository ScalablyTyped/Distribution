package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnComboBoxEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiColumnComboBox
  def isDefaultPrevented(): scala.Boolean
}

object MultiColumnComboBoxEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: MultiColumnComboBox
  ): MultiColumnComboBoxEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MultiColumnComboBoxEvent]
  }
}

