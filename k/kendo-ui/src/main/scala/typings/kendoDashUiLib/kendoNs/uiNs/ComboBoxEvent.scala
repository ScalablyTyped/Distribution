package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComboBoxEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ComboBox
  def isDefaultPrevented(): scala.Boolean
}

object ComboBoxEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ComboBox): ComboBoxEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ComboBoxEvent]
  }
}

