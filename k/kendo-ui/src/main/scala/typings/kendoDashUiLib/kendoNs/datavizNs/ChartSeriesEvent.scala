package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartSeries
  def isDefaultPrevented(): scala.Boolean
}

object ChartSeriesEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ChartSeries): ChartSeriesEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartSeriesEvent]
  }
}

