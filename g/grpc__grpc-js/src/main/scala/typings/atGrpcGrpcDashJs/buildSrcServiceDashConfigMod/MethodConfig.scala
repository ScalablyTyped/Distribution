package typings.atGrpcGrpcDashJs.buildSrcServiceDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodConfig extends js.Object {
  var maxRequestBytes: js.UndefOr[Double] = js.undefined
  var maxResponseBytes: js.UndefOr[Double] = js.undefined
  var name: js.Array[MethodConfigName]
  var timeout: js.UndefOr[String] = js.undefined
  var waitForReady: js.UndefOr[Boolean] = js.undefined
}

object MethodConfig {
  @scala.inline
  def apply(
    name: js.Array[MethodConfigName],
    maxRequestBytes: Int | Double = null,
    maxResponseBytes: Int | Double = null,
    timeout: String = null,
    waitForReady: js.UndefOr[Boolean] = js.undefined
  ): MethodConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (maxRequestBytes != null) __obj.updateDynamic("maxRequestBytes")(maxRequestBytes.asInstanceOf[js.Any])
    if (maxResponseBytes != null) __obj.updateDynamic("maxResponseBytes")(maxResponseBytes.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForReady)) __obj.updateDynamic("waitForReady")(waitForReady.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodConfig]
  }
}

