package typings.lruCache.distMjsMod

import typings.lruCache.anon.Free
import typings.lruCache.distMjsMod.LRUCache.Count
import typings.lruCache.distMjsMod.LRUCache.Disposer
import typings.lruCache.distMjsMod.LRUCache.Entry
import typings.lruCache.distMjsMod.LRUCache.Fetcher
import typings.lruCache.distMjsMod.LRUCache.GetOptions
import typings.lruCache.distMjsMod.LRUCache.HasOptions
import typings.lruCache.distMjsMod.LRUCache.Milliseconds
import typings.lruCache.distMjsMod.LRUCache.Options
import typings.lruCache.distMjsMod.LRUCache.PeekOptions
import typings.lruCache.distMjsMod.LRUCache.SetOptions
import typings.lruCache.distMjsMod.LRUCache.Size
import typings.lruCache.distMjsMod.LRUCache.SizeCalculator
import typings.lruCache.lruCacheBooleans.`true`
import typings.lruCache.lruCacheStrings.add
import typings.lruCache.lruCacheStrings.get
import typings.lruCache.lruCacheStrings.hit
import typings.lruCache.lruCacheStrings.inflight
import typings.lruCache.lruCacheStrings.miss
import typings.lruCache.lruCacheStrings.refresh
import typings.lruCache.lruCacheStrings.replace
import typings.lruCache.lruCacheStrings.stale
import typings.lruCache.lruCacheStrings.update
import typings.std.AbortSignal
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("lru-cache/dist/mjs", "LRUCache")
@js.native
open class LRUCache[K /* <: js.Object */, V /* <: js.Object */, FC] protected () extends StObject {
  def this(options: LRUCache[K, V, FC]) = this()
  def this(options: Options[K, V, FC]) = this()
  
