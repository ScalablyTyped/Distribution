package typings
package kendoDashUiLib.kendoNs.datavizNs.mapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtentEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Extent
  def isDefaultPrevented(): scala.Boolean
}

object ExtentEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Extent): ExtentEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[ExtentEvent]
  }
}

