package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceResourcesBuildingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The id of the building to delete.
    */
  var buildingId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID for the customer's Google Workspace account. As an account administrator, you can also use the `my_customer` alias to represent your account's customer ID.
    */
  var customer: js.UndefOr[String] = js.undefined
}
object ParamsResourceResourcesBuildingsDelete {
  
  inline def apply(): ParamsResourceResourcesBuildingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceResourcesBuildingsDelete]
  }
  
  extension [Self <: ParamsResourceResourcesBuildingsDelete](x: Self) {
    
    inline def setBuildingId(value: String): Self = StObject.set(x, "buildingId", value.asInstanceOf[js.Any])
    
    inline def setBuildingIdUndefined: Self = StObject.set(x, "buildingId", js.undefined)
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
  }
}
