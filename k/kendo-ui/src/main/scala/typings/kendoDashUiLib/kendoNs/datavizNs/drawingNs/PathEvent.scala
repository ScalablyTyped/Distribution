package typings
package kendoDashUiLib.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Path
  def isDefaultPrevented(): scala.Boolean
}

object PathEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Path): PathEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[PathEvent]
  }
}

