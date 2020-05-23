package typings.mailgunJs.mod

import typings.mailgunJs.anon.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorParams extends js.Object {
  var apiKey: String
  var domain: String
  var endpoint: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var mute: js.UndefOr[Boolean] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var publicApiKey: js.UndefOr[String] = js.undefined
  var retry: js.UndefOr[Double | Interval] = js.undefined
  var testMode: js.UndefOr[Boolean] = js.undefined
  var testModeLogger: js.UndefOr[
    js.Function3[
      /* httpOptions */ LoggerHttpOptions, 
      /* payload */ String, 
      /* form */ typings.formData.mod.^, 
      Unit
    ]
  ] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ConstructorParams {
  @scala.inline
  def apply(
    apiKey: String,
    domain: String,
    endpoint: String = null,
    host: String = null,
    mute: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    protocol: String = null,
    proxy: String = null,
    publicApiKey: String = null,
    retry: Double | Interval = null,
    testMode: js.UndefOr[Boolean] = js.undefined,
    testModeLogger: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typings.formData.mod.^) => Unit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (publicApiKey != null) __obj.updateDynamic("publicApiKey")(publicApiKey.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(testMode)) __obj.updateDynamic("testMode")(testMode.get.asInstanceOf[js.Any])
    if (testModeLogger != null) __obj.updateDynamic("testModeLogger")(js.Any.fromFunction3(testModeLogger))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

