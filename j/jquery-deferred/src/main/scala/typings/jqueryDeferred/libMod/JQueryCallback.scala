package typings.jqueryDeferred.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Any
  def disable(): js.Any
  def disabled(): Boolean
  def empty(): js.Any
  def fire(arguments: js.Any*): js.Any
  def fireWith(context: js.Any, args: js.Any*): js.Any
  def fired(): Boolean
  def has(callback: js.Any): Boolean
  def lock(): js.Any
  def locked(): Boolean
  def remove(callbacks: js.Any*): js.Any
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
}

