package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The ID of the DV360 advertiser to which the location list belongs.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the assigned location to delete.
    */
  var assignedLocationId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the location list to which this assignment is assigned.
    */
  var locationListId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete {
  
  inline def apply(): ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete]
  }
  
  extension [Self <: ParamsResourceAdvertisersLocationlistsAssignedlocationsDelete](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setAssignedLocationId(value: String): Self = StObject.set(x, "assignedLocationId", value.asInstanceOf[js.Any])
    
    inline def setAssignedLocationIdUndefined: Self = StObject.set(x, "assignedLocationId", js.undefined)
    
    inline def setLocationListId(value: String): Self = StObject.set(x, "locationListId", value.asInstanceOf[js.Any])
    
    inline def setLocationListIdUndefined: Self = StObject.set(x, "locationListId", js.undefined)
  }
}
