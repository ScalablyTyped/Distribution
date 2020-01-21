package typings.lruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LRUCache[K, V] extends js.Object {
  /**
    * Same as Options.allowStale.
    */
  var allowStale: Boolean = js.native
  /**
    * Return total quantity of objects currently in cache. Note,
    * that `stale` (see options) items are returned as part of this item count.
    */
  val itemCount: Double = js.native
  /**
    * Return total length of objects in cache taking into account `length` options function.
    */
  val length: Double = js.native
  /**
    * Same as Options.max. Resizes the cache when the `max` changes.
    */
  var max: Double = js.native
  /**
    * Same as Options.maxAge. Resizes the cache when the `maxAge` changes.
    */
  var maxAge: Double = js.native
  /**
    * Deletes a key out of the cache.
    */
  def del(key: K): Unit = js.native
  /**
    * Return an array of the cache entries ready for serialization and usage with `destinationCache.load(arr)`.
    */
  def dump(): js.Array[Entry[K, V]] = js.native
  /**
    * Just like `Array.prototype.forEach`. Iterates over all the keys in the cache,
    * in order of recent-ness. (Ie, more recently used items are iterated over first.)
    */
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit]
  ): Unit = js.native
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit],
    thisArg: T
  ): Unit = js.native
  /**
    * Will update the "recently used"-ness of the key. They do what you think.
    * `maxAge` is optional and overrides the cache `maxAge` option if provided.
    *
    * If the key is not found, will return `undefined`.
    */
  def get(key: K): js.UndefOr[V] = js.native
  /**
    * Check if a key is in the cache, without updating the recent-ness
    * or deleting it for being stale.
    */
  def has(key: K): Boolean = js.native
  /**
    * Return an array of the keys in the cache.
    */
  def keys(): js.Array[K] = js.native
  /**
    * Same as Options.length.
    */
  def lengthCalculator(value: V): Double = js.native
  /**
    * Loads another cache entries array, obtained with `sourceCache.dump()`,
    * into the cache. The destination cache is reset before loading new entries
    *
    * @param cacheEntries Obtained from `sourceCache.dump()`
    */
  def load(cacheEntries: js.Array[Entry[K, V]]): Unit = js.native
  /**
    * Returns the key value (or `undefined` if not found) without updating
    * the "recently used"-ness of the key.
    *
    * (If you find yourself using this a lot, you might be using the wrong
    * sort of data structure, but there are some use cases where it's handy.)
    */
  def peek(key: K): js.UndefOr[V] = js.native
  /**
    * Manually iterates over the entire cache proactively pruning old entries.
    */
  def prune(): Unit = js.native
  /**
    * Clear the cache entirely, throwing away all values.
    */
  def reset(): Unit = js.native
  /**
    * The same as `cache.forEach(...)` but items are iterated over in reverse order.
    * (ie, less recently used items are iterated over first.)
    */
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit]
  ): Unit = js.native
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit],
    thisArg: T
  ): Unit = js.native
  /**
    * Will update the "recently used"-ness of the key. They do what you think.
    * `maxAge` is optional and overrides the cache `maxAge` option if provided.
    */
  def set(key: K, value: V): Boolean = js.native
  def set(key: K, value: V, maxAge: Double): Boolean = js.native
  /**
    * Return an array of the values in the cache.
    */
  def values(): js.Array[V] = js.native
}

