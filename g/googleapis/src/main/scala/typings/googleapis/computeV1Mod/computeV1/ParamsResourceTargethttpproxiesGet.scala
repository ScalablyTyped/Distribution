package typings.googleapis.computeV1Mod.computeV1

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTargethttpproxiesGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.native
  
  /**
    * Name of the TargetHttpProxy resource to return.
    */
  var targetHttpProxy: js.UndefOr[String] = js.native
}
object ParamsResourceTargethttpproxiesGet {
  
  @scala.inline
  def apply(): ParamsResourceTargethttpproxiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTargethttpproxiesGet]
  }
  
  @scala.inline
  implicit class ParamsResourceTargethttpproxiesGetMutableBuilder[Self <: ParamsResourceTargethttpproxiesGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setTargetHttpProxy(value: String): Self = StObject.set(x, "targetHttpProxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHttpProxyUndefined: Self = StObject.set(x, "targetHttpProxy", js.undefined)
  }
}
