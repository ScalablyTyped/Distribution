package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHashClientIdResponse extends StObject {
  
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  var hashedClientId: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  var webPropertyId: js.UndefOr[String | Null] = js.undefined
}
object SchemaHashClientIdResponse {
  
  inline def apply(): SchemaHashClientIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHashClientIdResponse]
  }
  
  extension [Self <: SchemaHashClientIdResponse](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setHashedClientId(value: String): Self = StObject.set(x, "hashedClientId", value.asInstanceOf[js.Any])
    
    inline def setHashedClientIdNull: Self = StObject.set(x, "hashedClientId", null)
    
    inline def setHashedClientIdUndefined: Self = StObject.set(x, "hashedClientId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdNull: Self = StObject.set(x, "webPropertyId", null)
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
