package typings.googleapis.monitoringV3Mod.monitoringV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsMetricdescriptorsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The metric descriptor on which to execute the request. The format is
    * "projects/{project_id_or_number}/metricDescriptors/{metric_id}". An
    * example value of {metric_id} is
    * "compute.googleapis.com/instance/disk/read_bytes_count".
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsMetricdescriptorsGet {
  
  @scala.inline
  def apply(): ParamsResourceProjectsMetricdescriptorsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsMetricdescriptorsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsMetricdescriptorsGetMutableBuilder[Self <: ParamsResourceProjectsMetricdescriptorsGet] (val x: Self) extends AnyVal {
    
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
