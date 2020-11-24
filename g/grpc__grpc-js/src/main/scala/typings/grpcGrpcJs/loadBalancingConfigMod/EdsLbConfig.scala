package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EdsLbConfig extends js.Object {
  
  var cluster: String = js.native
  
  var edsServiceName: js.UndefOr[String] = js.native
  
  /**
    * Defaults to round_robin if not specified.
    */
  var endpointPickingPolicy: js.Array[LoadBalancingConfig] = js.native
  
  /**
    * This policy's config is expected to be in the format used by the
    * weighted_target policy. Defaults to weighted_target if not specified.
    *
    * This is currently not used because there is currently no other config
    * that has the same format as weighted_target.
    */
  var localityPickingPolicy: js.Array[LoadBalancingConfig] = js.native
  
  var lrsLoadReportingServerName: js.UndefOr[String] = js.native
}
object EdsLbConfig {
  
  @scala.inline
  def apply(
    cluster: String,
    endpointPickingPolicy: js.Array[LoadBalancingConfig],
    localityPickingPolicy: js.Array[LoadBalancingConfig]
  ): EdsLbConfig = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], endpointPickingPolicy = endpointPickingPolicy.asInstanceOf[js.Any], localityPickingPolicy = localityPickingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdsLbConfig]
  }
  
  @scala.inline
  implicit class EdsLbConfigOps[Self <: EdsLbConfig] (val x: Self) extends AnyVal {
    
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
    def setCluster(value: String): Self = this.set("cluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPickingPolicyVarargs(value: LoadBalancingConfig*): Self = this.set("endpointPickingPolicy", js.Array(value :_*))
    
    @scala.inline
    def setEndpointPickingPolicy(value: js.Array[LoadBalancingConfig]): Self = this.set("endpointPickingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityPickingPolicyVarargs(value: LoadBalancingConfig*): Self = this.set("localityPickingPolicy", js.Array(value :_*))
    
    @scala.inline
    def setLocalityPickingPolicy(value: js.Array[LoadBalancingConfig]): Self = this.set("localityPickingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdsServiceName(value: String): Self = this.set("edsServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdsServiceName: Self = this.set("edsServiceName", js.undefined)
    
    @scala.inline
    def setLrsLoadReportingServerName(value: String): Self = this.set("lrsLoadReportingServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLrsLoadReportingServerName: Self = this.set("lrsLoadReportingServerName", js.undefined)
  }
}
