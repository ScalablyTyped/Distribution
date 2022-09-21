package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWeightedBackendService extends StObject {
  
  /**
    * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
    */
  var backendService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.undefined
  
  /**
    * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy. The value must be from 0 to 1000.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaWeightedBackendService {
  
  inline def apply(): SchemaWeightedBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWeightedBackendService]
  }
  
  extension [Self <: SchemaWeightedBackendService](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceNull: Self = StObject.set(x, "backendService", null)
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
    
    inline def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
