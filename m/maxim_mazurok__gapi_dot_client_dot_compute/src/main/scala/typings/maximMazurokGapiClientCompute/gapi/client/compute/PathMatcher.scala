package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMatcher extends StObject {
  
  /**
    * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions like URL rewrites, header transformations, etc.
    * prior to forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is
    * set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers
    * support only the urlRewrite action within a pathMatcher's defaultRouteAction.
    */
  var defaultRouteAction: js.UndefOr[HttpRouteAction] = js.undefined
  
  /**
    * The full or partial URL to the BackendService resource. This will be used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following
    * are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService -
    * compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is additionally specified, advanced routing actions
    * like URL Rewrites, etc. take effect prior to sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any
    * weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService,
    * defaultUrlRedirect or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource
    * default_service: - compute.backendBuckets.use - compute.backendServices.use
    */
  var defaultService: js.UndefOr[String] = js.undefined
  
  /**
    * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or
    * defaultRouteAction must not be set. Not supported when the URL map is bound to target gRPC proxy.
    */
  var defaultUrlRedirect: js.UndefOr[HttpRedirectAction] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService. HeaderAction specified here are applied after the matching HttpRouteRule
    * HeaderAction and before the HeaderAction in the UrlMap Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL. Not supported
    * when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[HttpHeaderAction] = js.undefined
  
  /** The name to which this PathMatcher is referred by the HostRule. */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not
    * matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/ * will match before /a/b/ * irrespective of the order in which those paths
    * appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
    */
  var pathRules: js.UndefOr[js.Array[PathRule]] = js.undefined
  
  /**
    * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from
    * the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
    */
  var routeRules: js.UndefOr[js.Array[HttpRouteRule]] = js.undefined
}
object PathMatcher {
  
  inline def apply(): PathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathMatcher]
  }
  
  extension [Self <: PathMatcher](x: Self) {
    
    inline def setDefaultRouteAction(value: HttpRouteAction): Self = StObject.set(x, "defaultRouteAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteActionUndefined: Self = StObject.set(x, "defaultRouteAction", js.undefined)
    
    inline def setDefaultService(value: String): Self = StObject.set(x, "defaultService", value.asInstanceOf[js.Any])
    
    inline def setDefaultServiceUndefined: Self = StObject.set(x, "defaultService", js.undefined)
    
    inline def setDefaultUrlRedirect(value: HttpRedirectAction): Self = StObject.set(x, "defaultUrlRedirect", value.asInstanceOf[js.Any])
    
    inline def setDefaultUrlRedirectUndefined: Self = StObject.set(x, "defaultUrlRedirect", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaderAction(value: HttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPathRules(value: js.Array[PathRule]): Self = StObject.set(x, "pathRules", value.asInstanceOf[js.Any])
    
    inline def setPathRulesUndefined: Self = StObject.set(x, "pathRules", js.undefined)
    
    inline def setPathRulesVarargs(value: PathRule*): Self = StObject.set(x, "pathRules", js.Array(value*))
    
    inline def setRouteRules(value: js.Array[HttpRouteRule]): Self = StObject.set(x, "routeRules", value.asInstanceOf[js.Any])
    
    inline def setRouteRulesUndefined: Self = StObject.set(x, "routeRules", js.undefined)
    
    inline def setRouteRulesVarargs(value: HttpRouteRule*): Self = StObject.set(x, "routeRules", js.Array(value*))
  }
}
