package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceDeploymentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Sets the policy to use for deleting resources.
    */
  var deletePolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the deployment for this request.
    */
  var deployment: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceDeploymentsDelete {
  
  inline def apply(): ParamsResourceDeploymentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceDeploymentsDelete]
  }
  
  extension [Self <: ParamsResourceDeploymentsDelete](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setDeletePolicy(value: String): Self = StObject.set(x, "deletePolicy", value.asInstanceOf[js.Any])
    
    inline def setDeletePolicyUndefined: Self = StObject.set(x, "deletePolicy", js.undefined)
    
    inline def setDeployment(value: String): Self = StObject.set(x, "deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "deployment", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
