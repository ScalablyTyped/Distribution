package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathMatcher extends js.Object {
  
  /**
    * defaultRouteAction takes effect when none of the  pathRules or routeRules match. The load balancer performs advanced routing actions like URL rewrites, header transformations, etc.
    * prior to forwarding the request to the selected backend. If defaultRouteAction specifies any weightedBackendServices, defaultService must not be set. Conversely if defaultService is
    * set, defaultRouteAction cannot contain any  weightedBackendServices.
    * Only one of defaultRouteAction or defaultUrlRedirect must be set.
    * UrlMaps for external HTTP(S) load balancers support only the urlRewrite action within a pathMatcher's defaultRouteAction.
    */
  var defaultRouteAction: js.UndefOr[HttpRouteAction] = js.native
  
  /**
    * The full or partial URL to the BackendService resource. This will be used if none of the pathRules or routeRules defined by this PathMatcher are matched. For example, the following
    * are all valid URLs to a BackendService resource:
    * - https://www.googleapis.com/compute/v1/projects/project/global/backendServices/backendService
    * - compute/v1/projects/project/global/backendServices/backendService
    * - global/backendServices/backendService  If defaultRouteAction is additionally specified, advanced routing actions like URL Rewrites, etc. take effect prior to sending the request
    * to the backend. However, if defaultService is specified, defaultRouteAction cannot contain any weightedBackendServices. Conversely, if defaultRouteAction specifies any
    * weightedBackendServices, defaultService must not be specified.
    * Only one of defaultService, defaultUrlRedirect  or defaultRouteAction.weightedBackendService must be set.
    * Authorization requires one or more of the following Google IAM permissions on the specified resource default_service:
    * - compute.backendBuckets.use
    * - compute.backendServices.use
    */
  var defaultService: js.UndefOr[String] = js.native
  
  /**
    * When none of the specified pathRules or routeRules match, the request is redirected to a URL specified by defaultUrlRedirect.
    * If defaultUrlRedirect is specified, defaultService or defaultRouteAction must not be set.
    * Not supported when the URL map is bound to target gRPC proxy.
    */
  var defaultUrlRedirect: js.UndefOr[HttpRedirectAction] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService.
    * HeaderAction specified here are applied after the matching HttpRouteRule HeaderAction and before the HeaderAction in the UrlMap
    * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[HttpHeaderAction] = js.native
  
  /** The name to which this PathMatcher is referred by the HostRule. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The list of path rules. Use this list instead of routeRules when routing based on simple path matching is all that's required. The order by which path rules are specified does not
    * matter. Matches are always done on the longest-path-first basis.
    * For example: a pathRule with a path /a/b/c/ * will match before /a/b/ * irrespective of the order in which those paths appear in this list.
    * Within a given pathMatcher, only one of pathRules or routeRules must be set.
    */
  var pathRules: js.UndefOr[js.Array[PathRule]] = js.native
  
  /**
    * The list of HTTP route rules. Use this list instead of pathRules when advanced route matching and routing actions are desired. routeRules are evaluated in order of priority, from
    * the lowest to highest number.
    * Within a given pathMatcher, you can set only one of pathRules or routeRules.
    */
  var routeRules: js.UndefOr[js.Array[HttpRouteRule]] = js.native
}
object PathMatcher {
  
  @scala.inline
  def apply(): PathMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PathMatcher]
  }
  
  @scala.inline
  implicit class PathMatcherOps[Self <: PathMatcher] (val x: Self) extends AnyVal {
    
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
    def setDefaultRouteAction(value: HttpRouteAction): Self = this.set("defaultRouteAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteAction: Self = this.set("defaultRouteAction", js.undefined)
    
    @scala.inline
    def setDefaultService(value: String): Self = this.set("defaultService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultService: Self = this.set("defaultService", js.undefined)
    
    @scala.inline
    def setDefaultUrlRedirect(value: HttpRedirectAction): Self = this.set("defaultUrlRedirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUrlRedirect: Self = this.set("defaultUrlRedirect", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setHeaderAction(value: HttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPathRulesVarargs(value: PathRule*): Self = this.set("pathRules", js.Array(value :_*))
    
    @scala.inline
    def setPathRules(value: js.Array[PathRule]): Self = this.set("pathRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePathRules: Self = this.set("pathRules", js.undefined)
    
    @scala.inline
    def setRouteRulesVarargs(value: HttpRouteRule*): Self = this.set("routeRules", js.Array(value :_*))
    
    @scala.inline
    def setRouteRules(value: js.Array[HttpRouteRule]): Self = this.set("routeRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteRules: Self = this.set("routeRules", js.undefined)
  }
}
