package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerOptions extends js.Object {
  var allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined
  var createPartitioner: js.UndefOr[js.Function0[js.Function1[/* options */ kafkajsLib.Anon_Message, scala.Double]]] = js.undefined
  var idempotent: js.UndefOr[scala.Boolean] = js.undefined
  var metadataMaxAge: js.UndefOr[scala.Double] = js.undefined
  var retry: js.UndefOr[RetryOptions] = js.undefined
  var transactionTimeout: js.UndefOr[scala.Double] = js.undefined
}

object ProducerOptions {
  @scala.inline
  def apply(
    allowAutoTopicCreation: js.UndefOr[scala.Boolean] = js.undefined,
    createPartitioner: js.Function0[js.Function1[/* options */ kafkajsLib.Anon_Message, scala.Double]] = null,
    idempotent: js.UndefOr[scala.Boolean] = js.undefined,
    metadataMaxAge: scala.Int | scala.Double = null,
    retry: RetryOptions = null,
    transactionTimeout: scala.Int | scala.Double = null
  ): ProducerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoTopicCreation)) __obj.updateDynamic("allowAutoTopicCreation")(allowAutoTopicCreation)
    if (createPartitioner != null) __obj.updateDynamic("createPartitioner")(createPartitioner)
    if (!js.isUndefined(idempotent)) __obj.updateDynamic("idempotent")(idempotent)
    if (metadataMaxAge != null) __obj.updateDynamic("metadataMaxAge")(metadataMaxAge.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(retry)
    if (transactionTimeout != null) __obj.updateDynamic("transactionTimeout")(transactionTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerOptions]
  }
}

