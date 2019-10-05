package typings.kendoDashUi.kendo.geometry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatrixEvent extends js.Object {
  var preventDefault: js.Function
  var sender: Matrix
  def isDefaultPrevented(): Boolean
}

object MatrixEvent {
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: Matrix): MatrixEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault, sender = sender)
  
    __obj.asInstanceOf[MatrixEvent]
  }
}

