package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalConnectivitytestsRerun
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Connectivity Test resource name using the form: `projects/{project_id\}/locations/global/connectivityTests/{test_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRerunConnectivityTestRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalConnectivitytestsRerun {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalConnectivitytestsRerun = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalConnectivitytestsRerun]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalConnectivitytestsRerun](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaRerunConnectivityTestRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
