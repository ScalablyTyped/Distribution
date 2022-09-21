package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnPolicyOnlineReturnShippingFee extends StObject {
  
  /** Fixed return shipping fee amount. This value is only applicable when type is FIXED. We will treat the return shipping fee as free if type is FIXED and this value is not set. */
  var fixedFee: js.UndefOr[PriceAmount] = js.undefined
  
  /** Type of return shipping fee. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ReturnPolicyOnlineReturnShippingFee {
  
  inline def apply(): ReturnPolicyOnlineReturnShippingFee = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReturnPolicyOnlineReturnShippingFee]
  }
  
  extension [Self <: ReturnPolicyOnlineReturnShippingFee](x: Self) {
    
    inline def setFixedFee(value: PriceAmount): Self = StObject.set(x, "fixedFee", value.asInstanceOf[js.Any])
    
    inline def setFixedFeeUndefined: Self = StObject.set(x, "fixedFee", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
