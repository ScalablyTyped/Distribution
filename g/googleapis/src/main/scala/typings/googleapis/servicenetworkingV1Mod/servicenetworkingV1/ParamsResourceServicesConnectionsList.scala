package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConnectionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The name of service consumer's VPC network that's connected with service
    * producer network through a private connection. The network name must be
    * in the following format: `projects/{project}/global/networks/{network}`.
    * {project} is a project number, such as in `12345` that includes the VPC
    * service consumer's VPC network. {network} is the name of the service
    * consumer's VPC network.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The service that is managing peering connectivity for a service
    * producer's organization. For Google services that support this
    * functionality, this value is `services/servicenetworking.googleapis.com`.
    * If you specify `services/-` as the parameter value, all configured
    * peering services are listed.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConnectionsList {
  
  @scala.inline
  def apply(): ParamsResourceServicesConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConnectionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceServicesConnectionsListMutableBuilder[Self <: ParamsResourceServicesConnectionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
