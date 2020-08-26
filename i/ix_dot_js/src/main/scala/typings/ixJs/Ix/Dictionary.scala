package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit = js.native
  def clear(): Unit = js.native
  def get(key: TKey): TValue = js.native
  def getValues(): js.Array[TValue] = js.native
  def has(key: TKey): Boolean = js.native
  def length(): Double = js.native
  def remove(key: TKey): Boolean = js.native
  def set(key: TKey, value: TValue): Unit = js.native
  def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]] = js.native
  def tryGetValue(key: TKey): TValue = js.native
}

object Dictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Unit,
    clear: () => Unit,
    get: TKey => TValue,
    getValues: () => js.Array[TValue],
    has: TKey => Boolean,
    length: () => Double,
    remove: TKey => Boolean,
    set: (TKey, TValue) => Unit,
    toEnumerable: () => Enumerable[KeyValuePair[TKey, TValue]],
    tryGetValue: TKey => TValue
  ): Dictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), getValues = js.Any.fromFunction0(getValues), has = js.Any.fromFunction1(has), length = js.Any.fromFunction0(length), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable), tryGetValue = js.Any.fromFunction1(tryGetValue))
    __obj.asInstanceOf[Dictionary[TKey, TValue]]
  }
  @scala.inline
  implicit class DictionaryOps[Self <: Dictionary[_, _], TKey, TValue] (val x: Self with (Dictionary[TKey, TValue])) extends AnyVal {
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
    def setGet(value: TKey => TValue): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValues(value: () => js.Array[TValue]): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def setHas(value: TKey => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: () => Double): Self = this.set("length", js.Any.fromFunction0(value))
    @scala.inline
    def setRemove(value: TKey => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (TKey, TValue) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setToEnumerable(value: () => Enumerable[KeyValuePair[TKey, TValue]]): Self = this.set("toEnumerable", js.Any.fromFunction0(value))
    @scala.inline
    def setTryGetValue(value: TKey => TValue): Self = this.set("tryGetValue", js.Any.fromFunction1(value))
  }
  
}

