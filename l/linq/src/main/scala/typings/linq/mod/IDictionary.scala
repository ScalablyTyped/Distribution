package typings.linq.mod

import typings.linq.AnonKeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit
  def clear(): Unit
  def contains(key: TKey): Boolean
  def count(): Double
  def get(key: TKey): TValue
  def remove(key: TKey): Unit
  def set(key: TKey, value: TValue): Boolean
  def toEnumerable(): IEnumerable[AnonKeyValue[TKey, TValue]]
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
    toEnumerable: () => IEnumerable[AnonKeyValue[TKey, TValue]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable))
  
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
}

