package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendOptions extends js.Object {
  /** Message key */
  var key: String
  /**
    * Object to send to kafka.
    * It will be automatically Avro encoded if schema registry finds a valid schema for topic
    */
  var messages: js.Object
  /** Kafka topic name to publish message */
  var topic: String
}

object SendOptions {
  @scala.inline
  def apply(key: String, messages: js.Object, topic: String): SendOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendOptions]
  }
}

