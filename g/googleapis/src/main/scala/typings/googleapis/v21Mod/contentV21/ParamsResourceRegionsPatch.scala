package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to update region definition.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the region to update.
    */
  var regionId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRegion] = js.undefined
  
  /**
    * Optional. The comma-separated field mask indicating the fields to update. Example: `"displayName,postalCodeArea.regionCode"`.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionsPatch {
  
  inline def apply(): ParamsResourceRegionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionsPatch]
  }
  
  extension [Self <: ParamsResourceRegionsPatch](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    inline def setRequestBody(value: SchemaRegion): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
