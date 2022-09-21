package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLocationlistsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the location lists belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The unique ID of the location list. Assigned by the system.
    */
  var locationListId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLocationList] = js.undefined
  
  /**
    * Required. The mask to control which fields to update.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLocationlistsPatch {
  
  inline def apply(): ParamsResourceAdvertisersLocationlistsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLocationlistsPatch]
  }
  
  extension [Self <: ParamsResourceAdvertisersLocationlistsPatch](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    inline def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
    
    inline def setRequestBody(value: SchemaLocationList): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
