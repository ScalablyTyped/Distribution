package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The name of the FHIR store this resource belongs to.
    */
  var parent: js.UndefOr[String] = js.native
  
  /**
    * The type of the resource to update.
    */
  var `type`: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresourceMutableBuilder[Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConditionaldeleteresource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
