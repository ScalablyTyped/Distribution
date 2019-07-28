package typings.kendoDashUi.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEvent extends js.Object {
  var preventDefault: js.Function
  var sender: typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Layout
  def isDefaultPrevented(): Boolean
}

object LayoutEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.datavizNs.diagramNs.Layout
  ): LayoutEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LayoutEvent]
  }
}

