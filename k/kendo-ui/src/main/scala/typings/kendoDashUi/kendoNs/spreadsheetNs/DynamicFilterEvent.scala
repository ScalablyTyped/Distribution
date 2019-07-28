package typings.kendoDashUi.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: DynamicFilter
  def isDefaultPrevented(): Boolean
}

object DynamicFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: DynamicFilter): DynamicFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[DynamicFilterEvent]
  }
}

