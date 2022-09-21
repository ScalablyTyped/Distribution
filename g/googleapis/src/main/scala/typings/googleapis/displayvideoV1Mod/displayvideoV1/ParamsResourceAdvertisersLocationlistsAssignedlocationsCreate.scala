package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the location list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the location list for which the assignment will be created.
    */
  var locationListId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAssignedLocation] = js.undefined
}
object ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate {
  
  inline def apply(): ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate]
  }
  
  extension [Self <: ParamsResourceAdvertisersLocationlistsAssignedlocationsCreate](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    inline def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
    
    inline def setRequestBody(value: SchemaAssignedLocation): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
