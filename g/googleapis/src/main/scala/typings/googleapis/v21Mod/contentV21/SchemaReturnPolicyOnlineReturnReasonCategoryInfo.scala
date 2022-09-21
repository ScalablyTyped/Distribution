package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicyOnlineReturnReasonCategoryInfo extends StObject {
  
  /**
    * The corresponding return label source.
    */
  var returnLabelSource: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The return reason category.
    */
  var returnReasonCategory: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The corresponding return shipping fee. This is only applicable when returnLabelSource is not the customer's responsibility.
    */
  var returnShippingFee: js.UndefOr[SchemaReturnPolicyOnlineReturnShippingFee] = js.undefined
}
object SchemaReturnPolicyOnlineReturnReasonCategoryInfo {
  
  inline def apply(): SchemaReturnPolicyOnlineReturnReasonCategoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicyOnlineReturnReasonCategoryInfo]
  }
  
  extension [Self <: SchemaReturnPolicyOnlineReturnReasonCategoryInfo](x: Self) {
    
    inline def setReturnLabelSource(value: String): Self = StObject.set(x, "returnLabelSource", value.asInstanceOf[js.Any])
    
    inline def setReturnLabelSourceNull: Self = StObject.set(x, "returnLabelSource", null)
    
    inline def setReturnLabelSourceUndefined: Self = StObject.set(x, "returnLabelSource", js.undefined)
    
    inline def setReturnReasonCategory(value: String): Self = StObject.set(x, "returnReasonCategory", value.asInstanceOf[js.Any])
    
    inline def setReturnReasonCategoryNull: Self = StObject.set(x, "returnReasonCategory", null)
    
    inline def setReturnReasonCategoryUndefined: Self = StObject.set(x, "returnReasonCategory", js.undefined)
    
    inline def setReturnShippingFee(value: SchemaReturnPolicyOnlineReturnShippingFee): Self = StObject.set(x, "returnShippingFee", value.asInstanceOf[js.Any])
    
    inline def setReturnShippingFeeUndefined: Self = StObject.set(x, "returnShippingFee", js.undefined)
  }
}
