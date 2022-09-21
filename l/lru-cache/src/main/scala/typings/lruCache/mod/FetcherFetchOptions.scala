package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetcherFetchOptions[K, V] extends StObject {
  
  var allowStale: js.UndefOr[Boolean] = js.undefined
  
  var noDeleteOnFetchRejection: js.UndefOr[Boolean] = js.undefined
  
  var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
  
  var noDisposeOnSet: js.UndefOr[Boolean] = js.undefined
  
  var noUpdateTTL: js.UndefOr[Boolean] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
  
  var ttl: js.UndefOr[Double] = js.undefined
  
  var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
}
object FetcherFetchOptions {
  
  inline def apply[K, V](): FetcherFetchOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetcherFetchOptions[K, V]]
  }
  
  extension [Self <: FetcherFetchOptions[?, ?], K, V](x: Self & (FetcherFetchOptions[K, V])) {
    
    inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
    
    inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
    
    inline def setNoDeleteOnFetchRejection(value: Boolean): Self = StObject.set(x, "noDeleteOnFetchRejection", value.asInstanceOf[js.Any])
    
    inline def setNoDeleteOnFetchRejectionUndefined: Self = StObject.set(x, "noDeleteOnFetchRejection", js.undefined)
    
    inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
    
    inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
    
    inline def setNoDisposeOnSet(value: Boolean): Self = StObject.set(x, "noDisposeOnSet", value.asInstanceOf[js.Any])
    
    inline def setNoDisposeOnSetUndefined: Self = StObject.set(x, "noDisposeOnSet", js.undefined)
    
    inline def setNoUpdateTTL(value: Boolean): Self = StObject.set(x, "noUpdateTTL", value.asInstanceOf[js.Any])
    
    inline def setNoUpdateTTLUndefined: Self = StObject.set(x, "noUpdateTTL", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeCalculation(value: (V, K) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
    
    inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
    
    inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
    
    inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
  }
}
