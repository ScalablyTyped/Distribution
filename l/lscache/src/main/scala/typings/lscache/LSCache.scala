package typings.lscache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LSCache extends StObject {
  
  /**
    * Sets whether to display warnings when an item is removed from the cache or not.
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
  def get(key: String): Any = js.native
  
  /**
    * @returns {number} The currently set number of milliseconds each time unit represents in
    *   the set() function's "time" argument.
    */
  def getExpiryMilliseconds(): Double = js.native
  
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
    * @return true if the value was inserted successfully
    */
  def set(key: String, value: Any): Boolean = js.native
  def set(key: String, value: Any, time: Double): Boolean = js.native
  
  /**
    * Appends CACHE_PREFIX so lscache will partition data in to different buckets.
    * @param {string} bucket
    */
  def setBucket(bucket: String): Unit = js.native
  
  /**
    * Sets the number of milliseconds each time unit represents in the set() function's
    *   "time" argument.
    * Sample values:
    *  1: each time unit = 1 millisecond
    *  1000: each time unit = 1 second
    *  60000: each time unit = 1 minute (Default value)
    *  360000: each time unit = 1 hour
    * @param {number} milliseconds
    */
  def setExpiryMilliseconds(milliseconds: Double): Unit = js.native
  
  /**
    * Returns whether local storage is supported.
    * Currently exposed for testing purposes.
    * @return {boolean}
    */
  def supported(): Boolean = js.native
}
