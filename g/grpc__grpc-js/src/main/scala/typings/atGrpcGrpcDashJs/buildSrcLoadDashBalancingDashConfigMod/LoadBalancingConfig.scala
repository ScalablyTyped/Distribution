package typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancingDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancingConfig extends js.Object {
  var grpclb: js.UndefOr[GrpcLbConfig] = js.undefined
  var round_robin: js.UndefOr[RoundRobinConfig] = js.undefined
  var xds: js.UndefOr[XdsConfig] = js.undefined
}

object LoadBalancingConfig {
  @scala.inline
  def apply(grpclb: GrpcLbConfig = null, round_robin: RoundRobinConfig = null, xds: XdsConfig = null): LoadBalancingConfig = {
    val __obj = js.Dynamic.literal()
    if (grpclb != null) __obj.updateDynamic("grpclb")(grpclb.asInstanceOf[js.Any])
    if (round_robin != null) __obj.updateDynamic("round_robin")(round_robin.asInstanceOf[js.Any])
    if (xds != null) __obj.updateDynamic("xds")(xds.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancingConfig]
  }
}

