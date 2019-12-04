package typings.atGrpcGrpcDashJs.buildSrcServiceDashConfigMod

import typings.atGrpcGrpcDashJs.buildSrcLoadDashBalancingDashConfigMod.LoadBalancingConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  var loadBalancingConfig: js.Array[LoadBalancingConfig]
  var loadBalancingPolicy: js.UndefOr[String] = js.undefined
  var methodConfig: js.Array[MethodConfig]
}

object ServiceConfig {
  @scala.inline
  def apply(
    loadBalancingConfig: js.Array[LoadBalancingConfig],
    methodConfig: js.Array[MethodConfig],
    loadBalancingPolicy: String = null
  ): ServiceConfig = {
    val __obj = js.Dynamic.literal(loadBalancingConfig = loadBalancingConfig.asInstanceOf[js.Any], methodConfig = methodConfig.asInstanceOf[js.Any])
    if (loadBalancingPolicy != null) __obj.updateDynamic("loadBalancingPolicy")(loadBalancingPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
}

