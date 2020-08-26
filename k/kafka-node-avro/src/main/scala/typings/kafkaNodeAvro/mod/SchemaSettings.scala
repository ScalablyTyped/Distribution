package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaSettings extends js.Object {
  /** Kafka schema registry url */
  var registry: String = js.native
}

object SchemaSettings {
  @scala.inline
  def apply(registry: String): SchemaSettings = {
    val __obj = js.Dynamic.literal(registry = registry.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSettings]
  }
  @scala.inline
  implicit class SchemaSettingsOps[Self <: SchemaSettings] (val x: Self) extends AnyVal {
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
    def setRegistry(value: String): Self = this.set("registry", value.asInstanceOf[js.Any])
  }
  
}

