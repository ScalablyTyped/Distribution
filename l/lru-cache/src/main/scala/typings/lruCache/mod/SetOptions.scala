package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options which override the options set in the LRUCache constructor
  * when making `cache.set()` calls.
  */
trait SetOptions[K, V] extends StObject {
  
  var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
  
  var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value for the size of the entry, prevents calls to
    * `sizeCalculation` function.
    */
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
}
object SetOptions {
  
  inline def apply[K, V](): SetOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetOptions[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetOptions[?, ?], K, V] (val x: Self & (SetOptions[K, V])) extends AnyVal {
    
    inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
    
    inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
    
    inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
    
    inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeCalculation(value: (V, K) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
    
    inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
  }
}