  /**
    * {@link LRUCache.OptionsBase.allowStale}
    */
  var allowStale: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.allowStaleOnFetchAbort}
    */
  var allowStaleOnFetchAbort: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.allowStaleOnFetchRejection}
    */
  var allowStaleOnFetchRejection: Boolean = js.native
  
  /**
    * The total computed size of items in the cache (read-only)
    */
  def calculatedSize: Size = js.native
  
  /**
    * Clear the cache entirely, throwing away all values.
    */
  def clear(): Unit = js.native
  
  /**
    * Deletes a key out of the cache.
    * Returns true if the key was deleted, false otherwise.
    */
  def delete(k: K): Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.dispose} (read-only)
    */
  def dispose: js.UndefOr[Disposer[K, V]] = js.native
  
  /**
    * {@link LRUCache.OptionsBase.disposeAfter} (read-only)
    */
  def disposeAfter: js.UndefOr[Disposer[K, V]] = js.native
  
  /**
    * Return an array of [key, {@link LRUCache.Entry}] tuples which can be
    * passed to cache.load()
    */
  def dump(): js.Array[js.Tuple2[K, Entry[V]]] = js.native
  
  /**
    * Return a generator yielding `[key, value]` pairs,
    * in order from most recently used to least recently used.
    */
  def entries(): Generator[js.Array[js.UndefOr[K | V | BackgroundFetch[V]]], Unit, Any] = js.native
  
  /**
    * Make an asynchronous cached fetch using the
    * {@link LRUCache.OptionsBase.fetchMethod} function.
    *
    * If multiple fetches for the same key are issued, then they will all be
    * coalesced into a single call to fetchMethod.
    *
    * Note that this means that handling options such as
    * {@link LRUCache.OptionsBase.allowStaleOnFetchAbort},
    * {@link LRUCache.FetchOptions.signal},
    * and {@link LRUCache.OptionsBase.allowStaleOnFetchRejection} will be
    * determined by the FIRST fetch() call for a given key.
    *
    * This is a known (fixable) shortcoming which will be addresed on when
    * someone complains about it, as the fix would involve added complexity and
    * may not be worth the costs for this edge case.
    */
  def fetch(
    k: K,
    fetchOptions: /* import warning: importer.ImportType#apply Failed type conversion: unknown extends FC ? lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptions<K, V, FC> : FC extends undefined | void ? lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptionsNoContext<K, V> : lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptionsWithContext<K, V, FC> */ js.Any
  ): js.Promise[js.UndefOr[V]] = js.native
  def fetch(
    k: /* import warning: importer.ImportType#apply Failed type conversion: unknown extends FC ? K : FC extends undefined | void ? K : never */ js.Any
  ): js.Promise[js.UndefOr[V]] = js.native
  def fetch(
    k: /* import warning: importer.ImportType#apply Failed type conversion: unknown extends FC ? K : FC extends undefined | void ? K : never */ js.Any,
    fetchOptions: /* import warning: importer.ImportType#apply Failed type conversion: unknown extends FC ? lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptions<K, V, FC> : FC extends undefined | void ? lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptionsNoContext<K, V> : never */ js.Any
  ): js.Promise[js.UndefOr[V]] = js.native
  
  /**
    * {@link LRUCache.OptionsBase.fetchMethod} (read-only)
    */
  def fetchMethod: js.UndefOr[Fetcher[K, V, FC]] = js.native
  
  /**
    * Find a value for which the supplied fn method returns a truthy value,
    * similar to Array.find().  fn is called as fn(value, key, cache).
    */
  def find(fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Boolean]): js.UndefOr[V] = js.native
  def find(
    fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Boolean],
    getOptions: GetOptions[K, V, FC]
  ): js.UndefOr[V] = js.native
  
  /**
    * Call the supplied function on each item in the cache, in order from
    * most recently used to least recently used.  fn is called as
    * fn(value, key, cache).  Does not update age or recenty of use.
    * Does not iterate over stale values.
    */
  def forEach(fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Any]): Unit = js.native
  def forEach(fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Any], thisp: Any): Unit = js.native
  
  /**
    * Return a value from the cache. Will update the recency of the cache
    * entry found.
    *
    * If the key is not found, get() will return `undefined`.
    */
  def get(k: K): js.UndefOr[V] = js.native
  def get(k: K, getOptions: GetOptions[K, V, FC]): js.UndefOr[V] = js.native
  
  /**
    * Return the remaining TTL time for a given entry key
    */
  def getRemainingTTL(key: K): Double = js.native
  
  /**
    * Check if a key is in the cache, without updating the recency of use.
    * Will return false if the item is stale, even though it is technically
    * in the cache.
    *
    * Will not update item age unless
    * {@link LRUCache.OptionsBase.updateAgeOnHas} is set.
    */
  def has(k: K): Boolean = js.native
  def has(k: K, hasOptions: HasOptions[K, V, FC]): Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.ignoreFetchAbort}
    */
  var ignoreFetchAbort: Boolean = js.native
  
  /**
    * Iterating over the cache itself yields the same results as
    * {@link LRUCache.entries}
    */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Generator[js.Array[js.UndefOr[K | V | BackgroundFetch[V]]], Unit, Any]] = js.native
  
  /**
    * Return a generator yielding the keys in the cache,
    * in order from most recently used to least recently used.
    */
  def keys(): Generator[K, Unit, Any] = js.native
  
  /**
    * Reset the cache and load in the items in entries in the order listed.
    * Note that the shape of the resulting cache may be different if the
    * same options are not used in both caches.
    */
  def load(arr: js.Array[js.Tuple2[K, Entry[V]]]): Unit = js.native
  
  /**
    * {@link LRUCache.OptionsBase.max} (read-only)
    */
  def max: Count = js.native
  
  /**
    * {@link LRUCache.OptionsBase.maxEntrySize}
    */
  var maxEntrySize: Size = js.native
  
  /**
    * {@link LRUCache.OptionsBase.maxSize} (read-only)
    */
  def maxSize: Count = js.native
  
  /**
    * {@link LRUCache.OptionsBase.noDeleteOnFetchRejection}
    */
  var noDeleteOnFetchRejection: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.noDeleteOnStaleGet}
    */
  var noDeleteOnStaleGet: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.noDisposeOnSet}
    */
  var noDisposeOnSet: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.noUpdateTTL}
    */
  var noUpdateTTL: Boolean = js.native
  
  /**
    * Like {@link LRUCache#get} but doesn't update recency or delete stale
    * items.
    *
    * Returns `undefined` if the item is stale, unless
    * {@link LRUCache.OptionsBase.allowStale} is set.
    */
  def peek(k: K): js.UndefOr[V] = js.native
  def peek(k: K, peekOptions: PeekOptions[K, V, FC]): js.UndefOr[V] = js.native
  
  /**
    * Evict the least recently used item, returning its value or
    * `undefined` if cache is empty.
    */
  def pop(): js.UndefOr[V] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Delete any stale entries. Returns true if anything was removed,
    * false otherwise.
    */
  def purgeStale(): Boolean = js.native
  
  /**
    * Inverse order version of {@link LRUCache.entries}
    *
    * Return a generator yielding `[key, value]` pairs,
    * in order from least recently used to most recently used.
    */
  def rentries(): Generator[js.Array[js.UndefOr[K | V | BackgroundFetch[V]]], Unit, Any] = js.native
  
  /**
    * The same as {@link LRUCache.forEach} but items are iterated over in
    * reverse order.  (ie, less recently used items are iterated over first.)
    */
  def rforEach(fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Any]): Unit = js.native
  def rforEach(fn: js.Function3[/* v */ V, /* k */ K, /* self */ LRUCache[K, V, FC], Any], thisp: Any): Unit = js.native
  
  /**
    * Inverse order version of {@link LRUCache.keys}
    *
    * Return a generator yielding the keys in the cache,
    * in order from least recently used to most recently used.
    */
  def rkeys(): Generator[K, Unit, Any] = js.native
  
  /**
    * Inverse order version of {@link LRUCache.values}
    *
    * Return a generator yielding the values in the cache,
    * in order from least recently used to most recently used.
    */
  def rvalues(): Generator[js.UndefOr[V | BackgroundFetch[V]], Unit, Any] = js.native
  
  /**
    * Add a value to the cache.
    *
    * Note: if `undefined` is specified as a value, this is an alias for
    * {@link LRUCache#delete}
    */
  def set(k: K): this.type = js.native
  def set(k: K, v: V): this.type = js.native
  def set(k: K, v: V, setOptions: SetOptions[K, V, FC]): this.type = js.native
  def set(k: K, v: Unit, setOptions: SetOptions[K, V, FC]): this.type = js.native
  def set(k: K, v: BackgroundFetch[V]): this.type = js.native
  def set(k: K, v: BackgroundFetch[V], setOptions: SetOptions[K, V, FC]): this.type = js.native
  
  /**
    * The number of items stored in the cache (read-only)
    */
  def size: Count = js.native
  
  /**
    * {@link LRUCache.OptionsBase.sizeCalculation}
    */
  var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.native
  
  /**
    * {@link LRUCache.OptionsBase.ttl}
    */
  var ttl: Milliseconds = js.native
  
  /**
    * {@link LRUCache.OptionsBase.ttlAutopurge}
    */
  var ttlAutopurge: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.ttlResolution}
    */
  var ttlResolution: Milliseconds = js.native
  
  /**
    * {@link LRUCache.OptionsBase.updateAgeOnGet}
    */
  var updateAgeOnGet: Boolean = js.native
  
  /**
    * {@link LRUCache.OptionsBase.updateAgeOnHas}
    */
  var updateAgeOnHas: Boolean = js.native
  
  /**
    * Return a generator yielding the values in the cache,
    * in order from most recently used to least recently used.
    */
  def values(): Generator[js.UndefOr[V | BackgroundFetch[V]], Unit, Any] = js.native
}
/* static members */
object LRUCache {
  
  @JSImport("lru-cache/dist/mjs", "LRUCache")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Do not call this method unless you need to inspect the
    * inner workings of the cache.  If anything returned by this
    * object is modified in any way, strange breakage may occur.
    *
    * These fields are private for a reason!
    *
    * @internal
    */
  inline def unsafeExposeInternals[K /* <: js.Object */, V /* <: js.Object */, FC /* <: Any */](c: LRUCache[K, V, FC]): Free[K, V, FC] = ^.asInstanceOf[js.Dynamic].applyDynamic("unsafeExposeInternals")(c.asInstanceOf[js.Any]).asInstanceOf[Free[K, V, FC]]
  
  /**
    * An integer greater than 0, reflecting a number of items
    */
  type Count = Double
  
