package typings.lruCache.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * options which override the options set in the LRUCache constructor
  * when making `cache.get()` calls.
  */
trait GetOptions extends StObject {
  
  var allowStale: js.UndefOr[Boolean] = js.undefined
  
  var noDeleteOnStaleGet: js.UndefOr[Boolean] = js.undefined
  
  var updateAgeOnGet: js.UndefOr[Boolean] = js.undefined
}
object GetOptions {
  
  inline def apply(): GetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOptions]
  }
  
  extension [Self <: GetOptions](x: Self) {
    
    inline def setAllowStale(value: Boolean): Self = StObject.set(x, "allowStale", value.asInstanceOf[js.Any])
    
    inline def setAllowStaleUndefined: Self = StObject.set(x, "allowStale", js.undefined)
    
    inline def setNoDeleteOnStaleGet(value: Boolean): Self = StObject.set(x, "noDeleteOnStaleGet", value.asInstanceOf[js.Any])
    
    inline def setNoDeleteOnStaleGetUndefined: Self = StObject.set(x, "noDeleteOnStaleGet", js.undefined)
    
    inline def setUpdateAgeOnGet(value: Boolean): Self = StObject.set(x, "updateAgeOnGet", value.asInstanceOf[js.Any])
    
    inline def setUpdateAgeOnGetUndefined: Self = StObject.set(x, "updateAgeOnGet", js.undefined)
  }
}
