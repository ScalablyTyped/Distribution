package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceReturnaddressInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The Merchant Center account to insert a return address for.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReturnAddress] = js.undefined
}
object ParamsResourceReturnaddressInsert {
  
  inline def apply(): ParamsResourceReturnaddressInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReturnaddressInsert]
  }
  
  extension [Self <: ParamsResourceReturnaddressInsert](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaReturnAddress): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
