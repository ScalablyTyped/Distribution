package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteRouteAction extends StObject {
  
  /**
    * Optional. The destination services to which traffic should be forwarded. If multiple destinations are specified, traffic will be split between Backend Service(s) according to the weight field of these destinations.
    */
  var destinations: js.UndefOr[js.Array[SchemaGrpcRouteDestination]] = js.undefined
  
  /**
    * Optional. The specification for fault injection introduced into traffic to test the resiliency of clients to destination service failure. As part of fault injection, when clients send requests to a destination, delays can be introduced on a percentage of requests before sending those requests to the destination service. Similarly requests from clients can be aborted by for a percentage of requests. timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy
    */
  var faultInjectionPolicy: js.UndefOr[SchemaGrpcRouteFaultInjectionPolicy] = js.undefined
  
  /**
    * Optional. Specifies the retry policy associated with this route.
    */
  var retryPolicy: js.UndefOr[SchemaGrpcRouteRetryPolicy] = js.undefined
  
  /**
    * Optional. Specifies the timeout for selected route. Timeout is computed from the time the request has been fully processed (i.e. end of stream) up until the response has been completely processed. Timeout includes all retries.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
}
object SchemaGrpcRouteRouteAction {
  
  inline def apply(): SchemaGrpcRouteRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteRouteAction]
  }
  
  extension [Self <: SchemaGrpcRouteRouteAction](x: Self) {
    
    inline def setDestinations(value: js.Array[SchemaGrpcRouteDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: SchemaGrpcRouteDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setFaultInjectionPolicy(value: SchemaGrpcRouteFaultInjectionPolicy): Self = StObject.set(x, "faultInjectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setFaultInjectionPolicyUndefined: Self = StObject.set(x, "faultInjectionPolicy", js.undefined)
    
    inline def setRetryPolicy(value: SchemaGrpcRouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
