package typings.kendoDashUi.kendo.dataviz.map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Extent
  def isDefaultPrevented(): Boolean
}

object ExtentEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Extent): ExtentEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ExtentEvent]
  }
}

