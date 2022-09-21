package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The id of the merchant for which to create region definition.
    */
  var merchantId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The id of the region to create.
    */
  var regionId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRegion] = js.undefined
}
object ParamsResourceRegionsCreate {
  
  inline def apply(): ParamsResourceRegionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionsCreate]
  }
  
  extension [Self <: ParamsResourceRegionsCreate](x: Self) {
    
    inline def setMerchantId(value: String): Self = StObject.set(x, "merchantId", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdUndefined: Self = StObject.set(x, "merchantId", js.undefined)
    
    inline def setRegionId(value: String): Self = StObject.set(x, "regionId", value.asInstanceOf[js.Any])
    
    inline def setRegionIdUndefined: Self = StObject.set(x, "regionId", js.undefined)
    
    inline def setRequestBody(value: SchemaRegion): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
