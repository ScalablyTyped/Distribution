package typings
package jsforceLib.cacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsforce/cache", "Cache")
@js.native
class Cache () extends js.Object {
  /**
    * Clear cache entries prefix matching given key
    * @param key Key prefix of cache entry to clear
    */
  def clear(): scala.Unit = js.native
  def clear(key: java.lang.String): scala.Unit = js.native
  /**
    * Retrieve cache entry, or create if not exists
    * @param key Key of cache entry
    */
  def get[T](): CacheEntry[T] = js.native
  def get[T](key: java.lang.String): CacheEntry[T] = js.native
}

