package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreturnsProcess
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account that manages the order. This cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaOrderreturnsProcessRequest] = js.undefined
  
  /**
    * The ID of the return.
    */
  var returnId: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrderreturnsProcess {
  
  inline def apply(): ParamsResourceOrderreturnsProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreturnsProcess]
  }
  
  extension [Self <: ParamsResourceOrderreturnsProcess](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaOrderreturnsProcessRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    inline def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
