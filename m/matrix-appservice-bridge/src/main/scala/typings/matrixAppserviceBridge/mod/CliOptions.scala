package typings.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CliOptions extends js.Object {
  var bridgeConfig: js.UndefOr[BridgeConfig] = js.undefined
  var enableLocalpart: js.UndefOr[Boolean] = js.undefined
  var enableRegistration: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var registrationPath: js.UndefOr[String] = js.undefined
  def generateRegistration(reg: js.Any, callback: js.Function1[/* r */ js.Any, Unit]): Unit
  def run(port: Double, config: js.Any): Unit
}

object CliOptions {
  @scala.inline
  def apply(
    generateRegistration: (js.Any, js.Function1[/* r */ js.Any, Unit]) => Unit,
    run: (Double, js.Any) => Unit,
    bridgeConfig: BridgeConfig = null,
    enableLocalpart: js.UndefOr[Boolean] = js.undefined,
    enableRegistration: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    registrationPath: String = null
  ): CliOptions = {
    val __obj = js.Dynamic.literal(generateRegistration = js.Any.fromFunction2(generateRegistration), run = js.Any.fromFunction2(run))
    if (bridgeConfig != null) __obj.updateDynamic("bridgeConfig")(bridgeConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLocalpart)) __obj.updateDynamic("enableLocalpart")(enableLocalpart.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRegistration)) __obj.updateDynamic("enableRegistration")(enableRegistration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (registrationPath != null) __obj.updateDynamic("registrationPath")(registrationPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CliOptions]
  }
}

