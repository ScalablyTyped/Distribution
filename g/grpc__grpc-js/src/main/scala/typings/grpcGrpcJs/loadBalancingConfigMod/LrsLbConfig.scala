package typings.grpcGrpcJs.loadBalancingConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LrsLbConfig extends js.Object {
  
  var child_policy: js.Array[LoadBalancingConfig] = js.native
  
  var cluster_name: String = js.native
  
  var eds_service_name: String = js.native
  
  var locality: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any = js.native
  
  var lrs_load_reporting_server_name: String = js.native
}
object LrsLbConfig {
  
  @scala.inline
  def apply(
    child_policy: js.Array[LoadBalancingConfig],
    cluster_name: String,
    eds_service_name: String,
    locality: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any,
    lrs_load_reporting_server_name: String
  ): LrsLbConfig = {
    val __obj = js.Dynamic.literal(child_policy = child_policy.asInstanceOf[js.Any], cluster_name = cluster_name.asInstanceOf[js.Any], eds_service_name = eds_service_name.asInstanceOf[js.Any], locality = locality.asInstanceOf[js.Any], lrs_load_reporting_server_name = lrs_load_reporting_server_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[LrsLbConfig]
  }
  
  @scala.inline
  implicit class LrsLbConfigOps[Self <: LrsLbConfig] (val x: Self) extends AnyVal {
    
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
    def setChild_policyVarargs(value: LoadBalancingConfig*): Self = this.set("child_policy", js.Array(value :_*))
    
    @scala.inline
    def setChild_policy(value: js.Array[LoadBalancingConfig]): Self = this.set("child_policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCluster_name(value: String): Self = this.set("cluster_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEds_service_name(value: String): Self = this.set("eds_service_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocality(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Locality__Output */ js.Any
    ): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLrs_load_reporting_server_name(value: String): Self = this.set("lrs_load_reporting_server_name", value.asInstanceOf[js.Any])
  }
}
