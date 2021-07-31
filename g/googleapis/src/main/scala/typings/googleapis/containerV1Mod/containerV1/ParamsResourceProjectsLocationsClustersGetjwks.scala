package typings.googleapis.containerV1Mod.containerV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsClustersGetjwks
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The cluster (project, location, cluster id) to get keys for. Specified in
    * the format 'projects/x/locations/x/clusters/x'.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsClustersGetjwks {
  
  @scala.inline
  def apply(): ParamsResourceProjectsLocationsClustersGetjwks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsClustersGetjwks]
  }
  
  @scala.inline
  implicit class ParamsResourceProjectsLocationsClustersGetjwksMutableBuilder[Self <: ParamsResourceProjectsLocationsClustersGetjwks] (val x: Self) extends AnyVal {
    
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
