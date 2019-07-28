package typings.kendoDashUi.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartSeries
  def isDefaultPrevented(): Boolean
}

object ChartSeriesEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ChartSeries): ChartSeriesEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartSeriesEvent]
  }
}

