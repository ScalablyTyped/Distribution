package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Marker
  def isDefaultPrevented(): scala.Boolean
}

object MarkerEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Marker): MarkerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MarkerEvent]
  }
}

