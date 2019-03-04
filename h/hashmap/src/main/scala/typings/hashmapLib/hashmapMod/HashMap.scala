package typings
package hashmapLib.hashmapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HashMap[TKey, TValue] extends js.Object {
  /**
    * Clears hashmap.
    *
    * @return Self.
    */
  def clear(): HashMap[TKey, TValue]
  /**
    * Copy all key-value pairs from other to this instance.
    *
    * @param map Other map.
    * @return Self.
    */
  def copy(map: HashMap[TKey, TValue]): HashMap[TKey, TValue]
  /**
    * Returns size of hashmap (number of entries).
    *
    * @return Number of entries in hashmap.
    */
  def count(): scala.Double
  /**
    * Iterates over hashmap.
    *
    * @param callback Function to be invoked for every hashmap entry.
    * @return Self.
    */
  def forEach(callback: js.Function2[/* value */ TValue, /* key */ TKey, scala.Unit]): HashMap[TKey, TValue]
  /**
    * Return value from hashmap.
    *
    * @param key Key.
    * @return Value stored under given key.
    */
  def get(key: TKey): TValue
  /**
    * Checks if given key exists in hashmap.
    *
    * @param key Key.
    * @return Whether given key exists in hashmap.
    */
  def has(key: TKey): scala.Boolean
  /**
    * Returns all contained keys.
    *
    * @return List of keys.
    */
  def keys(): js.Array[TKey]
  /**
    * Store several key-value pairs.
    *
    * @param keysAndValues key1, value1, key2, value2...
    * @return Self.
    */
  def multi(keysAndValues: (TKey | TValue)*): HashMap[TKey, TValue]
  /**
    * Removes given key from hashmap.
    *
    * @param key Key.
    * @return Self.
    */
  def remove(key: TKey): HashMap[TKey, TValue]
  /**
    * Returns key under which given value is stored.
    *
    * @param value Value.
    * @return Key which is assigned to value stored.
    */
  def search(value: TValue): TKey
  /**
    * Store value in hashmap.
    *
    * @param key Key.
    * @param value Value.
    * @return Self.
    */
  def set(key: TKey, value: TValue): HashMap[TKey, TValue]
  /**
    * Returns all container values.
    *
    * @return List of values.
    */
  def values(): js.Array[TValue]
}

object HashMap {
  @scala.inline
  def apply[TKey, TValue](
    clear: js.Function0[HashMap[TKey, TValue]],
    clone: js.Function0[HashMap[TKey, TValue]],
    copy: js.Function1[HashMap[TKey, TValue], HashMap[TKey, TValue]],
    count: js.Function0[scala.Double],
    forEach: js.Function1[
      js.Function2[/* value */ TValue, /* key */ TKey, scala.Unit], 
      HashMap[TKey, TValue]
    ],
    get: js.Function1[TKey, TValue],
    has: js.Function1[TKey, scala.Boolean],
    keys: js.Function0[js.Array[TKey]],
    multi: js.Function1[/* repeated */ TKey | TValue, HashMap[TKey, TValue]],
    remove: js.Function1[TKey, HashMap[TKey, TValue]],
    search: js.Function1[TValue, TKey],
    set: js.Function2[TKey, TValue, HashMap[TKey, TValue]],
    values: js.Function0[js.Array[TValue]]
  ): HashMap[TKey, TValue] = {
    val __obj = js.Dynamic.literal(clear = clear, clone = clone, copy = copy, count = count, forEach = forEach, get = get, has = has, keys = keys, multi = multi, remove = remove, search = search, set = set, values = values)
  
    __obj.asInstanceOf[HashMap[TKey, TValue]]
  }
}

