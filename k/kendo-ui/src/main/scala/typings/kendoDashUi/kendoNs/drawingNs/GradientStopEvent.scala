package typings.kendoDashUi.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradientStopEvent extends js.Object {
  var preventDefault: js.Function
  var sender: GradientStop
  def isDefaultPrevented(): Boolean
}

object GradientStopEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: GradientStop): GradientStopEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[GradientStopEvent]
  }
}

