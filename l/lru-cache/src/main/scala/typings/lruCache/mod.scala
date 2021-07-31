package typings.lruCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lru-cache", JSImport.Namespace)
  @js.native
  class ^[K, V] ()
    extends StObject
       with LRUCache[K, V] {
    def this(max: Double) = this()
    def this(options: Options[K, V]) = this()
  }
  
  trait Entry[K, V] extends StObject {
    
    var e: Double
    
    var k: K
    
    var v: V
  }
  object Entry {
    
    @scala.inline
    def apply[K, V](e: Double, k: K, v: V): Entry[K, V] = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], k = k.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry[K, V]]
    }
    
    @scala.inline
    implicit class EntryMutableBuilder[Self <: Entry[?, ?], K, V] (val x: Self & (Entry[K, V])) extends AnyVal {
      
      @scala.inline
      def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setK(value: K): Self = StObject.set(x, "k", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV(value: V): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LRUCache[K, V] extends StObject {
    
    /**
      * Same as Options.allowStale.
      */
    var allowStale: Boolean = js.native
    
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
      * Return total quantity of objects currently in cache. Note,
      * that `stale` (see options) items are returned as part of this item count.
      */
    val itemCount: Double = js.native
    
    /**
      * Return an array of the keys in the cache.
      */
    def keys(): js.Array[K] = js.native
    
    /**
      * Return total length of objects in cache taking into account `length` options function.
      */
    val length: Double = js.native
    
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
      * Same as Options.max. Resizes the cache when the `max` changes.
      */
    var max: Double = js.native
    
    /**
      * Same as Options.maxAge. Resizes the cache when the `maxAge` changes.
      */
    var maxAge: Double = js.native
    
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
  
  trait Options[K, V] extends StObject {
    
    /**
      * Function that is called on items when they are dropped from the cache.
      * This can be handy if you want to close file descriptors or do other
      * cleanup tasks when items are no longer accessible. Called with `key, value`.
      * It's called before actually removing the item from the internal cache,
      * so if you want to immediately put it back in, you'll have to do that in
      * a `nextTick` or `setTimeout` callback or it won't do anything.
      */
    var dispose: js.UndefOr[js.Function2[/* key */ K, /* value */ V, Unit]] = js.undefined
    
    /**
      * Function that is used to calculate the length of stored items.
      * If you're storing strings or buffers, then you probably want to do
      * something like `function(n, key){return n.length}`. The default
      * is `function(){return 1}`, which is fine if you want to store
      * `max` like-sized things. The item is passed as the first argument,
      * and the key is passed as the second argument.
      */
    var length: js.UndefOr[js.Function2[/* value */ V, /* key */ js.UndefOr[K], Double]] = js.undefined
    
    /**
      * The maximum size of the cache, checked by applying the length
      * function to all values in the cache. Not setting this is kind of silly,
      * since that's the whole purpose of this lib, but it defaults to `Infinity`.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum age in ms. Items are not pro-actively pruned out as they age,
      * but if you try to get an item that is too old, it'll drop it and return
      * undefined instead of giving it to you.
      */
    var maxAge: js.UndefOr[Double] = js.undefined
    
    /**
      * By default, if you set a `dispose()` method, then it'll be called whenever
      * a `set()` operation overwrites an existing key. If you set this option,
      * `dispose()` will only be called when a key falls out of the cache,
      * not when it is overwritten.
      */
    var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, if you set a `maxAge`, it'll only actually pull stale items
      * out of the cache when you `get(key)`. (That is, it's not pre-emptively
      * doing a `setTimeout` or anything.) If you set `stale:true`, it'll return
      * the stale value before deleting it. If you don't set this, then it'll
      * return `undefined` when you try to get a stale entry,
      * as if it had already been deleted.
      */
    var stale: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When using time-expiring entries with `maxAge`, setting this to `true` will make each
      * item's effective time update to the current time whenever it is retrieved from cache,
      * causing it to not expire. (It can still fall out of cache based on recency of use, of
      * course.)
      */
    var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[K, V](): Options[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[K, V]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?, ?], K, V] (val x: Self & (Options[K, V])) extends AnyVal {
      
      @scala.inline
      def setDispose(value: (/* key */ K, /* value */ V) => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      @scala.inline
      def setLength(value: (/* value */ V, /* key */ js.UndefOr[K]) => Double): Self = StObject.set(x, "length", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
      
      @scala.inline
      def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
      
      @scala.inline
      def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
    }
  }
}
