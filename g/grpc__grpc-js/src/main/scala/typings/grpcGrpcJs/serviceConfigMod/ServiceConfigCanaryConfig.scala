package typings.grpcGrpcJs.serviceConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfigCanaryConfig extends js.Object {
  var clientHostname: js.UndefOr[js.Array[String]] = js.undefined
  var clientLanguage: js.UndefOr[js.Array[String]] = js.undefined
  var percentage: js.UndefOr[Double] = js.undefined
  var serviceConfig: ServiceConfig
}

object ServiceConfigCanaryConfig {
  @scala.inline
  def apply(
    serviceConfig: ServiceConfig,
    clientHostname: js.Array[String] = null,
    clientLanguage: js.Array[String] = null,
    percentage: js.UndefOr[Double] = js.undefined
  ): ServiceConfigCanaryConfig = {
    val __obj = js.Dynamic.literal(serviceConfig = serviceConfig.asInstanceOf[js.Any])
    if (clientHostname != null) __obj.updateDynamic("clientHostname")(clientHostname.asInstanceOf[js.Any])
    if (clientLanguage != null) __obj.updateDynamic("clientLanguage")(clientLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(percentage)) __obj.updateDynamic("percentage")(percentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfigCanaryConfig]
  }
}

