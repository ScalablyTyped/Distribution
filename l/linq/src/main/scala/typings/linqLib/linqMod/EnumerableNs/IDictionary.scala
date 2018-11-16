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

