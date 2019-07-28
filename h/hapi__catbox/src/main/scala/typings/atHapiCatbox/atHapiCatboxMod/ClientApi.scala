package typings.atHapiCatbox.atHapiCatboxMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientApi[T] extends js.Object {
  /**
    * drop(key) - remove an item from cache where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def drop(key: CacheKey): js.Promise[Unit]
  /**
    * get(key, callback) - retrieve an item from the cache engine if found where:
    *  * key - a cache key object (see [ICacheKey]).
    */
  def get(key: CacheKey): js.Promise[Null | CachedObject[T]]
  /** isReady() - returns true if cache engine determines itself as ready, false if it is not ready. */
  def isReady(): Boolean
  /**
    * set(key, value, ttl) - store an item in the cache for a specified length of time, where:
    *  * key - a cache key object (see [ICacheKey]).
    *  * value - the string or object value to be stored.
    *  * ttl - a time-to-live value in milliseconds after which the item is automatically removed from the cache (or is marked invalid).
    */
  def set(key: CacheKey, value: T, ttl: Double): js.Promise[Unit]
  /** start() - creates a connection to the cache server. Must be called before any other method is available. */
  def start(): js.Promise[Unit]
  /** stop() - terminates the connection to the cache server. */
  def stop(): Unit
  /** validateSegmentName(segment) - returns null if the segment name is valid (see below), otherwise should return an instance of Error with an appropriate message. */
  def validateSegmentName(segment: String): Null | Error
}

object ClientApi {
  @scala.inline
  def apply[T](
    drop: CacheKey => js.Promise[Unit],
    get: CacheKey => js.Promise[Null | CachedObject[T]],
    isReady: () => Boolean,
    set: (CacheKey, T, Double) => js.Promise[Unit],
    start: () => js.Promise[Unit],
    stop: () => Unit,
    validateSegmentName: String => Null | Error
  ): ClientApi[T] = {
    val __obj = js.Dynamic.literal(drop = js.Any.fromFunction1(drop), get = js.Any.fromFunction1(get), isReady = js.Any.fromFunction0(isReady), set = js.Any.fromFunction3(set), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), validateSegmentName = js.Any.fromFunction1(validateSegmentName))
  
    __obj.asInstanceOf[ClientApi[T]]
  }
}

