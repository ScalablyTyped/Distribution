package typings.lruMap

import typings.lruMap.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lru_map", "LRUMap")
  @js.native
  open class LRUMap[K, V] protected () extends StObject {
    // Convenience constructor equivalent to `new LRUMap(count(entries), entries)`
    def this(entries: js.Iterable[js.Tuple2[K, V]]) = this()
    // Construct a new cache object which will hold up to limit entries.
    // When the size == limit, a `put` operation will evict the oldest entry.
    //
    // If `entries` is provided, all entries are added to the new map.
    // `entries` should be an Array or other iterable object whose elements are
    // key-value pairs (2-element Arrays). Each key-value pair is added to the new Map.
    // null is treated as undefined.
    def this(limit: Double) = this()
    def this(limit: Double, entries: js.Iterable[js.Tuple2[K, V]]) = this()
    
    // Replace all values in this map with key-value pairs (2-element Arrays) from
    // provided iterable.
    def assign(entries: js.Iterable[js.Tuple2[K, V]]): Unit = js.native
    
    // Removes all entries
    def clear(): Unit = js.native
    
    // Remove entry <key> from cache and return its value.
    // Returns the removed value, or undefined if not found.
    def delete(key: K): js.UndefOr[V] = js.native
    
    // Returns an iterator over all entries, starting with the oldest.
    def entries(): js.Iterator[js.Tuple2[K, V]] = js.native
    
    // Access value for <key> without registering recent use. Useful if you do not
    // want to chage the state of the map, but only "peek" at it.
    // Returns the value associated with <key> if found, or undefined if not found.
    def find(key: K): js.UndefOr[V] = js.native
    
    // Call `fun` for each entry, starting with the oldest entry.
    def forEach(fun: js.Function3[/* value */ V, /* key */ K, /* m */ LRUMap[K, V], Unit]): Unit = js.native
    def forEach(fun: js.Function3[/* value */ V, /* key */ K, /* m */ LRUMap[K, V], Unit], thisArg: Any): Unit = js.native
    
    // Get and register recent use of <key>.
    // Returns the value associated with <key> or undefined if not in cache.
    def get(key: K): js.UndefOr[V] = js.native
    
    // Check if there's a value for key in the cache without registering recent use.
    def has(key: K): Boolean = js.native
    
    // Returns an iterator over all entries, starting with the oldest.
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[js.Iterator[js.Tuple2[K, V]]] = js.native
    
    // Returns an iterator over all keys, starting with the oldest.
    def keys(): js.Iterator[K] = js.native
    
    // Maximum number of items this map can hold
    var limit: Double = js.native
    
    // Most recently-used entry. Invalidated when map is modified.
    var newest: Entry[K, V] = js.native
    
    // Least recently-used entry. Invalidated when map is modified.
    var oldest: Entry[K, V] = js.native
    
    // Put <value> into the cache associated with <key>. Replaces any existing entry
    // with the same key. Returns `this`.
    def set(key: K, value: V): LRUMap[K, V] = js.native
    
    // Purge the least recently used (oldest) entry from the cache.
    // Returns the removed entry or undefined if the cache was empty.
    def shift(): js.UndefOr[js.Tuple2[K, V]] = js.native
    
    // Current number of items
    var size: Double = js.native
    
    // Returns an object suitable for JSON encoding
    def toJSON(): js.Array[Key[K, V]] = js.native
    
    // Returns an iterator over all values, starting with the oldest.
    def values(): js.Iterator[V] = js.native
  }
  
  // An entry holds the key and value, and pointers to any older and newer entries.
  trait Entry[K, V] extends StObject {
    
    var key: K
    
    var value: V
  }
  object Entry {
    
    inline def apply[K, V](key: K, value: V): Entry[K, V] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry[K, V]]
    }
    
    extension [Self <: Entry[?, ?], K, V](x: Self & (Entry[K, V])) {
      
      inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
