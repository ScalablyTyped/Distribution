package typings
package linqLib.linqMod.EnumerableNs

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
    add: js.Function2[TKey, TValue, scala.Unit],
    clear: js.Function0[scala.Unit],
    contains: js.Function1[TKey, scala.Boolean],
    count: js.Function0[scala.Double],
    get: js.Function1[TKey, TValue],
    remove: js.Function1[TKey, scala.Unit],
    set: js.Function2[TKey, TValue, scala.Boolean],
    toEnumerable: js.Function0[IEnumerable[linqLib.Anon_KeyValue[TKey, TValue]]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal(add = add, clear = clear, contains = contains, count = count, get = get, remove = remove, set = set, toEnumerable = toEnumerable)
  
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
}

