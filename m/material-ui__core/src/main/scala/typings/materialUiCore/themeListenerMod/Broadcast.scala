package typings.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Broadcast[S] extends js.Object {
  def getState(): S = js.native
  def setState(state: S): Unit = js.native
  def subscribe(callback: js.Function1[/* state */ S, Unit]): Double = js.native
  def unsubscribe(subscriptionId: Double): Unit = js.native
}

object Broadcast {
  @scala.inline
  def apply[S](
    getState: () => S,
    setState: S => Unit,
    subscribe: js.Function1[/* state */ S, Unit] => Double,
    unsubscribe: Double => Unit
  ): Broadcast[S] = {
    val __obj = js.Dynamic.literal(getState = js.Any.fromFunction0(getState), setState = js.Any.fromFunction1(setState), subscribe = js.Any.fromFunction1(subscribe), unsubscribe = js.Any.fromFunction1(unsubscribe))
  
    __obj.asInstanceOf[Broadcast[S]]
  }
}

