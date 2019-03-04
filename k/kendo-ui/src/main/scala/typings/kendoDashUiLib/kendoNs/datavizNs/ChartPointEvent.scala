package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPointEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPoint
  def isDefaultPrevented(): scala.Boolean
}

object ChartPointEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ChartPoint): ChartPointEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartPointEvent]
  }
}

