package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Connection
  def isDefaultPrevented(): scala.Boolean
}

object ConnectionEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Connection): ConnectionEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ConnectionEvent]
  }
}

