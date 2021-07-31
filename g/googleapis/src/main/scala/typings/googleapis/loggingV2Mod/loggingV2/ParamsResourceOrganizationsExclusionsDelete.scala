package typings.googleapis.loggingV2Mod.loggingV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceOrganizationsExclusionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Required. The resource name of an existing exclusion to delete:
    * "projects/[PROJECT_ID]/exclusions/[EXCLUSION_ID]"
    * "organizations/[ORGANIZATION_ID]/exclusions/[EXCLUSION_ID]"
    * "billingAccounts/[BILLING_ACCOUNT_ID]/exclusions/[EXCLUSION_ID]"
    * "folders/[FOLDER_ID]/exclusions/[EXCLUSION_ID]" Example:
    * "projects/my-project-id/exclusions/my-exclusion-id".
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceOrganizationsExclusionsDelete {
  
  @scala.inline
  def apply(): ParamsResourceOrganizationsExclusionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsExclusionsDelete]
  }
  
  @scala.inline
  implicit class ParamsResourceOrganizationsExclusionsDeleteMutableBuilder[Self <: ParamsResourceOrganizationsExclusionsDelete] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
