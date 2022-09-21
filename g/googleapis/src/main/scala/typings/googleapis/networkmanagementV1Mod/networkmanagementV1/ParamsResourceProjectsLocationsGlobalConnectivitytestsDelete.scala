package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalConnectivitytestsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Connectivity Test resource name using the form: `projects/{project_id\}/locations/global/connectivityTests/{test_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalConnectivitytestsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalConnectivitytestsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalConnectivitytestsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalConnectivitytestsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
