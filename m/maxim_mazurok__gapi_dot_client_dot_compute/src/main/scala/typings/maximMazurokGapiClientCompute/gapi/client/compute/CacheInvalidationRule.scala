package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheInvalidationRule extends StObject {
  
  /** If set, this invalidation rule will only apply to requests with a Host header matching host. */
  var host: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object CacheInvalidationRule {
  
  inline def apply(): CacheInvalidationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheInvalidationRule]
  }
  
  extension [Self <: CacheInvalidationRule](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