  /**
    * The reason why an item was removed from the cache, passed
    * to the {@link Disposer} methods.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.lruCache.lruCacheStrings.evict
    - typings.lruCache.lruCacheStrings.set
    - typings.lruCache.lruCacheStrings.delete
  */
  trait DisposeReason extends StObject
  object DisposeReason {
    
    inline def delete: typings.lruCache.lruCacheStrings.delete = "delete".asInstanceOf[typings.lruCache.lruCacheStrings.delete]
    
    inline def evict: typings.lruCache.lruCacheStrings.evict = "evict".asInstanceOf[typings.lruCache.lruCacheStrings.evict]
    
    inline def set: typings.lruCache.lruCacheStrings.set = "set".asInstanceOf[typings.lruCache.lruCacheStrings.set]
  }
  
  /**
    * A method called upon item removal, passed as the
    * {@link OptionsBase.dispose} and/or
    * {@link OptionsBase.disposeAfter} options.
    */
  type Disposer[K, V] = js.Function3[/* value */ V, /* key */ K, /* reason */ DisposeReason, Unit]
  
  /**
    * Entry objects used by {@link LRUCache#load} and {@link LRUCache#dump}
    */
  trait Entry[V] extends StObject {
    
    var size: js.UndefOr[Size] = js.undefined
    
    var start: js.UndefOr[Milliseconds] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
    
    var value: V
  }
  object Entry {
    
