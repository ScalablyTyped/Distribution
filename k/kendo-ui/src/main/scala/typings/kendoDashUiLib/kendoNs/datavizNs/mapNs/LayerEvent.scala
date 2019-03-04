package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Layer
  def isDefaultPrevented(): scala.Boolean
}

object LayerEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Layer): LayerEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LayerEvent]
  }
}

