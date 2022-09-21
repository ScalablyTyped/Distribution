package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepricingrulesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant who owns the repricing rule.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRepricingRule] = js.undefined
  
  /**
    * Required. The id of the rule to update.
    */
  var ruleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRepricingrulesPatch {
  
  inline def apply(): ParamsResourceRepricingrulesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepricingrulesPatch]
  }
  
  extension [Self <: ParamsResourceRepricingrulesPatch](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaRepricingRule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
  }
}
