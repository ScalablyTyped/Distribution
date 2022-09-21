package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesBuildingsUpdate
  extends StObject
     with StandardParameters {
  
  /**
    * The id of the building to update.
    */
  var buildingId: js.UndefOr[String] = js.undefined
  
  /**
    * Source from which Building.coordinates are derived.
    */
  var coordinatesSource: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBuilding] = js.undefined
}
object ParamsResourceResourcesBuildingsUpdate {
  
  inline def apply(): ParamsResourceResourcesBuildingsUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesBuildingsUpdate]
  }
  
  extension [Self <: ParamsResourceResourcesBuildingsUpdate](x: Self) {
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setCoordinatesSource(value: String): Self = StObject.set(x, "coordinatesSource", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesSourceUndefined: Self = StObject.set(x, "coordinatesSource", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setRequestBody(value: SchemaBuilding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
