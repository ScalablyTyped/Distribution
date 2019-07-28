package typings.kendoDashUi.kendoNs.datavizNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEvent extends js.Object {
  var preventDefault: js.Function
  var sender: typings.kendoDashUi.kendoNs.datavizNs.drawingNs.Layout
  def isDefaultPrevented(): Boolean
}

object LayoutEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.datavizNs.drawingNs.Layout
  ): LayoutEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LayoutEvent]
  }
}

