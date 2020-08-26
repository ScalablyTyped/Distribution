package typings.linq.mod

import typings.linq.anon.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit = js.native
  def clear(): Unit = js.native
  def contains(key: TKey): Boolean = js.native
  def count(): Double = js.native
  def get(key: TKey): TValue = js.native
  def remove(key: TKey): Unit = js.native
  def set(key: TKey, value: TValue): Boolean = js.native
  def toEnumerable(): IEnumerable[Value[TKey, TValue]] = js.native
}

object IDictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Unit,
    clear: () => Unit,
    contains: TKey => Boolean,
    count: () => Double,
    get: TKey => TValue,
    remove: TKey => Unit,
    set: (TKey, TValue) => Boolean,
    toEnumerable: () => IEnumerable[Value[TKey, TValue]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable))
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
  @scala.inline
  implicit class IDictionaryOps[Self <: IDictionary[_, _], TKey, TValue] (val x: Self with (IDictionary[TKey, TValue])) extends AnyVal {
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
    def setAdd(value: (TKey, TValue) => Unit): Self = this.set("add", js.Any.fromFunction2(value))
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setContains(value: TKey => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setCount(value: () => Double): Self = this.set("count", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: TKey => TValue): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: TKey => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (TKey, TValue) => Boolean): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setToEnumerable(value: () => IEnumerable[Value[TKey, TValue]]): Self = this.set("toEnumerable", js.Any.fromFunction0(value))
  }
  
}

