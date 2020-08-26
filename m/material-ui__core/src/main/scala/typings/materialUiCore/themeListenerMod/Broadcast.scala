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
  @scala.inline
  implicit class BroadcastOps[Self <: Broadcast[_], S] (val x: Self with Broadcast[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetState(value: () => S): Self = this.set("getState", js.Any.fromFunction0(value))
    @scala.inline
    def setSetState(value: S => Unit): Self = this.set("setState", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribe(value: js.Function1[/* state */ S, Unit] => Double): Self = this.set("subscribe", js.Any.fromFunction1(value))
    @scala.inline
    def setUnsubscribe(value: Double => Unit): Self = this.set("unsubscribe", js.Any.fromFunction1(value))
  }
  
}

