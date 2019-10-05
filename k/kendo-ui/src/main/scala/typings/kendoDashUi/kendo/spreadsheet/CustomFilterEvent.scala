package typings.kendoDashUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: CustomFilter
  def isDefaultPrevented(): Boolean
}

object CustomFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: CustomFilter): CustomFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[CustomFilterEvent]
  }
}

