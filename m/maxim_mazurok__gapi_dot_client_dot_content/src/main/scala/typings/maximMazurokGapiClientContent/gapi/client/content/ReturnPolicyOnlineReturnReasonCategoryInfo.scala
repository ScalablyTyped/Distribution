package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnPolicyOnlineReturnReasonCategoryInfo extends StObject {
  
  /** The corresponding return label source. */
  var returnLabelSource: js.UndefOr[String] = js.undefined
  
  /** The return reason category. */
  var returnReasonCategory: js.UndefOr[String] = js.undefined
  
  /** The corresponding return shipping fee. This is only applicable when returnLabelSource is not the customer's responsibility. */
  var returnShippingFee: js.UndefOr[ReturnPolicyOnlineReturnShippingFee] = js.undefined
}
object ReturnPolicyOnlineReturnReasonCategoryInfo {
  
  inline def apply(): ReturnPolicyOnlineReturnReasonCategoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyOnlineReturnReasonCategoryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnPolicyOnlineReturnReasonCategoryInfo] (val x: Self) extends AnyVal {
    
    inline def setReturnLabelSource(value: String): Self = StObject.set(x, "returnLabelSource", value.asInstanceOf[js.Any])
    
    inline def setReturnLabelSourceUndefined: Self = StObject.set(x, "returnLabelSource", js.undefined)
    
    inline def setReturnReasonCategory(value: String): Self = StObject.set(x, "returnReasonCategory", value.asInstanceOf[js.Any])
    
    inline def setReturnReasonCategoryUndefined: Self = StObject.set(x, "returnReasonCategory", js.undefined)
    
    inline def setReturnShippingFee(value: ReturnPolicyOnlineReturnShippingFee): Self = StObject.set(x, "returnShippingFee", value.asInstanceOf[js.Any])
    
    inline def setReturnShippingFeeUndefined: Self = StObject.set(x, "returnShippingFee", js.undefined)
  }
}
