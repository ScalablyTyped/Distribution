package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Name of the FHIR store to retrieve resources from.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the resource to search.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresResourcesSearchresources](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
