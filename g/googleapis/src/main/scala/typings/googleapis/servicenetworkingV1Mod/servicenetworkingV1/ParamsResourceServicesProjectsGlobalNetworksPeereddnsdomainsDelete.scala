package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the peered DNS domain to delete in the format: `services/{service\}/projects/{project\}/global/networks/{network\}/peeredDnsDomains/{name\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is the number of the project that contains the service consumer's VPC network e.g. `12345`. {network\} is the name of the service consumer's VPC network. {name\} is the name of the peered DNS domain.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete {
  
  inline def apply(): ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete]
  }
  
  extension [Self <: ParamsResourceServicesProjectsGlobalNetworksPeereddnsdomainsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
