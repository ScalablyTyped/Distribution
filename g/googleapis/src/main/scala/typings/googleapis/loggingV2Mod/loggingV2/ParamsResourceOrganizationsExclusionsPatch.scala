package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsExclusionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The resource name of the exclusion to update:
    * "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
    * "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
    * "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example:
    * "projects/my-project-id/exclusions/my-exclusion-id".
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLogExclusion] = js.undefined
  
  /**
    * Required. A nonempty list of fields to change in the existing exclusion.
    * New values for the fields are taken from the corresponding fields in the
    * LogExclusion included in this request. Fields not mentioned in
    * update_mask are not changed and are ignored in the request.For example,
    * to change the filter and description of an exclusion, specify an
    * update_mask of "filter,description".
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsExclusionsPatch {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsExclusionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsExclusionsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsExclusionsPatchMutableBuilder[Self <: ParamsResourceOrganizationsExclusionsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaLogExclusion): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
