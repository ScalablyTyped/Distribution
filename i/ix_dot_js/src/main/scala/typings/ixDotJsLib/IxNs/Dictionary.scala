package typings
package ixDotJsLib.IxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ix.Dictionary")
@js.native
class Dictionary[TKey, TValue] () extends js.Object {
  def this(capacity: scala.Double) = this()
  def this(capacity: scala.Double, comparer: EqualityComparer[TKey, TKey]) = this()
  def add(key: TKey, value: TValue): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def get(key: TKey): TValue = js.native
  def getValues(): js.Array[TValue] = js.native
  def has(key: TKey): scala.Boolean = js.native
  def length(): scala.Double = js.native
  def remove(key: TKey): scala.Boolean = js.native
  def set(key: TKey, value: TValue): scala.Unit = js.native
  def toEnumerable(): Enumerable[KeyValuePair[TKey, TValue]] = js.native
  def tryGetValue(key: TKey): TValue = js.native
}

