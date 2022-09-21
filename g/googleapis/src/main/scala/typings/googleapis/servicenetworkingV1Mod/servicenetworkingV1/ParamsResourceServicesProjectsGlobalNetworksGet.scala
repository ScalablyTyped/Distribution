package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceServicesProjectsGlobalNetworksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. When true, include the used IP ranges as part of the GetConsumerConfig output. This includes routes created inside the service networking network, consumer network, peers of the consumer network, and reserved ranges inside the service networking network. By default, this is false
    */
  var includeUsedIpRanges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Name of the consumer config to retrieve in the format: `services/{service\}/projects/{project\}/global/networks/{network\}`. {service\} is the peering service that is managing connectivity for the service producer's organization. For Google services that support this functionality, this value is `servicenetworking.googleapis.com`. {project\} is a project number e.g. `12345` that contains the service consumer's VPC network. {network\} is the name of the service consumer's VPC network.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceServicesProjectsGlobalNetworksGet {
  
  inline def apply(): ParamsResourceServicesProjectsGlobalNetworksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceServicesProjectsGlobalNetworksGet]
  }
  
  extension [Self <: ParamsResourceServicesProjectsGlobalNetworksGet](x: Self) {
    
    inline def setIncludeUsedIpRanges(value: Boolean): Self = StObject.set(x, "includeUsedIpRanges", value.asInstanceOf[js.Any])
    
    inline def setIncludeUsedIpRangesUndefined: Self = StObject.set(x, "includeUsedIpRanges", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
