package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaClientOptions extends js.Object {
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.undefined
  var connectTimeout: js.UndefOr[Double] = js.undefined
  var idleConnection: js.UndefOr[Double] = js.undefined
  var kafkaHost: js.UndefOr[String] = js.undefined
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  var reconnectOnIdle: js.UndefOr[Boolean] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var sasl: js.UndefOr[js.Any] = js.undefined
  var sslOptions: js.UndefOr[js.Any] = js.undefined
}

object KafkaClientOptions {
  @scala.inline
  def apply(
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    clientId: String = null,
    connectRetryOptions: RetryOptions = null,
    connectTimeout: Int | Double = null,
    idleConnection: Int | Double = null,
    kafkaHost: String = null,
    maxAsyncRequests: Int | Double = null,
    reconnectOnIdle: js.UndefOr[Boolean] = js.undefined,
    requestTimeout: Int | Double = null,
    sasl: js.Any = null,
    sslOptions: js.Any = null
  ): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (connectRetryOptions != null) __obj.updateDynamic("connectRetryOptions")(connectRetryOptions.asInstanceOf[js.Any])
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (idleConnection != null) __obj.updateDynamic("idleConnection")(idleConnection.asInstanceOf[js.Any])
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost.asInstanceOf[js.Any])
    if (maxAsyncRequests != null) __obj.updateDynamic("maxAsyncRequests")(maxAsyncRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectOnIdle)) __obj.updateDynamic("reconnectOnIdle")(reconnectOnIdle.asInstanceOf[js.Any])
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (sasl != null) __obj.updateDynamic("sasl")(sasl.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaClientOptions]
  }
}

