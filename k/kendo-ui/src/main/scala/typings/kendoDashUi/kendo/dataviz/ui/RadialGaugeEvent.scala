package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeEvent extends js.Object {
  var preventDefault: js.Function
  var sender: RadialGauge
  def isDefaultPrevented(): Boolean
}

object RadialGaugeEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: RadialGauge): RadialGaugeEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[RadialGaugeEvent]
  }
}

