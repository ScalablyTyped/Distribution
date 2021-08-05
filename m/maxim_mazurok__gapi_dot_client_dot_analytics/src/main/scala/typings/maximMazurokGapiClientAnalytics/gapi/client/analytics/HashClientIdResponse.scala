package typings.maximMazurokGapiClientAnalytics.gapi.client.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HashClientIdResponse extends StObject {
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var hashedClientId: js.UndefOr[String] = js.undefined
  
  var kind: js.UndefOr[String] = js.undefined
  
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object HashClientIdResponse {
  
  inline def apply(): HashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HashClientIdResponse]
  }
  
  extension [Self <: HashClientIdResponse](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHashedClientId(value: String): Self = StObject.set(x, "hashedClientId", value.asInstanceOf[js.Any])
    
    inline def setHashedClientIdUndefined: Self = StObject.set(x, "hashedClientId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
