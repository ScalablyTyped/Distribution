package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalConnectivitytestsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the Connectivity Test to create: `projects/{project_id\}/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaConnectivityTest] = js.undefined
  
  /**
    * Required. The logical name of the Connectivity Test in your project with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-40 characters. * Must end with a number or a letter. * Must be unique within the customer project
    */
  var testId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalConnectivitytestsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalConnectivitytestsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalConnectivitytestsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalConnectivitytestsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaConnectivityTest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setTestId(value: String): Self = StObject.set(x, "testId", value.asInstanceOf[js.Any])
    
    inline def setTestIdUndefined: Self = StObject.set(x, "testId", js.undefined)
  }
}
