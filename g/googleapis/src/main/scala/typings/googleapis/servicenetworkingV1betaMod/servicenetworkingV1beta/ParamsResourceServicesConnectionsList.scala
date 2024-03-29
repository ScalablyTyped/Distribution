package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesConnectionsList
  extends StObject
     with StandardParameters {
  
  /**
    * The name of service consumer's VPC network that's connected with service producer network through a private connection. The network name must be in the following format: `projects/{project\}/global/networks/{network\}`. {project\} is a project number, such as in `12345` that includes the VPC service consumer's VPC network. {network\} is the name of the service consumer's VPC network.
    */
  var network: js.UndefOr[String] = js.undefined
  
  /**
    * The service that is managing peering connectivity for a service producer's organization. For Google services that support this functionality, this value is `services/servicenetworking.googleapis.com`. If you specify `-` as the parameter value, all configured public peering services are listed.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesConnectionsList {
  
  inline def apply(): ParamsResourceServicesConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesConnectionsList]
  }
  
  extension [Self <: ParamsResourceServicesConnectionsList](x: Self) {
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
