package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAxisEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartAxis
  def isDefaultPrevented(): scala.Boolean
}

object ChartAxisEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ChartAxis): ChartAxisEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartAxisEvent]
  }
}

