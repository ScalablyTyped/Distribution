package typings
package lruDashCacheLib.lruDashCacheMod.LRUNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[K, V] extends js.Object {
  /**
           * Same as Options.allowStale.
           */
  var allowStale: scala.Boolean = js.native
  /**
           * Return total quantity of objects currently in cache. Note,
           * that `stale` (see options) items are returned as part of this item count.
           */
  val itemCount: scala.Double = js.native
  /**
           * Return total length of objects in cache taking into account `length` options function.
           */
  val length: scala.Double = js.native
  /**
           * Same as Options.max. Resizes the cache when the `max` changes.
           */
  var max: scala.Double = js.native
  /**
           * Same as Options.maxAge. Resizes the cache when the `maxAge` changes.
           */
  var maxAge: scala.Double = js.native
  /**
           * Deletes a key out of the cache.
           */
  def del(key: K): scala.Unit = js.native
  /**
           * Return an array of the cache entries ready for serialization and usage with `destinationCache.load(arr)`.
           */
  def dump(): js.Array[LRUEntry[K, V]] = js.native
  /**
           * Just like `Array.prototype.forEach`. Iterates over all the keys in the cache,
           * in order of recent-ness. (Ie, more recently used items are iterated over first.)
           */
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Just like `Array.prototype.forEach`. Iterates over all the keys in the cache,
           * in order of recent-ness. (Ie, more recently used items are iterated over first.)
           */
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit],
    thisArg: T
  ): scala.Unit = js.native
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
  def has(key: K): scala.Boolean = js.native
  /**
           * Return an array of the keys in the cache.
           */
  def keys(): js.Array[K] = js.native
  /**
           * Same as Options.length.
           */
  def lengthCalculator(value: V): scala.Double = js.native
  /**
           * Loads another cache entries array, obtained with `sourceCache.dump()`,
           * into the cache. The destination cache is reset before loading new entries
           *
           * @param cacheEntries Obtained from `sourceCache.dump()`
           */
  def load(cacheEntries: js.Array[LRUEntry[K, V]]): scala.Unit = js.native
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
  def prune(): scala.Unit = js.native
  /**
           * Clear the cache entirely, throwing away all values.
           */
  def reset(): scala.Unit = js.native
  /**
           * The same as `cache.forEach(...)` but items are iterated over in reverse order.
           * (ie, less recently used items are iterated over first.)
           */
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /**
           * The same as `cache.forEach(...)` but items are iterated over in reverse order.
           * (ie, less recently used items are iterated over first.)
           */
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, scala.Unit],
    thisArg: T
  ): scala.Unit = js.native
  /**
           * Will update the "recently used"-ness of the key. They do what you think.
           * `maxAge` is optional and overrides the cache `maxAge` option if provided.
           */
  def set(key: K, value: V): scala.Boolean = js.native
  /**
           * Will update the "recently used"-ness of the key. They do what you think.
           * `maxAge` is optional and overrides the cache `maxAge` option if provided.
           */
  def set(key: K, value: V, maxAge: scala.Double): scala.Boolean = js.native
  /**
           * Return an array of the values in the cache.
           */
  def values(): js.Array[V] = js.native
}

