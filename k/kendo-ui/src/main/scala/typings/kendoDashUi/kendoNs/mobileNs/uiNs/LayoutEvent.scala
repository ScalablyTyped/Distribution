package typings.kendoDashUi.kendoNs.mobileNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEvent extends js.Object {
  var preventDefault: js.Function
  var sender: typings.kendoDashUi.kendoNs.mobileNs.uiNs.Layout
  def isDefaultPrevented(): Boolean
}

object LayoutEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: () => Boolean,
    preventDefault: js.Function,
    sender: typings.kendoDashUi.kendoNs.mobileNs.uiNs.Layout
  ): LayoutEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LayoutEvent]
  }
}

