package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: CustomFilter
  def isDefaultPrevented(): scala.Boolean
}

object CustomFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: CustomFilter): CustomFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[CustomFilterEvent]
  }
}

