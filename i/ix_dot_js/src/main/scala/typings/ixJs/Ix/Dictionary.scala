package typings.ixJs.Ix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ix.Dictionary")
@js.native
class Dictionary[TKey, TValue] () extends js.Object {
  def this(capacity: Double) = this()
  def this(capacity: Double, comparer: EqualityComparer[TKey, TKey]) = this()
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

