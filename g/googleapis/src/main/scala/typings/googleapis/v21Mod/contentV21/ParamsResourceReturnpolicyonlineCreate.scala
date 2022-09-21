package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnpolicyonlineCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to retrieve the return policy online object.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReturnPolicyOnline] = js.undefined
}
object ParamsResourceReturnpolicyonlineCreate {
  
  inline def apply(): ParamsResourceReturnpolicyonlineCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnpolicyonlineCreate]
  }
  
  extension [Self <: ParamsResourceReturnpolicyonlineCreate](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaReturnPolicyOnline): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
