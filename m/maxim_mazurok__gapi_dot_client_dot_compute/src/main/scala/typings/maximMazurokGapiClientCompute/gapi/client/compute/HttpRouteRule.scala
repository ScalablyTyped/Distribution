package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRouteRule extends js.Object {
  
  /**
    * The short description conveying the intent of this routeRule.
    * The description can have a maximum length of 1024 characters.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService.
    * The headerAction specified here are applied before the matching pathMatchers[].headerAction and after
    * pathMatchers[].routeRules[].routeAction.weightedBackendService.backendServiceWeightAction[].headerAction
    * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[HttpHeaderAction] = js.native
  
  /**
    * The list of criteria for matching attributes of a request to this routeRule. This list has OR semantics: the request matches this routeRule when any of the matchRules are satisfied.
    * However predicates within a given matchRule have AND semantics. All predicates within a matchRule must match for the request to match the rule.
    */
  var matchRules: js.UndefOr[js.Array[HttpRouteRuleMatch]] = js.native
  
  /**
    * For routeRules within a given pathMatcher, priority determines the order in which load balancer will interpret routeRules. RouteRules are evaluated in order of priority, from the
    * lowest to highest number. The priority of a rule decreases as its number increases (1, 2, 3, N+1). The first rule that matches the request is applied.
    * You cannot configure two or more routeRules with the same priority. Priority for each rule must be set to a number between 0 and 2147483647 inclusive.
    * Priority numbers can have gaps, which enable you to add or remove rules in the future without affecting the rest of the rules. For example, 1, 2, 3, 4, 5, 9, 12, 16 is a valid
    * series of priority numbers to which you could add rules numbered from 6 to 8, 10 to 11, and 13 to 15 in the future without any impact on existing rules.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * In response to a matching matchRule, the load balancer performs advanced routing actions like URL rewrites, header transformations, etc. prior to forwarding the request to the
    * selected backend. If  routeAction specifies any  weightedBackendServices, service must not be set. Conversely if service is set, routeAction cannot contain any
    * weightedBackendServices.
    * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
    * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a routeRule's routeAction.
    */
  var routeAction: js.UndefOr[HttpRouteAction] = js.native
  
  /**
    * The full or partial URL of the backend service resource to which traffic is directed if this rule is matched. If routeAction is additionally specified, advanced routing actions like
    * URL Rewrites, etc. take effect prior to sending the request to the backend. However, if service is specified, routeAction cannot contain any weightedBackendService s. Conversely, if
    * routeAction specifies any  weightedBackendServices, service must not be specified.
    * Only one of urlRedirect, service or routeAction.weightedBackendService must be set.
    */
  var service: js.UndefOr[String] = js.native
  
  /**
    * When this rule is matched, the request is redirected to a URL specified by urlRedirect.
    * If urlRedirect is specified, service or routeAction must not be set.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var urlRedirect: js.UndefOr[HttpRedirectAction] = js.native
}
object HttpRouteRule {
  
  @scala.inline
  def apply(): HttpRouteRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRouteRule]
  }
  
  @scala.inline
  implicit class HttpRouteRuleOps[Self <: HttpRouteRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHeaderAction(value: HttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    
    @scala.inline
    def setMatchRulesVarargs(value: HttpRouteRuleMatch*): Self = this.set("matchRules", js.Array(value :_*))
    
    @scala.inline
    def setMatchRules(value: js.Array[HttpRouteRuleMatch]): Self = this.set("matchRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchRules: Self = this.set("matchRules", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setRouteAction(value: HttpRouteAction): Self = this.set("routeAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteAction: Self = this.set("routeAction", js.undefined)
    
    @scala.inline
    def setService(value: String): Self = this.set("service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteService: Self = this.set("service", js.undefined)
    
    @scala.inline
    def setUrlRedirect(value: HttpRedirectAction): Self = this.set("urlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrlRedirect: Self = this.set("urlRedirect", js.undefined)
  }
}
