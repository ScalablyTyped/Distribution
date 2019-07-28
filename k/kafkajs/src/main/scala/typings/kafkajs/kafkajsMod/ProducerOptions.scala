package typings.kafkajs.kafkajsMod

import typings.kafkajs.Anon_Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined
  var createPartitioner: js.UndefOr[js.Function0[js.Function1[/* options */ Anon_Message, Double]]] = js.undefined
  var idempotent: js.UndefOr[Boolean] = js.undefined
  var metadataMaxAge: js.UndefOr[Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var transactionTimeout: js.UndefOr[Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(
    allowAutoTopicCreation: js.UndefOr[Boolean] = js.undefined,
    createPartitioner: () => js.Function1[/* options */ Anon_Message, Double] = null,
    idempotent: js.UndefOr[Boolean] = js.undefined,
    metadataMaxAge: Int | Double = null,
    retry: RetryOptions = null,
    transactionTimeout: Int | Double = null
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoTopicCreation)) __obj.updateDynamic("allowAutoTopicCreation")(allowAutoTopicCreation)
    if (createPartitioner != null) __obj.updateDynamic("createPartitioner")(js.Any.fromFunction0(createPartitioner))
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    if (metadataMaxAge != null) __obj.updateDynamic("metadataMaxAge")(metadataMaxAge.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (transactionTimeout != null) __obj.updateDynamic("transactionTimeout")(transactionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

