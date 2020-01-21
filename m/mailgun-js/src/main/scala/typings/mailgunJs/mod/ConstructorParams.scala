package typings.mailgunJs.mod

import typings.mailgunJs.AnonInterval
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
  var retry: js.UndefOr[Double | AnonInterval] = js.undefined
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
    port: Int | Double = null,
    protocol: String = null,
    proxy: String = null,
    publicApiKey: String = null,
    retry: Double | AnonInterval = null,
    testMode: js.UndefOr[Boolean] = js.undefined,
    testModeLogger: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typings.formData.mod.^) => Unit = null,
    timeout: Int | Double = null
  ): ConstructorParams = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(mute)) __obj.updateDynamic("mute")(mute.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (publicApiKey != null) __obj.updateDynamic("publicApiKey")(publicApiKey.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (!js.isUndefined(testMode)) __obj.updateDynamic("testMode")(testMode.asInstanceOf[js.Any])
    if (testModeLogger != null) __obj.updateDynamic("testModeLogger")(js.Any.fromFunction3(testModeLogger))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

