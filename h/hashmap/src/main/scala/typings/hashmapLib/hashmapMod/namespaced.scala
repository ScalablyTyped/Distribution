package typings
package hashmapLib.hashmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashmap", JSImport.Namespace)
@js.native
/**
  * Creates an empty hashmap.
  */
class namespaced[TKey, TValue] () extends HashMap[TKey, TValue] {
  /**
    * Creates a hashmap with several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    */
  def this(keysAndValues: (TKey | TValue)*) = this()
  /**
    * Creates a hashmap with the key-value pairs of map.
    *
    * @param map
    */
  def this(map: HashMap[TKey, TValue]) = this()
  /**
    * Clears hashmap.
    *
    * @return Self.
    */
  /* CompleteClass */
  override def clear(): HashMap[TKey, TValue] = js.native
  /**
    * Copy all key-value pairs from other to this instance.
    *
    * @param map Other map.
    * @return Self.
    */
  /* CompleteClass */
  override def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue] = js.native
  /**
    * Returns size of hashmap (number of entries).
    *
    * @return Number of entries in hashmap.
    */
  /* CompleteClass */
  override def count(): scala.Double = js.native
  /**
    * Iterates over hashmap.
    *
    * @param callback Function to be invoked for every hashmap entry.
    * @return Self.
    */
  /* CompleteClass */
  override def forEach(callback: js.Function2[TValue, TKey, scala.Unit]): HashMap[TKey, TValue] = js.native
  /**
    * Return value from hashmap.
    *
    * @param key Key.
    * @return Value stored under given key.
    */
  /* CompleteClass */
  override def get(key: TKey): TValue = js.native
  /**
    * Checks if given key exists in hashmap.
    *
    * @param key Key.
    * @return Whether given key exists in hashmap.
    */
  /* CompleteClass */
  override def has(key: TKey): scala.Boolean = js.native
  /**
    * Returns all contained keys.
    *
    * @return List of keys.
    */
  /* CompleteClass */
  override def keys(): js.Array[TKey] = js.native
  /**
    * Store several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    * @return Self.
    */
  /* CompleteClass */
  override def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue] = js.native
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    */
  /* CompleteClass */
  override def remove(key: TKey): HashMap[TKey, TValue] = js.native
  /**
    * Returns key under which given value is stored.
    *
    * @param value Value.
    * @return Key which is assigned to value stored.
    */
  /* CompleteClass */
  override def search(value: TValue): TKey = js.native
  /**
    * Store value in hashmap.
    *
    * @param key Key.
    * @param value Value.
    * @return Self.
    */
  /* CompleteClass */
  override def set(key: TKey, value: TValue): HashMap[TKey, TValue] = js.native
  /**
    * Returns all container values.
    *
    * @return List of values.
    */
  /* CompleteClass */
  override def values(): js.Array[TValue] = js.native
}

