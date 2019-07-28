package typings.kendoDashUi.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPointEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPoint
  def isDefaultPrevented(): Boolean
}

object ChartPointEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartPoint): ChartPointEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartPointEvent]
  }
}

