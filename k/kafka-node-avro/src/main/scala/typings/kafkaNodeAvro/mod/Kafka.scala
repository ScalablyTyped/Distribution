package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Kafka extends js.Object {
  /** Publishes message to Kafka */
  def send(options: SendOptions): js.Promise[js.Object] = js.native
}

object Kafka {
  @scala.inline
  def apply(send: SendOptions => js.Promise[js.Object]): Kafka = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction1(send))
    __obj.asInstanceOf[Kafka]
  }
  @scala.inline
  implicit class KafkaOps[Self <: Kafka] (val x: Self) extends AnyVal {
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
    def setSend(value: SendOptions => js.Promise[js.Object]): Self = this.set("send", js.Any.fromFunction1(value))
  }
  
}

