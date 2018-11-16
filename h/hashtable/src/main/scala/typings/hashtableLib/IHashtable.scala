package typings
package hashtableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHashtable[TKey, TValue] extends js.Object {
  def clear(): scala.Unit = js.native
  def containsKey(key: TKey): scala.Boolean = js.native
  def containsValue(value: TValue): scala.Boolean = js.native
  def each(callback: js.Function2[/* key */ TKey, /* value */ TValue, scala.Unit]): scala.Unit = js.native
  def entries(): js.Array[js.Array[_]] = js.native
  def equals(hashtable: IHashtable[TKey, TValue]): scala.Boolean = js.native
  def get(key: TKey): TValue = js.native
  def isEmpty(): scala.Boolean = js.native
  def keys(): js.Array[TKey] = js.native
  def put(key: TKey, value: TValue): TValue = js.native
  def putAll(hashtable: IHashtable[TKey, TValue]): scala.Unit = js.native
  def putAll(
    hashtable: IHashtable[TKey, TValue],
    conflictCallback: js.Function3[/* key */ TKey, /* thisValue */ TValue, /* value */ TValue, TValue]
  ): scala.Unit = js.native
  def remove(key: TKey): TValue = js.native
  def size(): scala.Double = js.native
  def toQueryString(): java.lang.String = js.native
  def values(): js.Array[TValue] = js.native
}

