package typings.lruCache

import typings.lruCache.distCjsMod.Index
import typings.lruCache.distCjsMod.LRUCache.FetchOptions
import typings.lruCache.distCjsMod.NumberArray
import typings.lruCache.distCjsMod.StackLike
import typings.lruCache.distCjsMod.ZeroArray
import typings.std.Generator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllowStale extends StObject {
    
    var allowStale: Boolean
  }
  object AllowStale {
    
    inline def apply(allowStale: Boolean): AllowStale = {
      val __obj = js.Dynamic.literal(allowStale = allowStale.asInstanceOf[js.Any])
      __obj.asInstanceOf[AllowStale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowStale] (val x: Self) extends AnyVal {
      
      inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BackgroundFetch[K /* <: js.Object */, V /* <: js.Object */, FC /* <: Any */] extends StObject {
    
    def backgroundFetch(k: K, index: Double, options: FetchOptions[K, V, FC], context: Any): typings.lruCache.distCjsMod.BackgroundFetch[V] = js.native
    def backgroundFetch(k: K, index: Unit, options: FetchOptions[K, V, FC], context: Any): typings.lruCache.distCjsMod.BackgroundFetch[V] = js.native
    
    var free: StackLike = js.native
    
    val head: Index = js.native
    
    def indexes(): Generator[Index, Unit, Any] = js.native
    def indexes(options: AllowStale): Generator[Index, Unit, Any] = js.native
    
    def isBackgroundFetch(p: Any): Boolean = js.native
    
    def isStale(): Boolean = js.native
    def isStale(index: Double): Boolean = js.native
    
    var keyList: js.Array[js.UndefOr[K]] = js.native
    
    var keyMap: Map[K, Double] = js.native
    
    def moveToTail(index: Double): Unit = js.native
    
    var next: NumberArray = js.native
    
    var prev: NumberArray = js.native
    
    def rindexes(): Generator[Index, Unit, Any] = js.native
    def rindexes(options: AllowStale): Generator[Index, Unit, Any] = js.native
    
    var sizes: js.UndefOr[ZeroArray] = js.native
    
    var starts: js.UndefOr[ZeroArray] = js.native
    
    val tail: Index = js.native
    
    var ttls: js.UndefOr[ZeroArray] = js.native
    
    var valList: js.Array[js.UndefOr[V | typings.lruCache.distCjsMod.BackgroundFetch[V]]] = js.native
  }
  
  @js.native
  trait Free[K /* <: js.Object */, V /* <: js.Object */, FC /* <: Any */] extends StObject {
    
    def backgroundFetch(
      k: K,
      index: Double,
      options: typings.lruCache.distMjsMod.LRUCache.FetchOptions[K, V, FC],
      context: Any
    ): typings.lruCache.distMjsMod.BackgroundFetch[V] = js.native
    def backgroundFetch(
      k: K,
      index: Unit,
      options: typings.lruCache.distMjsMod.LRUCache.FetchOptions[K, V, FC],
      context: Any
    ): typings.lruCache.distMjsMod.BackgroundFetch[V] = js.native
    
    var free: typings.lruCache.distMjsMod.StackLike = js.native
    
    val head: typings.lruCache.distMjsMod.Index = js.native
    
    def indexes(): Generator[typings.lruCache.distMjsMod.Index, Unit, Any] = js.native
    def indexes(options: AllowStale): Generator[typings.lruCache.distMjsMod.Index, Unit, Any] = js.native
    
    def isBackgroundFetch(p: Any): Boolean = js.native
    
    def isStale(): Boolean = js.native
    def isStale(index: Double): Boolean = js.native
    
    var keyList: js.Array[js.UndefOr[K]] = js.native
    
    var keyMap: Map[K, Double] = js.native
    
    def moveToTail(index: Double): Unit = js.native
    
    var next: typings.lruCache.distMjsMod.NumberArray = js.native
    
    var prev: typings.lruCache.distMjsMod.NumberArray = js.native
    
    def rindexes(): Generator[typings.lruCache.distMjsMod.Index, Unit, Any] = js.native
    def rindexes(options: AllowStale): Generator[typings.lruCache.distMjsMod.Index, Unit, Any] = js.native
    
    var sizes: js.UndefOr[typings.lruCache.distMjsMod.ZeroArray] = js.native
    
    var starts: js.UndefOr[typings.lruCache.distMjsMod.ZeroArray] = js.native
    
    val tail: typings.lruCache.distMjsMod.Index = js.native
    
    var ttls: js.UndefOr[typings.lruCache.distMjsMod.ZeroArray] = js.native
    
    var valList: js.Array[js.UndefOr[V | typings.lruCache.distMjsMod.BackgroundFetch[V]]] = js.native
  }
}
