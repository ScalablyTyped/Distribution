package typings.kendoDashUi.kendo.mobile.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetailButtonEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DetailButton
  def isDefaultPrevented(): Boolean
}

object DetailButtonEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DetailButton): DetailButtonEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DetailButtonEvent]
  }
}

