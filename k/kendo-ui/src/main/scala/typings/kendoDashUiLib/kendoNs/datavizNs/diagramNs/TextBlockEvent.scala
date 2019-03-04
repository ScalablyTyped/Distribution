package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextBlockEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TextBlock
  def isDefaultPrevented(): scala.Boolean
}

object TextBlockEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: TextBlock): TextBlockEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TextBlockEvent]
  }
}

