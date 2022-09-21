package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRepricingrulesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant who owns the repricing rule.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the rule to Delete.
    */
  var ruleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceRepricingrulesDelete {
  
  inline def apply(): ParamsResourceRepricingrulesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRepricingrulesDelete]
  }
  
  extension [Self <: ParamsResourceRepricingrulesDelete](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
  }
}
