package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Parent resource identifying the connection which owns this collection of peered DNS domains in the format: `services/{service\}/projects/{project\}/global/networks/{network\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is a project number e.g. `12345` that contains the service consumer's VPC network. {network\} is the name of the service consumer's VPC network.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList {
  
  inline def apply(): ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList]
  }
  
  extension [Self <: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsList](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
