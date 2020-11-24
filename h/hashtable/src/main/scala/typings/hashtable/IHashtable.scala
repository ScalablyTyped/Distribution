package typings.hashtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHashtable[TKey, TValue] extends js.Object {
  
  def clear(): Unit = js.native
  
  def containsKey(key: TKey): Boolean = js.native
  
  def containsValue(value: TValue): Boolean = js.native
  
  def each(callback: js.Function2[/* key */ TKey, /* value */ TValue, Unit]): Unit = js.native
  
  def entries(): js.Array[js.Array[_]] = js.native
  
  def equals(hashtable: IHashtable[TKey, TValue]): Boolean = js.native
  
  def get(key: TKey): TValue = js.native
  
  def isEmpty(): Boolean = js.native
  
  def keys(): js.Array[TKey] = js.native
  
  def put(key: TKey, value: TValue): TValue = js.native
  
  def putAll(hashtable: IHashtable[TKey, TValue]): Unit = js.native
  def putAll(
    hashtable: IHashtable[TKey, TValue],
    conflictCallback: js.Function3[/* key */ TKey, /* thisValue */ TValue, /* value */ TValue, TValue]
  ): Unit = js.native
  
  def remove(key: TKey): TValue = js.native
  
  def size(): Double = js.native
  
  def toQueryString(): String = js.native
  
  def values(): js.Array[TValue] = js.native
}
