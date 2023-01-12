package typings.lruCache

import typings.lruCache.mod.SizeCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait MaxEntrySize[K, V] extends StObject {
    
    var maxEntrySize: Double
    
    var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
  }
  object MaxEntrySize {
    
    inline def apply[K, V](maxEntrySize: Double): MaxEntrySize[K, V] = {
      val __obj = js.Dynamic.literal(maxEntrySize = maxEntrySize.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaxEntrySize[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MaxEntrySize[?, ?], K, V] (val x: Self & (MaxEntrySize[K, V])) extends AnyVal {
      
      inline def setMaxEntrySize(value: Double): Self = StObject.set(x, "maxEntrySize", value.asInstanceOf[js.Any])
      
      inline def setSizeCalculation(value: (V, K) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
      
      inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
    }
  }
}
