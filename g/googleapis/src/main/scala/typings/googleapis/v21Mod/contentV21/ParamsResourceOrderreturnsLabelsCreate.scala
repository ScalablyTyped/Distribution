package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrderreturnsLabelsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The merchant the Return Shipping Label belongs to.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaReturnShippingLabel] = js.undefined
  
  /**
    * Required. Provide the Google-generated merchant order return ID.
    */
  var returnId: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrderreturnsLabelsCreate {
  
  inline def apply(): ParamsResourceOrderreturnsLabelsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrderreturnsLabelsCreate]
  }
  
  extension [Self <: ParamsResourceOrderreturnsLabelsCreate](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaReturnShippingLabel): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    inline def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
