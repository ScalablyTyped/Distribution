package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDatafeedsInsert
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the account that manages the datafeed. This account cannot be a multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDatafeed] = js.undefined
}
object ParamsResourceDatafeedsInsert {
  
  inline def apply(): ParamsResourceDatafeedsInsert = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDatafeedsInsert]
  }
  
  extension [Self <: ParamsResourceDatafeedsInsert](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaDatafeed): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
