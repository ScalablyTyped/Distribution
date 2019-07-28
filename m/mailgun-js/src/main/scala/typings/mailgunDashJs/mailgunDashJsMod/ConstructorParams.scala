package typings.mailgunDashJs.mailgunDashJsMod

import typings.mailgunDashJs.Anon_Interval
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
  var retry: js.UndefOr[Double | Anon_Interval] = js.undefined
  var testMode: js.UndefOr[Boolean] = js.undefined
  var testModeLogger: js.UndefOr[
    js.Function3[
      /* httpOptions */ LoggerHttpOptions, 
      /* payload */ String, 
      /* form */ typings.formDashData.formDashDataMod.^, 
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
    retry: Double | Anon_Interval = null,
    testMode: js.UndefOr[Boolean] = js.undefined,
    testModeLogger: (/* httpOptions */ LoggerHttpOptions, /* payload */ String, /* form */ typings.formDashData.formDashDataMod.^) => Unit = null,
    timeout: Int | Double = null
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
    if (!js.isUndefined(testMode)) __obj.updateDynamic("testMode")(testMode)
    if (testModeLogger != null) __obj.updateDynamic("testModeLogger")(js.Any.fromFunction3(testModeLogger))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstructorParams]
  }
}

