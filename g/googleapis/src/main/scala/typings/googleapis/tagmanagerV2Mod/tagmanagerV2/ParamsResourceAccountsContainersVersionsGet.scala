package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsContainersVersionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The GTM ContainerVersion ID. Specify published to retrieve the currently
    * published version.
    */
  var containerVersionId: js.UndefOr[String] = js.undefined
  
  /**
    * GTM ContainerVersion's API relative path. Example:
    * accounts/{account_id}/containers/{container_id}/versions/{version_id}
    */
  var path: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsContainersVersionsGet {
  
  inline def apply(): ParamsResourceAccountsContainersVersionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsContainersVersionsGet]
  }
  
  extension [Self <: ParamsResourceAccountsContainersVersionsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setContainerVersionId(value: String): Self = StObject.set(x, "containerVersionId", value.asInstanceOf[js.Any])
    
    inline def setContainerVersionIdUndefined: Self = StObject.set(x, "containerVersionId", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
