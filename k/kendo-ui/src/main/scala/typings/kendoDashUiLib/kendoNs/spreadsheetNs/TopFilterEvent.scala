package typings
package kendoDashUiLib.kendoNs.spreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopFilterEvent extends js.Object {
  var preventDefault: js.Function
  var sender: TopFilter
  def isDefaultPrevented(): scala.Boolean
}

object TopFilterEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: TopFilter): TopFilterEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[TopFilterEvent]
  }
}

