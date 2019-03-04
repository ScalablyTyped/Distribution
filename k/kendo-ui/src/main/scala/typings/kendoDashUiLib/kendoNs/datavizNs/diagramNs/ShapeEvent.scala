package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Shape
  def isDefaultPrevented(): scala.Boolean
}

object ShapeEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Shape): ShapeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ShapeEvent]
  }
}

