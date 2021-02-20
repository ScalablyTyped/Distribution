package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Required. The parent resource name, which should be a scan run resource
    * name in the format
    * 'projects/{projectId}/scanConfigs/{scanConfigId}/scanRuns/{scanRunId}'.
    */
  var parent: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList {
  
  @scala.inline
  def apply(): ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsListMutableBuilder[Self <: ParamsResourceProjectsScanconfigsScanrunsFindingtypestatsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
