package typings.googleapis.v1beta4Mod.sqladminV1beta4

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceInstancesRestart extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Cloud SQL instance ID. This does not include the project ID.
    */
  var instance: js.UndefOr[String] = js.native
  
  /**
    * Project ID of the project that contains the instance to be restarted.
    */
  var project: js.UndefOr[String] = js.native
}
object ParamsResourceInstancesRestart {
  
  @scala.inline
  def apply(): ParamsResourceInstancesRestart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInstancesRestart]
  }
  
  @scala.inline
  implicit class ParamsResourceInstancesRestartMutableBuilder[Self <: ParamsResourceInstancesRestart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
