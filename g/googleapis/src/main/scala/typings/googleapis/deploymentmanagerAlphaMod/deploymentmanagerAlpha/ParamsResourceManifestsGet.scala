package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManifestsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of the deployment for this request.
    */
  var deployment: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the manifest for this request.
    */
  var manifest: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceManifestsGet {
  
  @scala.inline
  def apply(): ParamsResourceManifestsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManifestsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManifestsGetMutableBuilder[Self <: ParamsResourceManifestsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    @scala.inline
    def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
