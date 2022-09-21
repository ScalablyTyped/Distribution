package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResponsePolicyRulesUpdateResponse extends StObject {
  
  var header: js.UndefOr[SchemaResponseHeader] = js.undefined
  
  var responsePolicyRule: js.UndefOr[SchemaResponsePolicyRule] = js.undefined
}
object SchemaResponsePolicyRulesUpdateResponse {
  
  inline def apply(): SchemaResponsePolicyRulesUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponsePolicyRulesUpdateResponse]
  }
  
  extension [Self <: SchemaResponsePolicyRulesUpdateResponse](x: Self) {
    
    inline def setHeader(value: SchemaResponseHeader): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    inline def setResponsePolicyRule(value: SchemaResponsePolicyRule): Self = StObject.set(x, "responsePolicyRule", value.asInstanceOf[js.Any])
    
    inline def setResponsePolicyRuleUndefined: Self = StObject.set(x, "responsePolicyRule", js.undefined)
  }
}
