package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnpolicyonlineDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to retrieve the return policy online object.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the return policy to delete.
    */
  var returnPolicyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceReturnpolicyonlineDelete {
  
  inline def apply(): ParamsResourceReturnpolicyonlineDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnpolicyonlineDelete]
  }
  
  extension [Self <: ParamsResourceReturnpolicyonlineDelete](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setReturnPolicyId(value: String): Self = StObject.set(x, "returnPolicyId", value.asInstanceOf[js.Any])
    
    inline def setReturnPolicyIdUndefined: Self = StObject.set(x, "returnPolicyId", js.undefined)
  }
}
