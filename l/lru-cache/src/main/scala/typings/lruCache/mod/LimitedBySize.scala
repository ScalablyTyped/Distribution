package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LimitedBySize[K, V]
  extends StObject
     with SafetyBounds[K, V] {
  
  /**
    * If you wish to track item size, you must provide a maxSize
    * note that we still will only keep up to max *actual items*,
    * if max is set, so size tracking may cause fewer than max items
    * to be stored.  At the extreme, a single item of maxSize size
    * will cause everything else in the cache to be dropped when it
    * is added.  Use with caution!
    * Note also that size tracking can negatively impact performance,
    * though for most cases, only minimally.
    */
  var maxSize: Double
  
  /**
    * Function to calculate size of items.  Useful if storing strings or
    * buffers or other items where memory size depends on the object itself.
    * Also note that oversized items do NOT immediately get dropped from
    * the cache, though they will cause faster turnover in the storage.
    */
  var sizeCalculation: js.UndefOr[SizeCalculator[K, V]] = js.undefined
}
object LimitedBySize {
  
  inline def apply[K, V](maxSize: Double): LimitedBySize[K, V] = {
    val __obj = js.Dynamic.literal(maxSize = maxSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitedBySize[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LimitedBySize[?, ?], K, V] (val x: Self & (LimitedBySize[K, V])) extends AnyVal {
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setSizeCalculation(value: (V, K) => Double): Self = StObject.set(x, "sizeCalculation", js.Any.fromFunction2(value))
    
    inline def setSizeCalculationUndefined: Self = StObject.set(x, "sizeCalculation", js.undefined)
  }
}
