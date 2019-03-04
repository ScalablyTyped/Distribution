package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiSelectEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiSelect
  def isDefaultPrevented(): scala.Boolean
}

object MultiSelectEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: MultiSelect): MultiSelectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MultiSelectEvent]
  }
}

