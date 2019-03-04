package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Group
  def isDefaultPrevented(): scala.Boolean
}

object GroupEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Group): GroupEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[GroupEvent]
  }
}

