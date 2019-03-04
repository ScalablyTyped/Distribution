package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Arc
  def isDefaultPrevented(): scala.Boolean
}

object ArcEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Arc): ArcEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ArcEvent]
  }
}

