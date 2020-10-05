package typings.materialUiCore.themeListenerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThemeListener[S] extends js.Object {
  def initial(context: MuiContext[S]): S | Null = js.native
  def subscribe(context: MuiContext[S], callback: js.Function1[/* state */ S, Unit]): Double | Null = js.native
  def unsubscribe(context: MuiContext[S], subscriptionId: Double): Unit = js.native
}

object ThemeListener {
  @scala.inline
  def apply[S](
    initial: MuiContext[S] => S | Null,
    subscribe: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null,
    unsubscribe: (MuiContext[S], Double) => Unit
  ): ThemeListener[S] = {
    val __obj = js.Dynamic.literal(initial = js.Any.fromFunction1(initial), subscribe = js.Any.fromFunction2(subscribe), unsubscribe = js.Any.fromFunction2(unsubscribe))
    __obj.asInstanceOf[ThemeListener[S]]
  }
  @scala.inline
  implicit class ThemeListenerOps[Self <: ThemeListener[_], S] (val x: Self with ThemeListener[S]) extends AnyVal {
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
    def setInitial(value: MuiContext[S] => S | Null): Self = this.set("initial", js.Any.fromFunction1(value))
    @scala.inline
    def setSubscribe(value: (MuiContext[S], js.Function1[/* state */ S, Unit]) => Double | Null): Self = this.set("subscribe", js.Any.fromFunction2(value))
    @scala.inline
    def setUnsubscribe(value: (MuiContext[S], Double) => Unit): Self = this.set("unsubscribe", js.Any.fromFunction2(value))
  }
  
}

