package typings.grpcGrpcJs.loadBalancingConfigMod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeightedTargetLbConfig extends js.Object {
  var targets: Map[String, WeightedTarget] = js.native
}

object WeightedTargetLbConfig {
  @scala.inline
  def apply(targets: Map[String, WeightedTarget]): WeightedTargetLbConfig = {
    val __obj = js.Dynamic.literal(targets = targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeightedTargetLbConfig]
  }
  @scala.inline
  implicit class WeightedTargetLbConfigOps[Self <: WeightedTargetLbConfig] (val x: Self) extends AnyVal {
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
    def setTargets(value: Map[String, WeightedTarget]): Self = this.set("targets", value.asInstanceOf[js.Any])
  }
  
}

