package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KafkaSettings extends js.Object {
  /** Kafka broker host name */
  var kafkaHost: String
}

object KafkaSettings {
  @scala.inline
  def apply(kafkaHost: String): KafkaSettings = {
    val __obj = js.Dynamic.literal(kafkaHost = kafkaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaSettings]
  }
}

