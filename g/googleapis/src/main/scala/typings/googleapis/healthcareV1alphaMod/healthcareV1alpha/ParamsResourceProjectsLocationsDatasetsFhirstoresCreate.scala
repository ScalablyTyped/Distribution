package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the FHIR store that is being created. The string must match the
    * following regex: `[\p{L}\p{N}_\-\.]{1,256}`.
    */
  var fhirStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dataset this FHIR store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFhirStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresCreate {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresCreate]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsFhirstoresCreateMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFhirStoreId(value: String): Self = StObject.set(x, "fhirStoreId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFhirStoreIdUndefined: Self = StObject.set(x, "fhirStoreId", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFhirStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
