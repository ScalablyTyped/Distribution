package typings
package atIonicCoreLib.distTypesUtilsGestureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gesture extends js.Object {
  def destroy(): scala.Unit
  def setDisabled(disabled: scala.Boolean): scala.Unit
}

object Gesture {
  @scala.inline
  def apply(destroy: () => scala.Unit, setDisabled: scala.Boolean => scala.Unit): Gesture = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setDisabled = js.Any.fromFunction1(setDisabled))
  
    __obj.asInstanceOf[Gesture]
  }
}

