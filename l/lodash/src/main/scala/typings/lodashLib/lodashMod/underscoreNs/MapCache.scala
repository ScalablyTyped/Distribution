package typings
package lodashLib.lodashMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a cache object to store key/value pairs.
  */
trait MapCache extends js.Object {
  /**
    * Removes all key-value entries from the map.
    */
  var clear: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Removes `key` and its value from the cache.
    * @param key The key of the value to remove.
    * @return Returns `true` if the entry was removed successfully, else `false`.
    */
  def delete(key: js.Any): scala.Boolean
  /**
    * Gets the cached value for `key`.
    * @param key The key of the value to get.
    * @return Returns the cached value.
    */
  def get(key: js.Any): js.Any
  /**
    * Checks if a cached value for `key` exists.
    * @param key The key of the entry to check.
    * @return Returns `true` if an entry for `key` exists, else `false`.
    */
  def has(key: js.Any): scala.Boolean
  /**
    * Sets `value` to `key` of the cache.
    * @param key The key of the value to cache.
    * @param value The value to cache.
    * @return Returns the cache object.
    */
  def set(key: js.Any, value: js.Any): this.type
}

object MapCache {
  @scala.inline
  def apply(
    delete: js.Function1[js.Any, scala.Boolean],
    get: js.Function1[js.Any, js.Any],
    has: js.Function1[js.Any, scala.Boolean],
    set: js.Function2[js.Any, js.Any, MapCache],
    clear: js.Function0[scala.Unit] = null
  ): MapCache = {
    val __obj = js.Dynamic.literal(delete = delete, get = get, has = has, set = set)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    __obj.asInstanceOf[MapCache]
  }
}

