package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Matrix
  def isDefaultPrevented(): scala.Boolean
}

object MatrixEvent {
  @scala.inline
  def apply(isDefaultPrevented: js.Function0[scala.Boolean], preventDefault: js.Function, sender: Matrix): MatrixEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented, preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MatrixEvent]
  }
}

