package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Layout
  def isDefaultPrevented(): scala.Boolean
}

object LayoutEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Layout): LayoutEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[LayoutEvent]
  }
}

