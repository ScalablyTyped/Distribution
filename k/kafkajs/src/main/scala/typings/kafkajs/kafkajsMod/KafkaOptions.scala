package typings.kafkajs.kafkajsMod

import typings.node.tlsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaOptions extends js.Object {
  var brokers: js.Array[String]
  var clientId: js.UndefOr[String] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var logCreator: js.UndefOr[js.Function0[js.Function1[/* message */ LoggerMessage, Unit]]] = js.undefined
  var logLevel: js.UndefOr[typings.kafkajs.kafkajsMod.logLevel] = js.undefined
  var requestTimeout: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var sasl: js.UndefOr[SASLOptions] = js.undefined
  var ssl: js.UndefOr[ConnectionOptions] = js.undefined
}

object KafkaOptions {
  @scala.inline
  def apply(
    brokers: js.Array[String],
    clientId: String = null,
    connectionTimeout: Int | Double = null,
    logCreator: () => js.Function1[/* message */ LoggerMessage, Unit] = null,
    logLevel: logLevel = null,
    requestTimeout: Int | Double = null,
    retry: RetryOptions = null,
    sasl: SASLOptions = null,
    ssl: ConnectionOptions = null
  ): KafkaOptions = {
    val __obj = js.Dynamic.literal(brokers = brokers)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (logCreator != null) __obj.updateDynamic("logCreator")(js.Any.fromFunction0(logCreator))
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel)
    if (requestTimeout != null) __obj.updateDynamic("requestTimeout")(requestTimeout.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (sasl != null) __obj.updateDynamic("sasl")(sasl)
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    __obj.asInstanceOf[KafkaOptions]
  }
}

