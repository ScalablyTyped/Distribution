package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJSONWebKeysResponse extends StObject {
  
  /** OnePlatform automatically extracts this field and uses it to set the HTTP Cache-Control header. */
  var cacheHeader: js.UndefOr[HttpCacheControlResponseHeader] = js.undefined
  
  /** The public component of the keys used by the cluster to sign token requests. */
  var keys: js.UndefOr[js.Array[Jwk]] = js.undefined
}
object GetJSONWebKeysResponse {
  
  inline def apply(): GetJSONWebKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJSONWebKeysResponse]
  }
  
  extension [Self <: GetJSONWebKeysResponse](x: Self) {
    
    inline def setCacheHeader(value: HttpCacheControlResponseHeader): Self = StObject.set(x, "cacheHeader", value.asInstanceOf[js.Any])
    
    inline def setCacheHeaderUndefined: Self = StObject.set(x, "cacheHeader", js.undefined)
    
    inline def setKeys(value: js.Array[Jwk]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: Jwk*): Self = StObject.set(x, "keys", js.Array(value :_*))
  }
}
