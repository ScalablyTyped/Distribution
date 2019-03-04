package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Size
  def isDefaultPrevented(): scala.Boolean
}

object SizeEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Size): SizeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[SizeEvent]
  }
}

