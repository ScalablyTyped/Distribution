package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRouteAction extends StObject {
  
  /**
    * The specification for allowing client side cross-origin requests. Please see W3C Recommendation for Cross Origin Resource Sharing
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var corsPolicy: js.UndefOr[CorsPolicy] = js.undefined
  
  /**
    * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to
    * a backend service, delays can be introduced by Loadbalancer on a percentage of requests before sending those request to the backend service. Similarly requests from clients can be
    * aborted by the Loadbalancer for a percentage of requests.
    * timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var faultInjectionPolicy: js.UndefOr[HttpFaultInjection] = js.undefined
  
  /**
    * Specifies the policy on how requests intended for the route's backends are shadowed to a separate mirrored backend service. Loadbalancer does not wait for responses from the shadow
    * service. Prior to sending traffic to the shadow service, the host / authority header is suffixed with -shadow.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var requestMirrorPolicy: js.UndefOr[RequestMirrorPolicy] = js.undefined
  
  /**
    * Specifies the retry policy associated with this route.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.undefined
  
  /**
    * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (i.e. end-of-stream) up until the response has been completely
    * processed. Timeout includes all retries.
    * If not specified, will use the largest timeout among all backend services associated with the route.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var timeout: js.UndefOr[Duration] = js.undefined
  
  /**
    * The spec to modify the URL of the request, prior to forwarding the request to the matched service.
    * urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var urlRewrite: js.UndefOr[UrlRewrite] = js.undefined
  
  /**
    * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If
    * all traffic needs to go to a single backend service, there must be one  weightedBackendService with weight set to a non-zero number.
    * Once a backendService is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied
    * depending on additional settings specified in this HttpRouteAction.
    */
  var weightedBackendServices: js.UndefOr[js.Array[WeightedBackendService]] = js.undefined
}
object HttpRouteAction {
  
  inline def apply(): HttpRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRouteAction]
  }
  
  extension [Self <: HttpRouteAction](x: Self) {
    
    inline def setCorsPolicy(value: CorsPolicy): Self = StObject.set(x, "corsPolicy", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicyUndefined: Self = StObject.set(x, "corsPolicy", js.undefined)
    
    inline def setFaultInjectionPolicy(value: HttpFaultInjection): Self = StObject.set(x, "faultInjectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setFaultInjectionPolicyUndefined: Self = StObject.set(x, "faultInjectionPolicy", js.undefined)
    
    inline def setRequestMirrorPolicy(value: RequestMirrorPolicy): Self = StObject.set(x, "requestMirrorPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequestMirrorPolicyUndefined: Self = StObject.set(x, "requestMirrorPolicy", js.undefined)
    
    inline def setRetryPolicy(value: HttpRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrlRewrite(value: UrlRewrite): Self = StObject.set(x, "urlRewrite", value.asInstanceOf[js.Any])
    
    inline def setUrlRewriteUndefined: Self = StObject.set(x, "urlRewrite", js.undefined)
    
    inline def setWeightedBackendServices(value: js.Array[WeightedBackendService]): Self = StObject.set(x, "weightedBackendServices", value.asInstanceOf[js.Any])
    
    inline def setWeightedBackendServicesUndefined: Self = StObject.set(x, "weightedBackendServices", js.undefined)
    
    inline def setWeightedBackendServicesVarargs(value: WeightedBackendService*): Self = StObject.set(x, "weightedBackendServices", js.Array(value :_*))
  }
}
