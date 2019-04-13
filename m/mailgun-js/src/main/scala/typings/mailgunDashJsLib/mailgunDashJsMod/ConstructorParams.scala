package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorParams extends js.Object {
  var apiKey: java.lang.String
  var domain: java.lang.String
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var mute: js.UndefOr[scala.Boolean] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var publicApiKey: js.UndefOr[java.lang.String] = js.undefined
  var retry: js.UndefOr[scala.Double | mailgunDashJsLib.Anon_Interval] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ConstructorParams {
  @scala.inline
  def apply(
    apiKey: java.lang.String,
    domain: java.lang.String,
    endpoint: java.lang.String = null,
    host: java.lang.String = null,
    mute: js.UndefOr[scala.Boolean] = js.undefined,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null,
    proxy: java.lang.String = null,
    publicApiKey: java.lang.String = null,
    retry: scala.Double | mailgunDashJsLib.Anon_Interval = null,
    timeout: scala.Int | scala.Double = null
  ): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey, domain = domain)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (host != null) __obj.updateDynamic("host")(host)
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (publicApiKey != null) __obj.updateDynamic("publicApiKey")(publicApiKey)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

