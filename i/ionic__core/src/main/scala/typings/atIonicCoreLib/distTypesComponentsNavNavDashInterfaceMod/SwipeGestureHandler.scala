package typings
package atIonicCoreLib.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeGestureHandler extends js.Object {
  def canStart(): scala.Boolean
  def onEnd(shouldComplete: scala.Boolean): scala.Unit
  def onStart(): scala.Unit
}

object SwipeGestureHandler {
  @scala.inline
  def apply(canStart: () => scala.Boolean, onEnd: scala.Boolean => scala.Unit, onStart: () => scala.Unit): SwipeGestureHandler = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction0(onStart))
  
    __obj.asInstanceOf[SwipeGestureHandler]
  }
}

