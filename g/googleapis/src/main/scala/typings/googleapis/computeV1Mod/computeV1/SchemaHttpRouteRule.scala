package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRule extends StObject {
  
  /**
    * The short description conveying the intent of this routeRule. The description can have a maximum length of 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService. The headerAction value specified here is applied before the matching pathMatchers[].headerAction and after pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction HeaderAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[SchemaHttpHeaderAction] = js.undefined
  
  /**
    * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied. However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
    */
  var matchRules: js.UndefOr[js.Array[SchemaHttpRouteRuleMatch]] = js.undefined
  
  /**
    * For routeRules within a given pathMatcher, priority determines the order in which a load balancer interprets routeRules. RouteRules are evaluated in order of priority, from the lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied. You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number from 0 to 2147483647 inclusive. Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
    */
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * In response to a matching matchRule, the load balancer performs advanced routing actions, such as URL rewrites and header transformations, before forwarding the request to the selected backend. If routeAction specifies any weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any weightedBackendServices. Only one of urlRedirect, service or routeAction.weightedBackendService must be set. UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a route rule's routeAction.
    */
  var routeAction: js.UndefOr[SchemaHttpRouteAction] = js.undefined
  
  /**
    * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is also specified, advanced routing actions, such as URL rewrites, take effect before sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendServices. Conversely, if routeAction specifies any weightedBackendServices, service must not be specified. Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When this rule is matched, the request is redirected to a URL specified by urlRedirect. If urlRedirect is specified, service or routeAction must not be set. Not supported when the URL map is bound to a target gRPC proxy.
    */
  var urlRedirect: js.UndefOr[SchemaHttpRedirectAction] = js.undefined
}
object SchemaHttpRouteRule {
  
  inline def apply(): SchemaHttpRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRule]
  }
  
  extension [Self <: SchemaHttpRouteRule](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHeaderAction(value: SchemaHttpHeaderAction): Self = StObject.set(x, "headerAction", value.asInstanceOf[js.Any])
    
    inline def setHeaderActionUndefined: Self = StObject.set(x, "headerAction", js.undefined)
    
    inline def setMatchRules(value: js.Array[SchemaHttpRouteRuleMatch]): Self = StObject.set(x, "matchRules", value.asInstanceOf[js.Any])
    
    inline def setMatchRulesUndefined: Self = StObject.set(x, "matchRules", js.undefined)
    
    inline def setMatchRulesVarargs(value: SchemaHttpRouteRuleMatch*): Self = StObject.set(x, "matchRules", js.Array(value*))
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRouteAction(value: SchemaHttpRouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
    
    inline def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    inline def setUrlRedirect(value: SchemaHttpRedirectAction): Self = StObject.set(x, "urlRedirect", value.asInstanceOf[js.Any])
    
    inline def setUrlRedirectUndefined: Self = StObject.set(x, "urlRedirect", js.undefined)
  }
}
