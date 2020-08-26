package typings.knockoutDeferredUpdates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Deferred extender
@js.native
trait KnockoutExtenders extends js.Object {
  def deferred(target: js.Any, value: Boolean): js.Any = js.native
}

object KnockoutExtenders {
  @scala.inline
  def apply(deferred: (js.Any, Boolean) => js.Any): KnockoutExtenders = {
    val __obj = js.Dynamic.literal(deferred = js.Any.fromFunction2(deferred))
    __obj.asInstanceOf[KnockoutExtenders]
  }
  @scala.inline
  implicit class KnockoutExtendersOps[Self <: KnockoutExtenders] (val x: Self) extends AnyVal {
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
    def setDeferred(value: (js.Any, Boolean) => js.Any): Self = this.set("deferred", js.Any.fromFunction2(value))
  }
  
}

