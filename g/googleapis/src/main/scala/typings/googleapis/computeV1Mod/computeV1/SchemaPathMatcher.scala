package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPathMatcher extends StObject {
  
  /**
    * defaultRouteAction takes effect when none of the pathRules or routeRules match. The load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is set, defaultRouteAction cannot contain any weightedBackendServices. Only one of defaultRouteAction or defaultUrlRedirect must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a path matcher's defaultRouteAction.
    */
  var defaultRouteAction: js.UndefOr[SchemaHttpRouteAction] = js.undefined
  
  /**
    * The full or partial URL to the BackendService resource. This URL is used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following are all valid URLs to a BackendService resource: - https://www.googleapis.com/compute/v1/projects/project /global/backendServices/backendService - compute/v1/projects/project/global/backendServices/backendService - global/backendServices/backendService If defaultRouteAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any weightedBackendServices, defaultService must not be specified. Only one of defaultService, defaultUrlRedirect , or defaultRouteAction.weightedBackendService must be set. Authorization requires one or more of the following Google IAM permissions on the specified resource default_service: - compute.backendBuckets.use - compute.backendServices.use
    */
  var defaultService: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect. If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
    */
  var defaultUrlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.undefined
  
  /**
    * An optional description of this resource. Provide this property when you create the resource.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backend service. HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.undefined
  
  /**
    * The name to which this PathMatcher is referred by the HostRule.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not matter. Matches are always done on the longest-path-first basis. For example: a pathRule with a path /a/b/c/x will match before /a/b/x irrespective of the order in which those paths appear in this list. Within a given pathMatcher, only one of pathRules or routeRules must be set.
    */
  var pathRules: js.UndefOr[js.Array[SchemaPathRule]] = js.undefined
  
  /**
    * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from the lowest to highest number. Within a given pathMatcher, you can set only one of pathRules or routeRules.
    */
  var routeRules: js.UndefOr[js.Array[SchemaHttpRouteRule]] = js.undefined
}
object SchemaPathMatcher {
  
  inline def apply(): SchemaPathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPathMatcher]
  }
  
  extension [Self <: SchemaPathMatcher](x: Self) {
    
    inline def setDefaultRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "defaultRouteAction", value.asInstanceOf[js.Any])
    
    inline def setDefaultRouteActionUndefined: Self = StObject.set(x, "defaultRouteAction", js.undefined)
    
    inline def setDefaultService(value: String): Self = StObject.set(x, "defaultService", value.asInstanceOf[js.Any])
    
    inline def setDefaultServiceNull: Self = StObject.set(x, "defaultService", null)
    
    inline def setDefaultServiceUndefined: Self = StObject.set(x, "defaultService", js.undefined)
    
    inline def setDefaultUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "defaultUrlRedirect", value.asInstanceOf[js.Any])
    
    inline def setDefaultUrlRedirectUndefined: Self = StObject.set(x, "defaultUrlRedirect", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPathRules(value: js.Array[SchemaPathRule]): Self = StObject.set(x, "pathRules", value.asInstanceOf[js.Any])
    
    inline def setPathRulesUndefined: Self = StObject.set(x, "pathRules", js.undefined)
    
    inline def setPathRulesVarargs(value: SchemaPathRule*): Self = StObject.set(x, "pathRules", js.Array(value*))
    
    inline def setRouteRules(value: js.Array[SchemaHttpRouteRule]): Self = StObject.set(x, "routeRules", value.asInstanceOf[js.Any])
    
    inline def setRouteRulesUndefined: Self = StObject.set(x, "routeRules", js.undefined)
    
    inline def setRouteRulesVarargs(value: SchemaHttpRouteRule*): Self = StObject.set(x, "routeRules", js.Array(value*))
  }
}
