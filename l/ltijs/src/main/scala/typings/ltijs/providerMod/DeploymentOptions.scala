package typings.ltijs.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentOptions extends js.Object {
  var port: js.UndefOr[Double] = js.undefined
  var serverless: js.UndefOr[Boolean] = js.undefined
  var silent: js.UndefOr[Boolean] = js.undefined
}

object DeploymentOptions {
  @scala.inline
  def apply(
    port: js.UndefOr[Double] = js.undefined,
    serverless: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined
  ): DeploymentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(serverless)) __obj.updateDynamic("serverless")(serverless.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentOptions]
  }
}

