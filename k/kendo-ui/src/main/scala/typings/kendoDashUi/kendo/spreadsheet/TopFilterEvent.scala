package typings.kendoDashUi.kendo.spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TopFilter
  def isDefaultPrevented(): Boolean
}

object TopFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: TopFilter): TopFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TopFilterEvent]
  }
}

