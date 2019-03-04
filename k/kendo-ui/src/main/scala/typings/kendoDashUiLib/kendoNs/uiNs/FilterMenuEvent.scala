package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMenuEvent extends js.Object {
  var preventDefault: js.Function
  var sender: FilterMenu
  def isDefaultPrevented(): scala.Boolean
}

object FilterMenuEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: FilterMenu): FilterMenuEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[FilterMenuEvent]
  }
}

