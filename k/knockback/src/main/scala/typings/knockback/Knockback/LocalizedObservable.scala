package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedObservable extends js.Object {
  def destroy(): js.Any = js.native
  def observedValue(value: js.Any): js.Any = js.native
  def resetToCurrent(): js.Any = js.native
}

object LocalizedObservable {
  @scala.inline
  def apply(destroy: () => js.Any, observedValue: js.Any => js.Any, resetToCurrent: () => js.Any): LocalizedObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), observedValue = js.Any.fromFunction1(observedValue), resetToCurrent = js.Any.fromFunction0(resetToCurrent))
    __obj.asInstanceOf[LocalizedObservable]
  }
  @scala.inline
  implicit class LocalizedObservableOps[Self <: LocalizedObservable] (val x: Self) extends AnyVal {
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
    def setDestroy(value: () => js.Any): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setObservedValue(value: js.Any => js.Any): Self = this.set("observedValue", js.Any.fromFunction1(value))
    @scala.inline
    def setResetToCurrent(value: () => js.Any): Self = this.set("resetToCurrent", js.Any.fromFunction0(value))
  }
  
}

