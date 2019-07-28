package typings.atIonicCore.distTypesUtilsGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gesture extends js.Object {
  def destroy(): Unit
  def setDisabled(disabled: Boolean): Unit
}

object Gesture {
  @scala.inline
  def apply(destroy: () => Unit, setDisabled: Boolean => Unit): Gesture = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled))
  
    __obj.asInstanceOf[Gesture]
  }
}

