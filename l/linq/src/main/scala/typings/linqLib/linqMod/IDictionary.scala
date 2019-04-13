package typings
package linqLib.linqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): scala.Unit
  def clear(): scala.Unit
  def contains(key: TKey): scala.Boolean
  def count(): scala.Double
  def get(key: TKey): TValue
  def remove(key: TKey): scala.Unit
  def set(key: TKey, value: TValue): scala.Boolean
  def toEnumerable(): IEnumerable[linqLib.Anon_KeyValue[TKey, TValue]]
}

object IDictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => scala.Unit,
    clear: () => scala.Unit,
    contains: TKey => scala.Boolean,
    count: () => scala.Double,
    get: TKey => TValue,
    remove: TKey => scala.Unit,
    set: (TKey, TValue) => scala.Boolean,
    toEnumerable: () => IEnumerable[linqLib.Anon_KeyValue[TKey, TValue]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), contains = js.Any.fromFunction1(contains), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toEnumerable = js.Any.fromFunction0(toEnumerable))
  
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
}

