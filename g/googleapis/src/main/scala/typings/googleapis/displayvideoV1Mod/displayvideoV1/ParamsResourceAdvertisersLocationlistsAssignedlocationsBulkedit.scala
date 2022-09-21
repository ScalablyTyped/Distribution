package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the location list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the location list to which these assignments are assigned.
    */
  var locationListId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBulkEditAssignedLocationsRequest] = js.undefined
}
object ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit {
  
  inline def apply(): ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit]
  }
  
  extension [Self <: ParamsResourceAdvertisersLocationlistsAssignedlocationsBulkedit](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    inline def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
    
    inline def setRequestBody(value: SchemaBulkEditAssignedLocationsRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
