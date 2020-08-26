package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.grpcGrpcJs.grpcGrpcJsStrings.round_robin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoundRobinLoadBalancingConfig extends LoadBalancingConfig {
  var name: round_robin = js.native
  var round_robin: RoundRobinConfig = js.native
}

object RoundRobinLoadBalancingConfig {
  @scala.inline
  def apply(name: round_robin, round_robin: RoundRobinConfig): RoundRobinLoadBalancingConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], round_robin = round_robin.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundRobinLoadBalancingConfig]
  }
  @scala.inline
  implicit class RoundRobinLoadBalancingConfigOps[Self <: RoundRobinLoadBalancingConfig] (val x: Self) extends AnyVal {
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
    def setName(value: round_robin): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRound_robin(value: RoundRobinConfig): Self = this.set("round_robin", value.asInstanceOf[js.Any])
  }
  
}

