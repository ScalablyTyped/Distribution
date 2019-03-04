package typings
package kendoDashUiLib.kendoNs.datavizNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Rect
  def isDefaultPrevented(): scala.Boolean
}

object RectEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Rect): RectEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[RectEvent]
  }
}

