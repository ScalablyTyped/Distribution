package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceProjectsReleasesGetexecutable extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The requested runtime executable version. Defaults to
    * FIREBASE_RULES_EXECUTABLE_V1.
    */
  var executableVersion: js.UndefOr[String] = js.native
  
  /**
    * Resource name of the `Release`.  Format:
    * `projects/{project_id}/releases/{release_id}`
    */
  var name: js.UndefOr[String] = js.native
}
object ParamsResourceProjectsReleasesGetexecutable {
  
  @scala.inline
  def apply(): ParamsResourceProjectsReleasesGetexecutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsReleasesGetexecutable]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsReleasesGetexecutableMutableBuilder[Self <: ParamsResourceProjectsReleasesGetexecutable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setExecutableVersion(value: String): Self = StObject.set(x, "executableVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutableVersionUndefined: Self = StObject.set(x, "executableVersion", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
