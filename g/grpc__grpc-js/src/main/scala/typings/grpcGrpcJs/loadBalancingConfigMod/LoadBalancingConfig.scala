package typings.grpcGrpcJs.loadBalancingConfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig
  - typings.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig
*/
trait LoadBalancingConfig extends StObject
object LoadBalancingConfig {
  
  inline def CdsLoadBalancingConfig(cds: CdsLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(cds = cds.asInstanceOf[js.Any], name = "cds")
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig]
  }
  
  inline def EdsLoadBalancingConfig(eds: EdsLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = "eds")
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig]
  }
  
  inline def GrpcLbLoadBalancingConfig(grpclb: GrpcLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = "grpclb")
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig]
  }
  
  inline def LrsLoadBalancingConfig(lrs: LrsLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = "lrs")
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig]
  }
  
  inline def PickFirstLoadBalancingConfig(pick_first: PickFirstConfig): typings.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "pick_first", pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig]
  }
  
  inline def PriorityLoadBalancingConfig(priority: PriorityLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "priority", priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig]
  }
  
  inline def RoundRobinLoadBalancingConfig(round_robin: RoundRobinConfig): typings.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "round_robin", round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig]
  }
  
  inline def WeightedTargetLoadBalancingConfig(weighted_target: WeightedTargetLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "weighted_target", weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig]
  }
  
  inline def XdsLoadBalancingConfig(xds: XdsConfig): typings.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = "xds", xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig]
  }
}
