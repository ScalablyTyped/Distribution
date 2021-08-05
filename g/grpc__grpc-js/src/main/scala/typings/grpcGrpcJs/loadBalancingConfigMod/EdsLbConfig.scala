package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EdsLbConfig extends StObject {
  
  var cluster: String
  
  var edsServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * Defaults to round_robin if not specified.
    */
  var endpointPickingPolicy: js.Array[LoadBalancingConfig]
  
  /**
    * This policy's config is expected to be in the format used by the
    * weighted_target policy. Defaults to weighted_target if not specified.
    *
    * This is currently not used because there is currently no other config
    * that has the same format as weighted_target.
    */
  var localityPickingPolicy: js.Array[LoadBalancingConfig]
  
  var lrsLoadReportingServerName: js.UndefOr[String] = js.undefined
}
object EdsLbConfig {
  
  inline def apply(
    cluster: String,
    endpointPickingPolicy: js.Array[LoadBalancingConfig],
    localityPickingPolicy: js.Array[LoadBalancingConfig]
  ): EdsLbConfig = {
    val __obj = js.Dynamic.literal(cluster = cluster.asInstanceOf[js.Any], endpointPickingPolicy = endpointPickingPolicy.asInstanceOf[js.Any], localityPickingPolicy = localityPickingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdsLbConfig]
  }
  
  extension [Self <: EdsLbConfig](x: Self) {
    
    inline def setCluster(value: String): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setEdsServiceName(value: String): Self = StObject.set(x, "edsServiceName", value.asInstanceOf[js.Any])
    
    inline def setEdsServiceNameUndefined: Self = StObject.set(x, "edsServiceName", js.undefined)
    
    inline def setEndpointPickingPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "endpointPickingPolicy", value.asInstanceOf[js.Any])
    
    inline def setEndpointPickingPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "endpointPickingPolicy", js.Array(value :_*))
    
    inline def setLocalityPickingPolicy(value: js.Array[LoadBalancingConfig]): Self = StObject.set(x, "localityPickingPolicy", value.asInstanceOf[js.Any])
    
    inline def setLocalityPickingPolicyVarargs(value: LoadBalancingConfig*): Self = StObject.set(x, "localityPickingPolicy", js.Array(value :_*))
    
    inline def setLrsLoadReportingServerName(value: String): Self = StObject.set(x, "lrsLoadReportingServerName", value.asInstanceOf[js.Any])
    
    inline def setLrsLoadReportingServerNameUndefined: Self = StObject.set(x, "lrsLoadReportingServerName", js.undefined)
  }
}
