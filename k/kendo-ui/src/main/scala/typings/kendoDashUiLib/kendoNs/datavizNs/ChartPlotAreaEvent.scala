package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPlotAreaEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPlotArea
  def isDefaultPrevented(): scala.Boolean
}

object ChartPlotAreaEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: js.Function0[scala.Boolean],
    preventDefault: js.Function,
    sender: ChartPlotArea
  ): ChartPlotAreaEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartPlotAreaEvent]
  }
}

