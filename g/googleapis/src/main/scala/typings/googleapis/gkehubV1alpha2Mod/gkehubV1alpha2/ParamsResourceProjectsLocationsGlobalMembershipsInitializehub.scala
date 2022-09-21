package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalMembershipsInitializehub
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The Hub to initialize, in the format `projects/x/locations/x/memberships/x`.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInitializeHubRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalMembershipsInitializehub {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalMembershipsInitializehub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalMembershipsInitializehub]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalMembershipsInitializehub](x: Self) {
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRequestBody(value: SchemaInitializeHubRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
