package typings.googleapis.computeV1Mod.computeV1

import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSecuritypoliciesGetrule
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The priority of the rule to get from the security policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the security policy to which the queried rule belongs.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceSecuritypoliciesGetrule {
  
  @scala.inline
  def apply(): ParamsResourceSecuritypoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSecuritypoliciesGetrule]
  }
  
  @scala.inline
  implicit class ParamsResourceSecuritypoliciesGetruleMutableBuilder[Self <: ParamsResourceSecuritypoliciesGetrule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
