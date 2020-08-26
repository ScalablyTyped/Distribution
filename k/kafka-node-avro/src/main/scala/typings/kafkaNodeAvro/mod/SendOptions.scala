package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendOptions extends js.Object {
  /** Message key */
  var key: String = js.native
  /**
    * Object to send to kafka.
    * It will be automatically Avro encoded if schema registry finds a valid schema for topic
    */
  var messages: js.Object = js.native
  /** Kafka topic name to publish message */
  var topic: String = js.native
}

object SendOptions {
  @scala.inline
  def apply(key: String, messages: js.Object, topic: String): SendOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
  @scala.inline
  implicit class SendOptionsOps[Self <: SendOptions] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessages(value: js.Object): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
  }
  
}

