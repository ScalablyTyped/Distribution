package typings.lib0

import typings.lib0.distListMod.ListNode
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCacheMod {
  
  @JSImport("lib0/dist/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist/cache", "Cache")
  @js.native
  open class Cache[K, V] protected () extends StObject {
    /**
      * @param {number} timeout
      */
    def this(timeout: Double) = this()
    
    /**
      * @type {Map<K, Entry<K, V>>}
      */
    var _map: Map[K, Entry[K, V]] = js.native
    
    /**
      * @type list.List<Entry<K, V>>
      */
    var _q: typings.lib0.distListMod.List[Entry[K, V]] = js.native
    
    var timeout: Double = js.native
  }
  
  inline def create(timeout: Double): Cache[Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(timeout.asInstanceOf[js.Any]).asInstanceOf[Cache[Any, Any]]
  
  inline def get[K, V](cache: Cache[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  inline def getAsync[K, V](cache: Cache[K, V], key: K): js.UndefOr[V | js.Promise[V]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V | js.Promise[V]]]
  
  inline def refreshTimeout[K, V](cache: Cache[K, V], key: K): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("refreshTimeout")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def remove[K, V](cache: Cache[K, V], key: K): js.UndefOr[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("remove")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[V]]
  
  inline def removeStale[K, V](cache: Cache[K, V]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("removeStale")(cache.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set[K, V](cache: Cache[K, V], key: K, value: V): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setIfUndefined[K, V](cache: Cache[K, V], key: K, init: js.Function0[js.Promise[V]]): V | js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIfUndefined")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[V | js.Promise[V]]
  inline def setIfUndefined[K, V](cache: Cache[K, V], key: K, init: js.Function0[js.Promise[V]], removeNull: Boolean): V | js.Promise[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("setIfUndefined")(cache.asInstanceOf[js.Any], key.asInstanceOf[js.Any], init.asInstanceOf[js.Any], removeNull.asInstanceOf[js.Any])).asInstanceOf[V | js.Promise[V]]
  
  /**
    * @template K, V
    *
    * @implements {list.ListNode}
    */
  @js.native
  trait Entry[K, V] extends ListNode {
    
    var created: Double = js.native
    
    var key: K = js.native
    
    /**
      * @type {this | null}
      */
    @JSName("next")
    var next_Entry: (Entry[K, V]) | Null = js.native
    
    /**
      * @type {this | null}
      */
    @JSName("prev")
    var prev_Entry: (Entry[K, V]) | Null = js.native
    
    var `val`: V | js.Promise[V] = js.native
  }
}
