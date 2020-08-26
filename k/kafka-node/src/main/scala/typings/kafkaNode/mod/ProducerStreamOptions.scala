package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProducerStreamOptions extends js.Object {
  var highWaterMark: js.UndefOr[Double] = js.native
  var kafkaClient: js.UndefOr[KafkaClientOptions] = js.native
  var producer: js.UndefOr[ProducerOptions] = js.native
}

object ProducerStreamOptions {
  @scala.inline
  def apply(): ProducerStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProducerStreamOptions]
  }
  @scala.inline
  implicit class ProducerStreamOptionsOps[Self <: ProducerStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    @scala.inline
    def setKafkaClient(value: KafkaClientOptions): Self = this.set("kafkaClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKafkaClient: Self = this.set("kafkaClient", js.undefined)
    @scala.inline
    def setProducer(value: ProducerOptions): Self = this.set("producer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducer: Self = this.set("producer", js.undefined)
  }
  
}

