package typings
package kendoDashUiLib.kendoNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPathEvent extends js.Object {
  var preventDefault: js.Function
  var sender: MultiPath
  def isDefaultPrevented(): scala.Boolean
}

object MultiPathEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: MultiPath): MultiPathEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[MultiPathEvent]
  }
}

