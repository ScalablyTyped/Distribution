package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Parent resource identifying the connection for which the peered DNS domain will be created in the format: `services/{service\}/projects/{project\}/global/networks/{network\}` {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is the number of the project that contains the service consumer's VPC network e.g. `12345`. {network\} is the name of the service consumer's VPC network.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPeeredDnsDomain] = js.undefined
}
object ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate {
  
  inline def apply(): ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate]
  }
  
  extension [Self <: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaPeeredDnsDomain): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
