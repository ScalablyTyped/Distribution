package typings.jqueryDeferred.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Any = js.native
  def disable(): js.Any = js.native
  def disabled(): Boolean = js.native
  def empty(): js.Any = js.native
  def fire(arguments: js.Any*): js.Any = js.native
  def fireWith(context: js.Any, args: js.Any*): js.Any = js.native
  def fired(): Boolean = js.native
  def has(callback: js.Any): Boolean = js.native
  def lock(): js.Any = js.native
  def locked(): Boolean = js.native
  def remove(callbacks: js.Any*): js.Any = js.native
}

object JQueryCallback {
  @scala.inline
  def apply(
    add: /* repeated */ js.Any => js.Any,
    disable: () => js.Any,
    disabled: () => Boolean,
    empty: () => js.Any,
    fire: /* repeated */ js.Any => js.Any,
    fireWith: (js.Any, /* repeated */ js.Any) => js.Any,
    fired: () => Boolean,
    has: js.Any => Boolean,
    lock: () => js.Any,
    locked: () => Boolean,
    remove: /* repeated */ js.Any => js.Any
  ): JQueryCallback = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), disable = js.Any.fromFunction0(disable), disabled = js.Any.fromFunction0(disabled), empty = js.Any.fromFunction0(empty), fire = js.Any.fromFunction1(fire), fireWith = js.Any.fromFunction2(fireWith), fired = js.Any.fromFunction0(fired), has = js.Any.fromFunction1(has), lock = js.Any.fromFunction0(lock), locked = js.Any.fromFunction0(locked), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[JQueryCallback]
  }
  @scala.inline
  implicit class JQueryCallbackOps[Self <: JQueryCallback] (val x: Self) extends AnyVal {
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
    def setAdd(value: /* repeated */ js.Any => js.Any): Self = this.set("add", js.Any.fromFunction1(value))
    @scala.inline
    def setDisable(value: () => js.Any): Self = this.set("disable", js.Any.fromFunction0(value))
    @scala.inline
    def setDisabled(value: () => Boolean): Self = this.set("disabled", js.Any.fromFunction0(value))
    @scala.inline
    def setEmpty(value: () => js.Any): Self = this.set("empty", js.Any.fromFunction0(value))
    @scala.inline
    def setFire(value: /* repeated */ js.Any => js.Any): Self = this.set("fire", js.Any.fromFunction1(value))
    @scala.inline
    def setFireWith(value: (js.Any, /* repeated */ js.Any) => js.Any): Self = this.set("fireWith", js.Any.fromFunction2(value))
    @scala.inline
    def setFired(value: () => Boolean): Self = this.set("fired", js.Any.fromFunction0(value))
    @scala.inline
    def setHas(value: js.Any => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setLock(value: () => js.Any): Self = this.set("lock", js.Any.fromFunction0(value))
    @scala.inline
    def setLocked(value: () => Boolean): Self = this.set("locked", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: /* repeated */ js.Any => js.Any): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

