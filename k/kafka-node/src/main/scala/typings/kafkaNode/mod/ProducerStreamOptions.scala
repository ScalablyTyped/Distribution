package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerStreamOptions extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.undefined
  var kafkaClient: js.UndefOr[KafkaClientOptions] = js.undefined
  var producer: js.UndefOr[ProducerOptions] = js.undefined
}

object ProducerStreamOptions {
  @scala.inline
  def apply(
    highWaterMark: js.UndefOr[Double] = js.undefined,
    kafkaClient: KafkaClientOptions = null,
    producer: ProducerOptions = null
  ): ProducerStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highWaterMark)) __obj.updateDynamic("highWaterMark")(highWaterMark.get.asInstanceOf[js.Any])
    if (kafkaClient != null) __obj.updateDynamic("kafkaClient")(kafkaClient.asInstanceOf[js.Any])
    if (producer != null) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProducerStreamOptions]
  }
}

