package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePosInventory
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the POS or inventory data provider.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPosInventoryRequest] = js.undefined
  
  /**
    * The ID of the target merchant.
    */
  var targetMerchantId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePosInventory {
  
  inline def apply(): ParamsResourcePosInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePosInventory]
  }
  
  extension [Self <: ParamsResourcePosInventory](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRequestBody(value: SchemaPosInventoryRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTargetMerchantId(value: String): Self = StObject.set(x, "targetMerchantId", value.asInstanceOf[js.Any])
    
    inline def setTargetMerchantIdUndefined: Self = StObject.set(x, "targetMerchantId", js.undefined)
  }
}
