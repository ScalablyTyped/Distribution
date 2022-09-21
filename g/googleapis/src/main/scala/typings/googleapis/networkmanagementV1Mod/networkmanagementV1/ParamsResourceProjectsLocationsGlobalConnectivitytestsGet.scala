package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalConnectivitytestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. `ConnectivityTest` resource name using the form: `projects/{project_id\}/locations/global/connectivityTests/{test_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalConnectivitytestsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalConnectivitytestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalConnectivitytestsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalConnectivitytestsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
