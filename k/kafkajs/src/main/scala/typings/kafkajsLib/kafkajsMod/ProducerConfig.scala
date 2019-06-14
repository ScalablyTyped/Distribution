package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerConfig extends js.Object {
  var allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined
  var createPartitioner: js.UndefOr[ICustomPartitioner] = js.undefined
  var idempotent: js.UndefOr[scala.Boolean] = js.undefined
  var maxInFlightRequests: js.UndefOr[scala.Double] = js.undefined
  var metadataMaxAge: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var transactionTimeout: js.UndefOr[scala.Double] = js.undefined
  var transactionalId: js.UndefOr[java.lang.String] = js.undefined
}

object ProducerConfig {
  @scala.inline
  def apply(
    allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined,
    createPartitioner: ICustomPartitioner = null,
    idempotent: js.UndefOr[scala.Boolean] = js.undefined,
    maxInFlightRequests: scala.Int | scala.Double = null,
    metadataMaxAge: scala.Int | scala.Double = null,
    retry: RetryOptions = null,
    transactionTimeout: scala.Int | scala.Double = null,
    transactionalId: java.lang.String = null
  ): ProducerConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoTopicCreation)) __obj.updateDynamic("allowAutoTopicCreation")(allowAutoTopicCreation)
    if (createPartitioner != null) __obj.updateDynamic("createPartitioner")(createPartitioner)
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    if (maxInFlightRequests != null) __obj.updateDynamic("maxInFlightRequests")(maxInFlightRequests.asInstanceOf[js.Any])
    if (metadataMaxAge != null) __obj.updateDynamic("metadataMaxAge")(metadataMaxAge.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (transactionTimeout != null) __obj.updateDynamic("transactionTimeout")(transactionTimeout.asInstanceOf[js.Any])
    if (transactionalId != null) __obj.updateDynamic("transactionalId")(transactionalId)
    __obj.asInstanceOf[ProducerConfig]
  }
}

