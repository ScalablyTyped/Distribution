package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePoliciesPatchResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  var responsePolicy: js.UndefOr[SchemaResponsePolicy] = js.undefined
}
object SchemaResponsePoliciesPatchResponse {
  
  inline def apply(): SchemaResponsePoliciesPatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePoliciesPatchResponse]
  }
  
  extension [Self <: SchemaResponsePoliciesPatchResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setResponsePolicy(value: SchemaResponsePolicy): Self = StObject.set(x, "responsePolicy", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyUndefined: Self = StObject.set(x, "responsePolicy", js.undefined)
  }
}
