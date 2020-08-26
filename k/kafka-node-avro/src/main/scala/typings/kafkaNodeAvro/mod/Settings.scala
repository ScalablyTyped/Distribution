package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  /** Kafka broker settings */
  var kafka: KafkaSettings = js.native
  /** Kafka schema registry settings */
  var schema: SchemaSettings = js.native
}

object Settings {
  @scala.inline
  def apply(kafka: KafkaSettings, schema: SchemaSettings): Settings = {
    val __obj = js.Dynamic.literal(kafka = kafka.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setKafka(value: KafkaSettings): Self = this.set("kafka", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: SchemaSettings): Self = this.set("schema", value.asInstanceOf[js.Any])
  }
  
}

