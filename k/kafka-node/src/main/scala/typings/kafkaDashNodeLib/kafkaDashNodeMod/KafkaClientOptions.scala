package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaClientOptions extends js.Object {
  var autoConnect: js.UndefOr[scala.Boolean] = js.undefined
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.undefined
  var connectTimeout: js.UndefOr[scala.Double] = js.undefined
  var kafkaHost: js.UndefOr[java.lang.String] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var sslOptions: js.UndefOr[js.Any] = js.undefined
}

object KafkaClientOptions {
  @scala.inline
  def apply(
    autoConnect: js.UndefOr[scala.Boolean] = js.undefined,
    clientId: java.lang.String = null,
    connectRetryOptions: RetryOptions = null,
    connectTimeout: scala.Int | scala.Double = null,
    kafkaHost: java.lang.String = null,
    requestTimeout: scala.Int | scala.Double = null,
    sslOptions: js.Any = null
  ): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectRetryOptions != null) __obj.updateDynamic("connectRetryOptions")(connectRetryOptions)
    if (connectTimeout != null) __obj.updateDynamic("connectTimeout")(connectTimeout.asInstanceOf[js.Any])
    if (kafkaHost != null) __obj.updateDynamic("kafkaHost")(kafkaHost)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (sslOptions != null) __obj.updateDynamic("sslOptions")(sslOptions)
    __obj.asInstanceOf[KafkaClientOptions]
  }
}

