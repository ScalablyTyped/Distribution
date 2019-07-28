package typings.atIonicCore.distTypesComponentsNavNavDashInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwipeGestureHandler extends js.Object {
  def canStart(): Boolean
  def onEnd(shouldComplete: Boolean): Unit
  def onStart(): Unit
}

object SwipeGestureHandler {
  @scala.inline
  def apply(canStart: () => Boolean, onEnd: Boolean => Unit, onStart: () => Unit): SwipeGestureHandler = {
    val __obj = js.Dynamic.literal(canStart = js.Any.fromFunction0(canStart), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction0(onStart))
  
    __obj.asInstanceOf[SwipeGestureHandler]
  }
}

