package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit
  def clear(): Unit
  def get(key: TKey): TValue
  def getValues(): js.Array[TValue]
  def has(key: TKey): Boolean
  def length(): Double
  def remove(key: TKey): Boolean
  def set(key: TKey, value: TValue): Unit
  def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]]
  def tryGetValue(key: TKey): TValue
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
}

