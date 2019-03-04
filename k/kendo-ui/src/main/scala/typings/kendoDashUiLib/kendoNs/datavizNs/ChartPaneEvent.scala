package typings
package kendoDashUiLib.kendoNs.datavizNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartPaneEvent extends js.Object {
  var preventDefault: js.Function
  var sender: ChartPane
  def isDefaultPrevented(): scala.Boolean
}

object ChartPaneEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: ChartPane): ChartPaneEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ChartPaneEvent]
  }
}

