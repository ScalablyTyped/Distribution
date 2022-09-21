package typings.lruCache.mod

import typings.std.Generator
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LRUCache[K, V]
  extends StObject
     with Iterable[js.Tuple2[K, V]] {
  
  val allowStale: Boolean = js.native
  
  /**
    * The total size of items in cache when using size tracking.
    */
  val calculatedSize: Double = js.native
  
  /**
    * Clear the cache entirely, throwing away all values.
    */
  def clear(): Unit = js.native
  
  /**
    * Deletes a key out of the cache.
    *
    * @deprecated since 7.0 use delete() instead
    */
  def del(key: K): Boolean = js.native
  
  /**
    * Deletes a key out of the cache.
    * Returns true if the key was deleted, false otherwise.
    */
  def delete(key: K): Boolean = js.native
  
  def dispose(value: V, key: K, reason: DisposeReason): Unit = js.native
  
  /**
    * @since 7.4.0
    */
  val disposeAfter: (Disposer[K, V]) | Null = js.native
  
  /**
    * Return an array of [key, entry] objects which can be passed to
    * cache.load()
    */
  def dump(): js.Array[js.Tuple2[K, Entry[V]]] = js.native
  
  /**
    * Return a generator yielding `[key, value]` pairs,
    * in order from most recently used to least recently used.
    */
  def entries(): Generator[js.Tuple2[K, V], Any, Any] = js.native
  
  /**
    * since: 7.6.0
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def fetch[ExpectedValue](key: K): js.Promise[js.UndefOr[ExpectedValue]] = js.native
  def fetch[ExpectedValue](key: K, options: FetchOptions[K, V]): js.Promise[js.UndefOr[ExpectedValue]] = js.native
  
  /**
    * @since 7.6.0
    */
  val fetchMethod: (Fetcher[K, V]) | Null = js.native
  
  /**
    * Find a value for which the supplied fn method returns a truthy value,
    * similar to Array.find().  fn is called as fn(value, key, cache).
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def find[T](
    callbackFn: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, js.UndefOr[Boolean | Unit]]
  ): T = js.native
  def find[T](
    callbackFn: js.Function3[/* value */ V, /* key */ K, /* cache */ this.type, js.UndefOr[Boolean | Unit]],
    options: GetOptions
  ): T = js.native
  
  /**
    * Call the supplied function on each item in the cache, in order from
    * most recently used to least recently used.  fn is called as
    * fn(value, key, cache).  Does not update age or recenty of use.
    */
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit]
  ): Unit = js.native
  def forEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit],
    thisArg: T
  ): Unit = js.native
  
  /**
    * Return a value from the cache.
    * Will update the recency of the cache entry found.
    * If the key is not found, `get()` will return `undefined`.
    * This can be confusing when setting values specifically to `undefined`,
    * as in `cache.set(key, undefined)`. Use `cache.has()` to determine
    * whether a key is present in the cache at all.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def get[T](key: K): js.UndefOr[T] = js.native
  def get[T](key: K, options: GetOptions): js.UndefOr[T] = js.native
  
  /**
    * since: 7.6.0
    */
  def getRemainingTTL(key: K): Double = js.native
  
  /**
    * Check if a key is in the cache, without updating the recency of use.
    * Will return false if the item is stale, even though it is technically
    * in the cache.
    * Will not update item age unless `updateAgeOnHas` is set in the options
    * or constructor.
    */
  def has(key: K): Boolean = js.native
  def has(key: K, options: HasOptions): Boolean = js.native
  
  /**
    * Return a generator yielding the keys in the cache,
    * in order from most recently used to least recently used.
    */
  def keys(): Generator[K, Any, Any] = js.native
  
  /**
    * Number of items in the cache.
    * Alias for `cache.size`
    *
    * @deprecated since 7.0 use `cache.size` instead
    */
  val length: Double = js.native
  
  /**
    * Reset the cache and load in the items in entries in the order listed.
    * Note that the shape of the resulting cache may be different if the
    * same options are not used in both caches.
    */
  def load(cacheEntries: js.Array[js.Tuple2[K, Entry[V]]]): Unit = js.native
  
  val max: Double = js.native
  
  val maxEntrySize: Double = js.native
  
  val maxSize: Double = js.native
  
  /**
    * @since 7.11.0
    */
  val noDeleteOnStaleGet: Boolean = js.native
  
  val noDisposeOnSet: Boolean = js.native
  
  /**
    * Like `get()` but doesn't update recency or delete stale items.
    * Returns `undefined` if the item is stale, unless `allowStale` is set
    * either on the cache or in the options object.
    */
  // tslint:disable-next-line:no-unnecessary-generics
  def peek[T](key: K): js.UndefOr[T] = js.native
  def peek[T](key: K, options: PeekOptions): js.UndefOr[T] = js.native
  
  /**
    * Evict the least recently used item, returning its value or `undefined`
    * if cache is empty.
    */
  def pop(): js.UndefOr[V] = js.native
  
  /**
    * Manually iterates over the entire cache proactively pruning old entries.
    *
    * @deprecated since 7.0 use purgeStale() instead
    */
  def prune(): Boolean = js.native
  
  /**
    * Delete any stale entries. Returns true if anything was removed, false
    * otherwise.
    */
  def purgeStale(): Boolean = js.native
  
  /**
    * Inverse order version of `cache.entries()`
    * Return a generator yielding `[key, value]` pairs,
    * in order from least recently used to most recently used.
    */
  def rentries(): Generator[js.Tuple2[K, V], Any, Any] = js.native
  
  /**
    * Clear the cache entirely, throwing away all values.
    *
    * @deprecated since 7.0 use clear() instead
    */
  def reset(): Unit = js.native
  
  /**
    * The same as `cache.forEach(...)` but items are iterated over in reverse
    * order.  (ie, less recently used items are iterated over first.)
    */
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit]
  ): Unit = js.native
  def rforEach[T](
    callbackFn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ this.type, Unit],
    thisArg: T
  ): Unit = js.native
  
  /**
    * Inverse order version of `cache.keys()`
    * Return a generator yielding the keys in the cache,
    * in order from least recently used to most recently used.
    */
  def rkeys(): Generator[K, Any, Any] = js.native
  
  /**
    * Inverse order version of `cache.values()`
    * Return a generator yielding the values in the cache,
    * in order from least recently used to most recently used.
    */
  def rvalues(): Generator[V, Any, Any] = js.native
  
  /**
    * Add a value to the cache.
    */
  def set(key: K, value: V): this.type = js.native
  def set(key: K, value: V, options: SetOptions[K, V]): this.type = js.native
  
  /**
    * The total number of items held in the cache at the current moment.
    */
  val size: Double = js.native
  
  val sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.native
  
  val ttl: Double = js.native
  
  val ttlAutopurge: Boolean = js.native
  
  val ttlResolution: Double = js.native
  
  val updateAgeOnGet: Boolean = js.native
  
  /**
    * Return a generator yielding the values in the cache,
    * in order from most recently used to least recently used.
    */
  def values(): Generator[V, Any, Any] = js.native
}
