package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaConfig extends js.Object {
  var authenticationTimeout: js.UndefOr[scala.Double] = js.undefined
  var brokers: js.Array[java.lang.String]
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var enforceRequestTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var logCreator: js.UndefOr[logCreator] = js.undefined
  var logLevel: js.UndefOr[logLevel] = js.undefined
  var requestTimeout: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var sasl: js.UndefOr[SASLOptions] = js.undefined
  var socketFactory: js.UndefOr[ISocketFactory] = js.undefined
  var ssl: js.UndefOr[nodeLib.tlsMod.SecureContextOptions] = js.undefined
}

object KafkaConfig {
  @scala.inline
  def apply(
    brokers: js.Array[java.lang.String],
    authenticationTimeout: scala.Int | scala.Double = null,
    clientId: java.lang.String = null,
    connectionTimeout: scala.Int | scala.Double = null,
    enforceRequestTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    logCreator: logCreator = null,
    logLevel: logLevel = null,
    requestTimeout: scala.Int | scala.Double = null,
    retry: RetryOptions = null,
    sasl: SASLOptions = null,
    socketFactory: ISocketFactory = null,
    ssl: nodeLib.tlsMod.SecureContextOptions = null
  ): KafkaConfig = {
    val __obj = js.Dynamic.literal(brokers = brokers)
    if (authenticationTimeout != null) __obj.updateDynamic("authenticationTimeout")(authenticationTimeout.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceRequestTimeout)) __obj.updateDynamic("enforceRequestTimeout")(enforceRequestTimeout)
    if (logCreator != null) __obj.updateDynamic("logCreator")(logCreator)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (sasl != null) __obj.updateDynamic("sasl")(sasl)
    if (socketFactory != null) __obj.updateDynamic("socketFactory")(socketFactory)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[KafkaConfig]
  }
}

