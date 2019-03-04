package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaOptions extends js.Object {
  var brokers: js.Array[java.lang.String]
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var logLevel: js.UndefOr[logLevel] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var sasl: js.UndefOr[SASLOptions] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
}

object KafkaOptions {
  @scala.inline
  def apply(
    brokers: js.Array[java.lang.String],
    clientId: java.lang.String = null,
    connectionTimeout: scala.Int | scala.Double = null,
    logLevel: logLevel = null,
    requestTimeout: scala.Int | scala.Double = null,
    retry: RetryOptions = null,
    sasl: SASLOptions = null,
    ssl: nodeLib.tlsMod.ConnectionOptions = null
  ): KafkaOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (sasl != null) __obj.updateDynamic("sasl")(sasl)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[KafkaOptions]
  }
}

