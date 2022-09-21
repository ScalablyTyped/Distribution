package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoliciesPatchResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  var policy: js.UndefOr[SchemaPolicy] = js.undefined
}
object SchemaPoliciesPatchResponse {
  
  inline def apply(): SchemaPoliciesPatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoliciesPatchResponse]
  }
  
  extension [Self <: SchemaPoliciesPatchResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
