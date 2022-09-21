package typings.googleapis.mybusinessaccountmanagementV1Mod.mybusinessaccountmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsAdminsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the location to list admins of. `locations/{location_id\}/admins`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsAdminsList {
  
  inline def apply(): ParamsResourceLocationsAdminsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsAdminsList]
  }
  
  extension [Self <: ParamsResourceLocationsAdminsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
