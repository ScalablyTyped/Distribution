package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteDestination extends StObject {
  
  /**
    * Required. The URL of a destination service to which to route traffic. Must refer to either a BackendService or ServiceDirectoryService.
    */
  var serviceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the proportion of requests forwarded to the backend referenced by the serviceName field. This is computed as: weight/Sum(weights in this destination list). For non-zero values, there may be some epsilon from the exact proportion defined here depending on the precision an implementation supports. If only one serviceName is specified and it has a weight greater than 0, 100% of the traffic is forwarded to that backend. If weights are specified for any one service name, they need to be specified for all of them. If weights are unspecified for all services, then, traffic is distributed in equal proportions to all of them.
    */
  var weight: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGrpcRouteDestination {
  
  inline def apply(): SchemaGrpcRouteDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteDestination]
  }
  
  extension [Self <: SchemaGrpcRouteDestination](x: Self) {
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameNull: Self = StObject.set(x, "serviceName", null)
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightNull: Self = StObject.set(x, "weight", null)
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
