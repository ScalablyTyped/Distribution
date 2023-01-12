package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeprecatedOptions[K, V] extends StObject {
  
  /**
    * alias for sizeCalculation
    *
    * @deprecated since 7.0 use options.sizeCalculation instead
    */
  var length: js.UndefOr[SizeCalculator[K, V]] = js.undefined
  
  /**
    * alias for ttl
    *
    * @deprecated since 7.0 use options.ttl instead
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  
  /**
    * alias for allowStale
    *
    * @deprecated since 7.0 use options.allowStale instead
    */
  var stale: js.UndefOr[Boolean] = js.undefined
}
object DeprecatedOptions {
  
  inline def apply[K, V](): DeprecatedOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprecatedOptions[K, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeprecatedOptions[?, ?], K, V] (val x: Self & (DeprecatedOptions[K, V])) extends AnyVal {
    
    inline def setLength(value: (V, K) => Double): Self = StObject.set(x, "length", js.Any.fromFunction2(value))
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setStale(value: Boolean): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
  }
}
