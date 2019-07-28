package typings.lscache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LSCache extends js.Object {
  /**
    * Enable/Disable warning if set fails
    * @param {boolean} enabled
    */
  def enableWarnings(enabled: Boolean): Unit = js.native
  /**
    * Flushes all lscache items and expiry markers without affecting rest of localStorage
    */
  def flush(): Unit = js.native
  /**
    * Flushes expired lscache items and expiry markers without affecting rest of localStorage
    */
  def flushExpired(): Unit = js.native
  /**
    * Retrieves specified value from localStorage, if not expired.
    * @param {string} key
    * @return {string|Object}
    */
  def get(key: String): js.Any = js.native
  /**
    * Removes a value from localStorage.
    * Equivalent to 'delete' in memcache, but that's a keyword in JS.
    * @param {string} key
    */
  def remove(key: String): Unit = js.native
  /**
    * Resets the string being appended to CACHE_PREFIX so lscache will use the default storage behavior.
    */
  def resetBucket(): Unit = js.native
  /**
    * Stores the value in localStorage. Expires after specified number of minutes.
    * @param {string} key
    * @param {Object|string} value
    * @param {number} time
    */
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, time: Double): Unit = js.native
  /**
    * Appends CACHE_PREFIX so lscache will partition data in to different buckets.
    * @param {string} bucket
    */
  def setBucket(bucket: String): Unit = js.native
  /**
    * Test if the current browser supports localStorage
    * @return {boolean} true if supported else false
    */
  def supported(): Boolean = js.native
}

