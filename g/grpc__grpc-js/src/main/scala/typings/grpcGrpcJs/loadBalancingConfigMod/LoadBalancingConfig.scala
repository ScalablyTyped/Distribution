package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.cds
import typings.grpcGrpcJs.grpcGrpcJsStrings.eds
import typings.grpcGrpcJs.grpcGrpcJsStrings.grpclb
import typings.grpcGrpcJs.grpcGrpcJsStrings.lrs
import typings.grpcGrpcJs.grpcGrpcJsStrings.pick_first
import typings.grpcGrpcJs.grpcGrpcJsStrings.priority
import typings.grpcGrpcJs.grpcGrpcJsStrings.round_robin
import typings.grpcGrpcJs.grpcGrpcJsStrings.weighted_target
import typings.grpcGrpcJs.grpcGrpcJsStrings.xds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def CdsLoadBalancingConfig(cds: CdsLbConfig, name: cds): typings.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(cds = cds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.CdsLoadBalancingConfig]
  }
  
  @scala.inline
  def EdsLoadBalancingConfig(eds: EdsLbConfig, name: eds): typings.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(eds = eds.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.EdsLoadBalancingConfig]
  }
  
  @scala.inline
  def GrpcLbLoadBalancingConfig(grpclb: GrpcLbConfig, name: grpclb): typings.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(grpclb = grpclb.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.GrpcLbLoadBalancingConfig]
  }
  
  @scala.inline
  def LrsLoadBalancingConfig(lrs: LrsLbConfig, name: lrs): typings.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(lrs = lrs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.LrsLoadBalancingConfig]
  }
  
  @scala.inline
  def PickFirstLoadBalancingConfig(name: pick_first, pick_first: PickFirstConfig): typings.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pick_first = pick_first.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.PickFirstLoadBalancingConfig]
  }
  
  @scala.inline
  def PriorityLoadBalancingConfig(name: priority, priority: PriorityLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.PriorityLoadBalancingConfig]
  }
  
  @scala.inline
  def RoundRobinLoadBalancingConfig(name: round_robin, round_robin: RoundRobinConfig): typings.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.RoundRobinLoadBalancingConfig]
  }
  
  @scala.inline
  def WeightedTargetLoadBalancingConfig(name: weighted_target, weighted_target: WeightedTargetLbConfig): typings.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], weighted_target = weighted_target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.WeightedTargetLoadBalancingConfig]
  }
  
  @scala.inline
  def XdsLoadBalancingConfig(name: xds, xds: XdsConfig): typings.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], xds = xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.grpcGrpcJs.loadBalancingConfigMod.XdsLoadBalancingConfig]
  }
}
