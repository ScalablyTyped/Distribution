package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeightedBackendService extends js.Object {
  
  /**
    * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the loadbalancer applies any relevant headerActions specified as
    * part of this backendServiceWeight.
    */
  var backendService: js.UndefOr[String] = js.native
  
  /**
    * Specifies changes to request and response headers that need to take effect for the selected backendService.
    * headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
    * Note that headerAction is not supported for Loadbalancers that have their loadBalancingScheme set to EXTERNAL.
    * Not supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true.
    */
  var headerAction: js.UndefOr[HttpHeaderAction] = js.native
  
  /**
    * Specifies the fraction of traffic sent to backendService, computed as weight / (sum of all weightedBackendService weights in routeAction) .
    * The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backendService, subsequent requests will be sent to the same
    * backendService as determined by the BackendService's session affinity policy.
    * The value must be between 0 and 1000
    */
  var weight: js.UndefOr[Double] = js.native
}
object WeightedBackendService {
  
  @scala.inline
  def apply(): WeightedBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeightedBackendService]
  }
  
  @scala.inline
  implicit class WeightedBackendServiceOps[Self <: WeightedBackendService] (val x: Self) extends AnyVal {
    
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
    def setBackendService(value: String): Self = this.set("backendService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendService: Self = this.set("backendService", js.undefined)
    
    @scala.inline
    def setHeaderAction(value: HttpHeaderAction): Self = this.set("headerAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderAction: Self = this.set("headerAction", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
}
