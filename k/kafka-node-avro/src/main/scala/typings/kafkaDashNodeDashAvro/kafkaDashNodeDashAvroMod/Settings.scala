package typings.kafkaDashNodeDashAvro.kafkaDashNodeDashAvroMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  /** Kafka broker settings */
  var kafka: KafkaSettings
  /** Kafka schema registry settings */
  var schema: SchemaSettings
}

object Settings {
  @scala.inline
  def apply(kafka: KafkaSettings, schema: SchemaSettings): Settings = {
    val __obj = js.Dynamic.literal(kafka = kafka.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Settings]
  }
}

