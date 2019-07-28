package typings.leafletDashRoutingDashMachine.leafletMod.RoutingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OSRMOptions extends js.Object {
  var polylinePrecision: js.UndefOr[Double] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var routingOptions: js.UndefOr[js.Any] = js.undefined
  var serviceUrl: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useHints: js.UndefOr[Boolean] = js.undefined
}

object OSRMOptions {
  @scala.inline
  def apply(
    polylinePrecision: Int | Double = null,
    profile: String = null,
    routingOptions: js.Any = null,
    serviceUrl: String = null,
    timeout: Int | Double = null,
    useHints: js.UndefOr[Boolean] = js.undefined
  ): OSRMOptions = {
    val __obj = js.Dynamic.literal()
    if (polylinePrecision != null) __obj.updateDynamic("polylinePrecision")(polylinePrecision.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (routingOptions != null) __obj.updateDynamic("routingOptions")(routingOptions)
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useHints)) __obj.updateDynamic("useHints")(useHints)
    __obj.asInstanceOf[OSRMOptions]
  }
}