    inline def apply[V](value: V): Entry[V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Entry[?], V] (val x: Self & Entry[V]) extends AnyVal {
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStart(value: Milliseconds): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options that may be passed to the {@link LRUCache#fetch} method.
    */
  trait FetchOptions[K, V, FC]
    extends StObject
       with FetcherFetchOptions[K, V, FC] {
    
    /**
      * Context provided to the {@link OptionsBase.fetchMethod} as
      * the {@link FetcherOptions.context} param.
      *
      * If the FC type is specified as unknown (the default),
      * undefined or void, then this is optional.  Otherwise, it will
      * be required.
      */
    var context: js.UndefOr[FC] = js.undefined
    
    /**
      * Set to true to force a re-load of the existing data, even if it
      * is not yet stale.
      */
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object FetchOptions {
    
    inline def apply[K, V, FC](): FetchOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptions[?, ?, ?], K, V, FC] (val x: Self & (FetchOptions[K, V, FC])) extends AnyVal {
      
      inline def setContext(value: FC): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  /**
    * Options provided to {@link LRUCache#fetch} when the FC type is
    * `undefined` or `void`
    */
  /* Inlined parent lru-cache.lru-cache/dist/mjs.LRUCache.FetchOptions<K, V, undefined> */
  trait FetchOptionsNoContext[K, V] extends StObject {
    
    var allowStale: js.UndefOr[Boolean] = js.undefined
    
    var allowStaleOnFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    var allowStaleOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    var context: Unit
    
    /**
      * Set to true to force a re-load of the existing data, even if it
      * is not yet stale.
      */
    var forceRefresh: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    var noDeleteOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
    
    var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
    
    var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
    
    var status: js.UndefOr[Status[V]] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
    
    var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  }
  object FetchOptionsNoContext {
    
    inline def apply[K, V](context: Unit): FetchOptionsNoContext[K, V] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchOptionsNoContext[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptionsNoContext[?, ?], K, V] (val x: Self & (FetchOptionsNoContext[K, V])) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbort(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbortUndefined: Self = StObject.set(x, "allowStaleOnFetchAbort", js.undefined)
      
      inline def setAllowStaleOnFetchRejection(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchRejectionUndefined: Self = StObject.set(x, "allowStaleOnFetchRejection", js.undefined)
      
      inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
      
      inline def setContext(value: Unit): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setForceRefresh(value: Boolean): Self = StObject.set(x, "forceRefresh", value.asInstanceOf[js.Any])
      
      inline def setForceRefreshUndefined: Self = StObject.set(x, "forceRefresh", js.undefined)
      
      inline def setIgnoreFetchAbort(value: Boolean): Self = StObject.set(x, "ignoreFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFetchAbortUndefined: Self = StObject.set(x, "ignoreFetchAbort", js.undefined)
      
      inline def setNoDeleteOnFetchRejection(value: Boolean): Self = StObject.set(x, "noDeleteOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnFetchRejectionUndefined: Self = StObject.set(x, "noDeleteOnFetchRejection", js.undefined)
      
      inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
      
      inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
      
      inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
      
      inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
      
      inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeCalculation(value: (V, K) => Size): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Status[V]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
    }
  }
  
  /**
    * Options provided to {@link LRUCache#fetch} when the FC type is something
    * other than `unknown`, `undefined`, or `void`
    */
  trait FetchOptionsWithContext[K, V, FC]
    extends StObject
       with FetchOptions[K, V, FC] {
    
    @JSName("context")
    var context_FetchOptionsWithContext: FC
  }
  object FetchOptionsWithContext {
    
    inline def apply[K, V, FC](context: FC): FetchOptionsWithContext[K, V, FC] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetchOptionsWithContext[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptionsWithContext[?, ?, ?], K, V, FC] (val x: Self & (FetchOptionsWithContext[K, V, FC])) extends AnyVal {
      
      inline def setContext(value: FC): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The type signature for the {@link OptionsBase.fetchMethod} option.
    */
  type Fetcher[K, V, FC] = js.Function3[
    /* key */ K, 
    /* staleValue */ js.UndefOr[V], 
    /* options */ FetcherOptions[K, V, FC], 
    js.UndefOr[(js.Promise[js.UndefOr[V | Unit]]) | V | Unit]
  ]
  
  /**
    * options which override the options set in the LRUCache constructor
    * when calling {@link LRUCache#fetch}.
    *
    * This is the union of {@link GetOptions} and {@link SetOptions}, plus
    * {@link OptionsBase.noDeleteOnFetchRejection},
    * {@link OptionsBase.allowStaleOnFetchRejection},
    * {@link FetchOptions.forceRefresh}, and
    * {@link OptionsBase.context}
    *
    * Any of these may be modified in the {@link OptionsBase.fetchMethod}
    * function, but the {@link GetOptions} fields will of course have no
    * effect, as the {@link LRUCache#get} call already happened by the time
    * the fetchMethod is called.
    */
  /* Inlined parent std.Pick<lru-cache.lru-cache/dist/mjs.LRUCache.OptionsBase<K, V, FC>, 'allowStale' | 'updateAgeOnGet' | 'noDeleteOnStaleGet' | 'sizeCalculation' | 'ttl' | 'noDisposeOnSet' | 'noUpdateTTL' | 'noDeleteOnFetchRejection' | 'allowStaleOnFetchRejection' | 'ignoreFetchAbort' | 'allowStaleOnFetchAbort'> */
  trait FetcherFetchOptions[K, V, FC] extends StObject {
    
    var allowStale: js.UndefOr[Boolean] = js.undefined
    
    var allowStaleOnFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    var allowStaleOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    var ignoreFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    var noDeleteOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
    
    var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
    
    var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
    
    var status: js.UndefOr[Status[V]] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
    
    var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  }
  object FetcherFetchOptions {
    
    inline def apply[K, V, FC](): FetcherFetchOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetcherFetchOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetcherFetchOptions[?, ?, ?], K, V, FC] (val x: Self & (FetcherFetchOptions[K, V, FC])) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbort(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbortUndefined: Self = StObject.set(x, "allowStaleOnFetchAbort", js.undefined)
      
      inline def setAllowStaleOnFetchRejection(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchRejectionUndefined: Self = StObject.set(x, "allowStaleOnFetchRejection", js.undefined)
      
      inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
      
      inline def setIgnoreFetchAbort(value: Boolean): Self = StObject.set(x, "ignoreFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFetchAbortUndefined: Self = StObject.set(x, "ignoreFetchAbort", js.undefined)
      
      inline def setNoDeleteOnFetchRejection(value: Boolean): Self = StObject.set(x, "noDeleteOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnFetchRejectionUndefined: Self = StObject.set(x, "noDeleteOnFetchRejection", js.undefined)
      
      inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
      
      inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
      
      inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
      
      inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
      
      inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeCalculation(value: (V, K) => Size): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Status[V]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
    }
  }
  
  /**
    * Options provided to the
    * {@link OptionsBase.fetchMethod} function.
    */
  trait FetcherOptions[K, V, FC] extends StObject {
    
    /**
      * Object provided in the {@link FetchOptions.context} option to
      * {@link LRUCache#fetch}
      */
    var context: FC
    
    var options: FetcherFetchOptions[K, V, FC]
    
    var signal: AbortSignal
  }
  object FetcherOptions {
    
    inline def apply[K, V, FC](context: FC, options: FetcherFetchOptions[K, V, FC], signal: AbortSignal): FetcherOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[FetcherOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetcherOptions[?, ?, ?], K, V, FC] (val x: Self & (FetcherOptions[K, V, FC])) extends AnyVal {
      
      inline def setContext(value: FC): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: FetcherFetchOptions[K, V, FC]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options that may be passed to the {@link LRUCache#get} method.
    */
  /* Inlined parent std.Pick<lru-cache.lru-cache/dist/mjs.LRUCache.OptionsBase<K, V, FC>, 'allowStale' | 'updateAgeOnGet' | 'noDeleteOnStaleGet'> */
  trait GetOptions[K, V, FC] extends StObject {
    
    var allowStale: js.UndefOr[Boolean] = js.undefined
    
    var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[Status[V]] = js.undefined
    
    var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  }
  object GetOptions {
    
    inline def apply[K, V, FC](): GetOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetOptions[?, ?, ?], K, V, FC] (val x: Self & (GetOptions[K, V, FC])) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
      
      inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
      
      inline def setStatus(value: Status[V]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
    }
  }
  
  /**
    * Options that may be passed to the {@link LRUCache#has} method.
    */
  /* Inlined parent std.Pick<lru-cache.lru-cache/dist/mjs.LRUCache.OptionsBase<K, V, FC>, 'updateAgeOnHas'> */
  trait HasOptions[K, V, FC] extends StObject {
    
    var status: js.UndefOr[Status[V]] = js.undefined
    
    var updateAgeOnHas: js.UndefOr[Boolean] = js.undefined
  }
  object HasOptions {
    
    inline def apply[K, V, FC](): HasOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HasOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasOptions[?, ?, ?], K, V, FC] (val x: Self & (HasOptions[K, V, FC])) extends AnyVal {
      
      inline def setStatus(value: Status[V]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setUpdateAgeOnHas(value: Boolean): Self = StObject.set(x, "updateAgeOnHas", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnHasUndefined: Self = StObject.set(x, "updateAgeOnHas", js.undefined)
    }
  }
  
  /**
    * Integer greater than 0, representing some number of milliseconds, or the
    * time at which a TTL started counting from.
    */
  type Milliseconds = Double
  
  /**
    * The valid safe options for the {@link LRUCache} constructor
    */
  /* Rewritten from type alias, can be one of: 
    - typings.lruCache.distMjsMod.LRUCache.OptionsMaxLimit[K, V, FC]
    - typings.lruCache.distMjsMod.LRUCache.OptionsSizeLimit[K, V, FC]
    - typings.lruCache.distMjsMod.LRUCache.OptionsTTLLimit[K, V, FC]
  */
  trait Options[K, V, FC] extends StObject
  object Options {
    
    inline def OptionsMaxLimit[K, V, FC](max: Count): typings.lruCache.distMjsMod.LRUCache.OptionsMaxLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lruCache.distMjsMod.LRUCache.OptionsMaxLimit[K, V, FC]]
    }
    
    inline def OptionsSizeLimit[K, V, FC](maxSize: Size): typings.lruCache.distMjsMod.LRUCache.OptionsSizeLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lruCache.distMjsMod.LRUCache.OptionsSizeLimit[K, V, FC]]
    }
    
    inline def OptionsTTLLimit[K, V, FC](ttl: Milliseconds, ttlAutopurge: Boolean): typings.lruCache.distMjsMod.LRUCache.OptionsTTLLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any], ttlAutopurge = ttlAutopurge.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.lruCache.distMjsMod.LRUCache.OptionsTTLLimit[K, V, FC]]
    }
  }
  
  /**
    * Options which may be passed to the {@link LRUCache} constructor.
    *
    * Most of these may be overridden in the various options that use
    * them.
    *
    * Despite all being technically optional, the constructor requires that
    * a cache is at minimum limited by one or more of {@link OptionsBase.max},
    * {@link OptionsBase.ttl}, or {@link OptionsBase.maxSize}.
    *
    * If {@link OptionsBase.ttl} is used alone, then it is strongly advised
    * (and in fact required by the type definitions here) that the cache
    * also set {@link OptionsBase.ttlAutopurge}, to prevent potentially
    * unbounded storage.
    */
  trait OptionsBase[K, V, FC] extends StObject {
    
    /**
      * Allow {@link LRUCache#get} and {@link LRUCache#fetch} calls to return
      * stale data, if available.
      */
    var allowStale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to return a stale value from the cache when the
      * `AbortSignal` passed to the {@link OptionsBase.fetchMethod} dispatches an `'abort'`
      * event, whether user-triggered, or due to internal cache behavior.
      *
      * Unless {@link OptionsBase.ignoreFetchAbort} is also set, the underlying
      * {@link OptionsBase.fetchMethod} will still be considered canceled, and
      * any value it returns will be ignored and not cached.
      *
      * Caveat: since fetches are aborted when a new value is explicitly
      * set in the cache, this can lead to fetch returning a stale value,
      * since that was the fallback value _at the moment the `fetch()` was
      * initiated_, even though the new updated value is now present in
      * the cache.
      *
      * For example:
      *
      * ```ts
      * const cache = new LRUCache<string, any>({
      *   ttl: 100,
      *   fetchMethod: async (url, oldValue, { signal }) =>  {
      *     const res = await fetch(url, { signal })
      *     return await res.json()
      *   }
      * })
      * cache.set('https://example.com/', { some: 'data' })
      * // 100ms go by...
      * const result = cache.fetch('https://example.com/')
      * cache.set('https://example.com/', { other: 'thing' })
      * console.log(await result) // { some: 'data' }
      * console.log(cache.get('https://example.com/')) // { other: 'thing' }
      * ```
      */
    var allowStaleOnFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to allow returning stale data when a
      * {@link OptionsBase.fetchMethod} throws an error or returns a rejected
      * promise.
      *
      * This differs from using {@link OptionsBase.allowStale} in that stale
      * data will ONLY be returned in the case that the
      * {@link LRUCache#fetch} fails, not any other times.
      */
    var allowStaleOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Function that is called on items when they are dropped from the cache.
      * This can be handy if you want to close file descriptors or do other
      * cleanup tasks when items are no longer accessible. Called with `key,
      * value`.  It's called before actually removing the item from the
      * internal cache, so it is *NOT* safe to re-add them.
      *
      * Use {@link OptionsBase.disposeAfter} if you wish to dispose items after
      * they have been full removed, when it is safe to add them back to the
      * cache.
      */
    var dispose: js.UndefOr[Disposer[K, V]] = js.undefined
    
    /**
      * The same as {@link OptionsBase.dispose}, but called *after* the entry
      * is completely removed and the cache is once again in a clean state.
      * It is safe to add an item right back into the cache at this point.
      * However, note that it is *very* easy to inadvertently create infinite
      * recursion this way.
      */
    var disposeAfter: js.UndefOr[Disposer[K, V]] = js.undefined
    
    /**
      * Method that provides the implementation for {@link LRUCache#fetch}
      */
    var fetchMethod: js.UndefOr[Fetcher[K, V, FC]] = js.undefined
    
    /**
      * Set to true to ignore the `abort` event emitted by the `AbortSignal`
      * object passed to {@link OptionsBase.fetchMethod}, and still cache the
      * resulting resolution value, as long as it is not `undefined`.
      *
      * When used on its own, this means aborted {@link LRUCache#fetch} calls are not
      * immediately resolved or rejected when they are aborted, and instead
      * take the full time to await.
      *
      * When used with {@link OptionsBase.allowStaleOnFetchAbort}, aborted
      * {@link LRUCache#fetch} calls will resolve immediately to their stale
      * cached value or `undefined`, and will continue to process and eventually
      * update the cache when they resolve, as long as the resulting value is
      * not `undefined`, thus supporting a "return stale on timeout while
      * refreshing" mechanism by passing `AbortSignal.timeout(n)` as the signal.
      *
      * **Note**: regardless of this setting, an `abort` event _is still
      * emitted on the `AbortSignal` object_, so may result in invalid results
      * when passed to other underlying APIs that use AbortSignals.
      *
      * This may be overridden in the {@link OptionsBase.fetchMethod} or the
      * call to {@link LRUCache#fetch}.
      */
    var ignoreFetchAbort: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of items to store in the cache before evicting
      * old entries. This is read-only on the {@link LRUCache} instance,
      * and may not be overridden.
      *
      * If set, then storage space will be pre-allocated at construction
      * time, and the cache will perform significantly faster.
      *
      * Note that significantly fewer items may be stored, if
      * {@link OptionsBase.maxSize} and/or {@link OptionsBase.ttl} are also
      * set.
      */
    var max: js.UndefOr[Count] = js.undefined
    
    /**
      * The maximum allowed size for any single item in the cache.
      *
      * If a larger item is passed to {@link LRUCache#set} or returned by a
      * {@link OptionsBase.fetchMethod}, then it will not be stored in the
      * cache.
      */
    var maxEntrySize: js.UndefOr[Size] = js.undefined
    
    /**
      * If you wish to track item size, you must provide a maxSize
      * note that we still will only keep up to max *actual items*,
      * if max is set, so size tracking may cause fewer than max items
      * to be stored.  At the extreme, a single item of maxSize size
      * will cause everything else in the cache to be dropped when it
      * is added.  Use with caution!
      *
      * Note also that size tracking can negatively impact performance,
      * though for most cases, only minimally.
      */
    var maxSize: js.UndefOr[Size] = js.undefined
    
    /**
      * Set to true to suppress the deletion of stale data when a
      * {@link OptionsBase.fetchMethod} returns a rejected promise.
      */
    var noDeleteOnFetchRejection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not delete stale items when they are retrieved with
      * {@link LRUCache#get}.
      *
      * Note that the `get` return value will still be `undefined`
      * unless {@link OptionsBase.allowStale} is true.
      */
    var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set to true to suppress calling the
      * {@link OptionsBase.dispose} function if the entry key is
      * still accessible within the cache.
      * This may be overridden by passing an options object to
      * {@link LRUCache#set}.
      */
    var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean flag to tell the cache to not update the TTL when
      * setting a new value for an existing key (ie, when updating a value
      * rather than inserting a new value).  Note that the TTL value is
      * _always_ set (if provided) when adding a new entry into the cache.
      *
      * Has no effect if a {@link OptionsBase.ttl} is not set.
      */
    var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that returns a number indicating the item's size.
      *
      * If not provided, and {@link OptionsBase.maxSize} or
      * {@link OptionsBase.maxEntrySize} are set, then all
      * {@link LRUCache#set} calls **must** provide an explicit
      * {@link SetOptions.size} or sizeCalculation param.
      */
    var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
    
    /**
      * Max time in milliseconds for items to live in cache before they are
      * considered stale.  Note that stale items are NOT preemptively removed
      * by default, and MAY live in the cache long after they have expired.
      *
      * Also, as this cache is optimized for LRU/MRU operations, some of
      * the staleness/TTL checks will reduce performance, as they will incur
      * overhead by deleting items.
      *
      * Must be an integer number of ms. If set to 0, this indicates "no TTL"
      *
      * @default 0
      */
    var ttl: js.UndefOr[Milliseconds] = js.undefined
    
    /**
      * Preemptively remove stale items from the cache.
      * Note that this may significantly degrade performance,
      * especially if the cache is storing a large number of items.
      * It is almost always best to just leave the stale items in
      * the cache, and let them fall out as new items are added.
      *
      * Note that this means that {@link OptionsBase.allowStale} is a bit
      * pointless, as stale items will be deleted almost as soon as they
      * expire.
      *
      * @default false
      */
    var ttlAutopurge: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Minimum amount of time in ms in which to check for staleness.
      * Defaults to 1, which means that the current time is checked
      * at most once per millisecond.
      *
      * Set to 0 to check the current time every time staleness is tested.
      * (This reduces performance, and is theoretically unnecessary.)
      *
      * Setting this to a higher value will improve performance somewhat
      * while using ttl tracking, albeit at the expense of keeping stale
      * items around a bit longer than their TTLs would indicate.
      *
      * @default 1
      */
    var ttlResolution: js.UndefOr[Milliseconds] = js.undefined
    
    /**
      * Update the age of items on {@link LRUCache#get}, renewing their TTL
      *
      * Has no effect if {@link OptionsBase.ttl} is not set.
      *
      * @default false
      */
    var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Update the age of items on {@link LRUCache#has}, renewing their TTL
      *
      * Has no effect if {@link OptionsBase.ttl} is not set.
      *
      * @default false
      */
    var updateAgeOnHas: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsBase {
    
    inline def apply[K, V, FC](): OptionsBase[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsBase[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsBase[?, ?, ?], K, V, FC] (val x: Self & (OptionsBase[K, V, FC])) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbort(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchAbortUndefined: Self = StObject.set(x, "allowStaleOnFetchAbort", js.undefined)
      
      inline def setAllowStaleOnFetchRejection(value: Boolean): Self = StObject.set(x, "allowStaleOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleOnFetchRejectionUndefined: Self = StObject.set(x, "allowStaleOnFetchRejection", js.undefined)
      
      inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
      
      inline def setDispose(value: (V, K, /* reason */ DisposeReason) => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction3(value))
      
      inline def setDisposeAfter(value: (V, K, /* reason */ DisposeReason) => Unit): Self = StObject.set(x, "disposeAfter", js.Any.fromFunction3(value))
      
      inline def setDisposeAfterUndefined: Self = StObject.set(x, "disposeAfter", js.undefined)
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setFetchMethod(
        value: (K, /* staleValue */ js.UndefOr[V], /* options */ FetcherOptions[K, V, FC]) => js.UndefOr[(js.Promise[js.UndefOr[V | Unit]]) | V | Unit]
      ): Self = StObject.set(x, "fetchMethod", js.Any.fromFunction3(value))
      
      inline def setFetchMethodUndefined: Self = StObject.set(x, "fetchMethod", js.undefined)
      
      inline def setIgnoreFetchAbort(value: Boolean): Self = StObject.set(x, "ignoreFetchAbort", value.asInstanceOf[js.Any])
      
      inline def setIgnoreFetchAbortUndefined: Self = StObject.set(x, "ignoreFetchAbort", js.undefined)
      
      inline def setMax(value: Count): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxEntrySize(value: Size): Self = StObject.set(x, "maxEntrySize", value.asInstanceOf[js.Any])
      
      inline def setMaxEntrySizeUndefined: Self = StObject.set(x, "maxEntrySize", js.undefined)
      
      inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setNoDeleteOnFetchRejection(value: Boolean): Self = StObject.set(x, "noDeleteOnFetchRejection", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnFetchRejectionUndefined: Self = StObject.set(x, "noDeleteOnFetchRejection", js.undefined)
      
      inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
      
      inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
      
      inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
      
      inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
      
      inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
      
      inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
      
      inline def setSizeCalculation(value: (V, K) => Size): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlAutopurge(value: Boolean): Self = StObject.set(x, "ttlAutopurge", value.asInstanceOf[js.Any])
      
      inline def setTtlAutopurgeUndefined: Self = StObject.set(x, "ttlAutopurge", js.undefined)
      
      inline def setTtlResolution(value: Milliseconds): Self = StObject.set(x, "ttlResolution", value.asInstanceOf[js.Any])
      
      inline def setTtlResolutionUndefined: Self = StObject.set(x, "ttlResolution", js.undefined)
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
      
      inline def setUpdateAgeOnHas(value: Boolean): Self = StObject.set(x, "updateAgeOnHas", value.asInstanceOf[js.Any])
      
      inline def setUpdateAgeOnHasUndefined: Self = StObject.set(x, "updateAgeOnHas", js.undefined)
    }
  }
  
  trait OptionsMaxLimit[K, V, FC]
    extends StObject
       with OptionsBase[K, V, FC]
       with Options[K, V, FC] {
    
    @JSName("max")
    var max_OptionsMaxLimit: Count
  }
  object OptionsMaxLimit {
    
    inline def apply[K, V, FC](max: Count): OptionsMaxLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsMaxLimit[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsMaxLimit[?, ?, ?], K, V, FC] (val x: Self & (OptionsMaxLimit[K, V, FC])) extends AnyVal {
      
      inline def setMax(value: Count): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsSizeLimit[K, V, FC]
    extends StObject
       with OptionsBase[K, V, FC]
       with Options[K, V, FC] {
    
    @JSName("maxSize")
    var maxSize_OptionsSizeLimit: Size
  }
  object OptionsSizeLimit {
    
    inline def apply[K, V, FC](maxSize: Size): OptionsSizeLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsSizeLimit[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsSizeLimit[?, ?, ?], K, V, FC] (val x: Self & (OptionsSizeLimit[K, V, FC])) extends AnyVal {
      
      inline def setMaxSize(value: Size): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionsTTLLimit[K, V, FC]
    extends StObject
       with OptionsBase[K, V, FC]
       with Options[K, V, FC] {
    
    @JSName("ttlAutopurge")
    var ttlAutopurge_OptionsTTLLimit: Boolean
    
    @JSName("ttl")
    var ttl_OptionsTTLLimit: Milliseconds
  }
  object OptionsTTLLimit {
    
    inline def apply[K, V, FC](ttl: Milliseconds, ttlAutopurge: Boolean): OptionsTTLLimit[K, V, FC] = {
      val __obj = js.Dynamic.literal(ttl = ttl.asInstanceOf[js.Any], ttlAutopurge = ttlAutopurge.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsTTLLimit[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsTTLLimit[?, ?, ?], K, V, FC] (val x: Self & (OptionsTTLLimit[K, V, FC])) extends AnyVal {
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlAutopurge(value: Boolean): Self = StObject.set(x, "ttlAutopurge", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options that may be passed to the {@link LRUCache#peek} method.
    */
  /* Inlined parent std.Pick<lru-cache.lru-cache/dist/mjs.LRUCache.OptionsBase<K, V, FC>, 'allowStale'> */
  trait PeekOptions[K, V, FC] extends StObject {
    
    var allowStale: js.UndefOr[Boolean] = js.undefined
  }
  object PeekOptions {
    
    inline def apply[K, V, FC](): PeekOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeekOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeekOptions[?, ?, ?], K, V, FC] (val x: Self & (PeekOptions[K, V, FC])) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
      
      inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
    }
  }
  
  /**
    * Options that may be passed to the {@link LRUCache#set} method.
    */
  /* Inlined parent std.Pick<lru-cache.lru-cache/dist/mjs.LRUCache.OptionsBase<K, V, FC>, 'sizeCalculation' | 'ttl' | 'noDisposeOnSet' | 'noUpdateTTL'> */
  trait SetOptions[K, V, FC] extends StObject {
    
    var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
    
    var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If size tracking is enabled, then setting an explicit size
      * in the {@link LRUCache#set} call will prevent calling the
      * {@link OptionsBase.sizeCalculation} function.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
    
    /**
      * If TTL tracking is enabled, then setting an explicit start
      * time in the {@link LRUCache#set} call will override the
      * default time from `performance.now()` or `Date.now()`.
      *
      * Note that it must be a valid value for whichever time-tracking
      * method is in use.
      */
    var start: js.UndefOr[Milliseconds] = js.undefined
    
    var status: js.UndefOr[Status[V]] = js.undefined
    
    var ttl: js.UndefOr[Milliseconds] = js.undefined
  }
  object SetOptions {
    
    inline def apply[K, V, FC](): SetOptions[K, V, FC] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions[K, V, FC]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SetOptions[?, ?, ?], K, V, FC] (val x: Self & (SetOptions[K, V, FC])) extends AnyVal {
      
      inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
      
      inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
      
      inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
      
      inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeCalculation(value: (V, K) => Size): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStart(value: Milliseconds): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setStatus(value: Status[V]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
  
  /**
    * An integer greater than 0, reflecting the calculated size of items
    */
  type Size = Double
  
  /**
    * A function that returns the effective calculated size
    * of an entry in the cache.
    */
  type SizeCalculator[K, V] = js.Function2[/* value */ V, /* key */ K, Size]
  
  /**
    * Status object that may be passed to {@link LRUCache#fetch},
    * {@link LRUCache#get}, {@link LRUCache#set}, and {@link LRUCache#has}.
    */
  trait Status[V] extends StObject {
    
    /**
      * The calculated size for the item, if sizes are used.
      */
    var entrySize: js.UndefOr[Size] = js.undefined
    
    /**
      * The status of a {@link LRUCache#fetch} operation.
      * Note that this can change as the underlying fetch() moves through
      * various states.
      *
      * - inflight: there is another fetch() for this key which is in process
      * - get: there is no fetchMethod, so {@link LRUCache#get} was called.
      * - miss: the item is not in cache, and will be fetched.
      * - hit: the item is in the cache, and was resolved immediately.
      * - stale: the item is in the cache, but stale.
      * - refresh: the item is in the cache, and not stale, but
      *   {@link FetchOptions.forceRefresh} was specified.
      */
    var fetch: js.UndefOr[get | inflight | miss | hit | stale | refresh] = js.undefined
    
    /**
      * The abort signal received was ignored, and the fetch was allowed to
      * continue.
      */
    var fetchAbortIgnored: js.UndefOr[`true`] = js.undefined
    
    /**
      * The fetch received an abort signal
      */
    var fetchAborted: js.UndefOr[`true`] = js.undefined
    
    /**
      * The {@link OptionsBase.fetchMethod} was called
      */
    var fetchDispatched: js.UndefOr[`true`] = js.undefined
    
    /**
      * The reason for a fetch() rejection.  Either the error raised by the
      * {@link OptionsBase.fetchMethod}, or the reason for an
      * AbortSignal.
      */
    var fetchError: js.UndefOr[js.Error] = js.undefined
    
    /**
      * The fetchMethod promise was rejected
      */
    var fetchRejected: js.UndefOr[`true`] = js.undefined
    
    /**
      * The fetchMethod promise resolved successfully
      */
    var fetchResolved: js.UndefOr[`true`] = js.undefined
    
    /**
      * The cached value was updated after a successful call to
      * {@link OptionsBase.fetchMethod}
      */
    var fetchUpdated: js.UndefOr[`true`] = js.undefined
    
    /**
      * The status of a {@link LRUCache#get} operation.
      *
      * - fetching: The item is currently being fetched.  If a previous value
      *   is present and allowed, that will be returned.
      * - stale: The item is in the cache, and is stale.
      * - hit: the item is in the cache
      * - miss: the item is not in the cache
      */
    var get: js.UndefOr[stale | hit | miss] = js.undefined
    
    /**
      * The results of a {@link LRUCache#has} operation
      *
      * - hit: the item was found in the cache
      * - stale: the item was found in the cache, but is stale
      * - miss: the item was not found in the cache
      */
    var has: js.UndefOr[hit | stale | miss] = js.undefined
    
    /**
      * A flag indicating that the item was not stored, due to exceeding the
      * {@link OptionsBase.maxEntrySize}
      */
    var maxEntrySizeExceeded: js.UndefOr[`true`] = js.undefined
    
    /**
      * The timestamp used for TTL calculation
      */
    var now: js.UndefOr[Milliseconds] = js.undefined
    
    /**
      * The old value, specified in the case of `set:'update'` or
      * `set:'replace'`
      */
    var oldValue: js.UndefOr[V] = js.undefined
    
    /**
      * the remaining ttl for the item, or undefined if ttls are not used.
      */
    var remainingTTL: js.UndefOr[Milliseconds] = js.undefined
    
    /**
      * A fetch or get operation returned a stale value.
      */
    var returnedStale: js.UndefOr[`true`] = js.undefined
    
    /**
      * The status of a set() operation.
      *
      * - add: the item was not found in the cache, and was added
      * - update: the item was in the cache, with the same value provided
      * - replace: the item was in the cache, and replaced
      * - miss: the item was not added to the cache for some reason
      */
    var set: js.UndefOr[add | update | replace | miss] = js.undefined
    
    /**
      * the start time for the item, or undefined if ttls are not used.
      */
    var start: js.UndefOr[Milliseconds] = js.undefined
    
    /**
      * The total calculated size of the cache, if sizes are used.
      */
    var totalCalculatedSize: js.UndefOr[Size] = js.undefined
    
    /**
      * the ttl stored for the item, or undefined if ttls are not used.
      */
    var ttl: js.UndefOr[Milliseconds] = js.undefined
  }
  object Status {
    
    inline def apply[V](): Status[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Status[V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status[?], V] (val x: Self & Status[V]) extends AnyVal {
      
      inline def setEntrySize(value: Size): Self = StObject.set(x, "entrySize", value.asInstanceOf[js.Any])
      
      inline def setEntrySizeUndefined: Self = StObject.set(x, "entrySize", js.undefined)
      
      inline def setFetch(value: get | inflight | miss | hit | stale | refresh): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
      
      inline def setFetchAbortIgnored(value: `true`): Self = StObject.set(x, "fetchAbortIgnored", value.asInstanceOf[js.Any])
      
      inline def setFetchAbortIgnoredUndefined: Self = StObject.set(x, "fetchAbortIgnored", js.undefined)
      
      inline def setFetchAborted(value: `true`): Self = StObject.set(x, "fetchAborted", value.asInstanceOf[js.Any])
      
      inline def setFetchAbortedUndefined: Self = StObject.set(x, "fetchAborted", js.undefined)
      
      inline def setFetchDispatched(value: `true`): Self = StObject.set(x, "fetchDispatched", value.asInstanceOf[js.Any])
      
      inline def setFetchDispatchedUndefined: Self = StObject.set(x, "fetchDispatched", js.undefined)
      
      inline def setFetchError(value: js.Error): Self = StObject.set(x, "fetchError", value.asInstanceOf[js.Any])
      
      inline def setFetchErrorUndefined: Self = StObject.set(x, "fetchError", js.undefined)
      
      inline def setFetchRejected(value: `true`): Self = StObject.set(x, "fetchRejected", value.asInstanceOf[js.Any])
      
      inline def setFetchRejectedUndefined: Self = StObject.set(x, "fetchRejected", js.undefined)
      
      inline def setFetchResolved(value: `true`): Self = StObject.set(x, "fetchResolved", value.asInstanceOf[js.Any])
      
      inline def setFetchResolvedUndefined: Self = StObject.set(x, "fetchResolved", js.undefined)
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setFetchUpdated(value: `true`): Self = StObject.set(x, "fetchUpdated", value.asInstanceOf[js.Any])
      
      inline def setFetchUpdatedUndefined: Self = StObject.set(x, "fetchUpdated", js.undefined)
      
      inline def setGet(value: stale | hit | miss): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHas(value: hit | stale | miss): Self = StObject.set(x, "has", value.asInstanceOf[js.Any])
      
      inline def setHasUndefined: Self = StObject.set(x, "has", js.undefined)
      
      inline def setMaxEntrySizeExceeded(value: `true`): Self = StObject.set(x, "maxEntrySizeExceeded", value.asInstanceOf[js.Any])
      
      inline def setMaxEntrySizeExceededUndefined: Self = StObject.set(x, "maxEntrySizeExceeded", js.undefined)
      
      inline def setNow(value: Milliseconds): Self = StObject.set(x, "now", value.asInstanceOf[js.Any])
      
      inline def setNowUndefined: Self = StObject.set(x, "now", js.undefined)
      
      inline def setOldValue(value: V): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setRemainingTTL(value: Milliseconds): Self = StObject.set(x, "remainingTTL", value.asInstanceOf[js.Any])
      
      inline def setRemainingTTLUndefined: Self = StObject.set(x, "remainingTTL", js.undefined)
      
      inline def setReturnedStale(value: `true`): Self = StObject.set(x, "returnedStale", value.asInstanceOf[js.Any])
      
      inline def setReturnedStaleUndefined: Self = StObject.set(x, "returnedStale", js.undefined)
      
      inline def setSet(value: add | update | replace | miss): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
      
      inline def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      inline def setStart(value: Milliseconds): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTotalCalculatedSize(value: Size): Self = StObject.set(x, "totalCalculatedSize", value.asInstanceOf[js.Any])
      
      inline def setTotalCalculatedSizeUndefined: Self = StObject.set(x, "totalCalculatedSize", js.undefined)
      
      inline def setTtl(value: Milliseconds): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    }
  }
}
