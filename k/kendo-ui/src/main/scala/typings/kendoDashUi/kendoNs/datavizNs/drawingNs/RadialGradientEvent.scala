package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGradientEvent extends js.Object {
  var preventDefault: js.Function
  var sender: RadialGradient
  def isDefaultPrevented(): Boolean
}

object RadialGradientEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: RadialGradient): RadialGradientEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[RadialGradientEvent]
  }
}

