package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRouteAction extends StObject {
  
  /**
    * The specification for allowing client side cross-origin requests.
    */
  var corsPolicy: js.UndefOr[SchemaHttpRouteCorsPolicy] = js.undefined
  
  /**
    * The destination to which traffic should be forwarded.
    */
  var destinations: js.UndefOr[js.Array[SchemaHttpRouteDestination]] = js.undefined
  
  /**
    * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted for a percentage of requests. timeout and retry_policy will be ignored by clients that are configured with a fault_injection_policy
    */
  var faultInjectionPolicy: js.UndefOr[SchemaHttpRouteFaultInjectionPolicy] = js.undefined
  
  /**
    * If set, the request is directed as configured by this field.
    */
  var redirect: js.UndefOr[SchemaHttpRouteRedirect] = js.undefined
  
  /**
    * The specification for modifying the headers of a matching request prior to delivery of the request to the destination.
    */
  var requestHeaderModifier: js.UndefOr[SchemaHttpRouteHeaderModifier] = js.undefined
  
  /**
    * Specifies the policy on how requests intended for the routes destination are shadowed to a separate mirrored destination. Proxy will not wait for the shadow destination to respond before returning the response. Prior to sending traffic to the shadow service, the host/authority header is suffixed with -shadow.
    */
  var requestMirrorPolicy: js.UndefOr[SchemaHttpRouteRequestMirrorPolicy] = js.undefined
  
  /**
    * The specification for modifying the headers of a response prior to sending the response back to the client.
    */
  var responseHeaderModifier: js.UndefOr[SchemaHttpRouteHeaderModifier] = js.undefined
  
  /**
    * Specifies the retry policy associated with this route.
    */
  var retryPolicy: js.UndefOr[SchemaHttpRouteRetryPolicy] = js.undefined
  
  /**
    * Specifies the timeout for selected route. Timeout is computed from the time the request has been fully processed (i.e. end of stream) up until the response has been completely processed. Timeout includes all retries.
    */
  var timeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The specification for rewrite URL before forwarding requests to the destination.
    */
  var urlRewrite: js.UndefOr[SchemaHttpRouteURLRewrite] = js.undefined
}
object SchemaHttpRouteRouteAction {
  
  inline def apply(): SchemaHttpRouteRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRouteAction]
  }
  
  extension [Self <: SchemaHttpRouteRouteAction](x: Self) {
    
    inline def setCorsPolicy(value: SchemaHttpRouteCorsPolicy): Self = StObject.set(x, "corsPolicy", value.asInstanceOf[js.Any])
    
    inline def setCorsPolicyUndefined: Self = StObject.set(x, "corsPolicy", js.undefined)
    
    inline def setDestinations(value: js.Array[SchemaHttpRouteDestination]): Self = StObject.set(x, "destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: SchemaHttpRouteDestination*): Self = StObject.set(x, "destinations", js.Array(value*))
    
    inline def setFaultInjectionPolicy(value: SchemaHttpRouteFaultInjectionPolicy): Self = StObject.set(x, "faultInjectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setFaultInjectionPolicyUndefined: Self = StObject.set(x, "faultInjectionPolicy", js.undefined)
    
    inline def setRedirect(value: SchemaHttpRouteRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setRequestHeaderModifier(value: SchemaHttpRouteHeaderModifier): Self = StObject.set(x, "requestHeaderModifier", value.asInstanceOf[js.Any])
    
    inline def setRequestHeaderModifierUndefined: Self = StObject.set(x, "requestHeaderModifier", js.undefined)
    
    inline def setRequestMirrorPolicy(value: SchemaHttpRouteRequestMirrorPolicy): Self = StObject.set(x, "requestMirrorPolicy", value.asInstanceOf[js.Any])
    
    inline def setRequestMirrorPolicyUndefined: Self = StObject.set(x, "requestMirrorPolicy", js.undefined)
    
    inline def setResponseHeaderModifier(value: SchemaHttpRouteHeaderModifier): Self = StObject.set(x, "responseHeaderModifier", value.asInstanceOf[js.Any])
    
    inline def setResponseHeaderModifierUndefined: Self = StObject.set(x, "responseHeaderModifier", js.undefined)
    
    inline def setRetryPolicy(value: SchemaHttpRouteRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutNull: Self = StObject.set(x, "timeout", null)
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrlRewrite(value: SchemaHttpRouteURLRewrite): Self = StObject.set(x, "urlRewrite", value.asInstanceOf[js.Any])
    
    inline def setUrlRewriteUndefined: Self = StObject.set(x, "urlRewrite", js.undefined)
  }
}
