package typings.kafkaNodeAvro.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KafkaSettings extends js.Object {
  
  /** Kafka broker host name */
  var kafkaHost: String = js.native
}
object KafkaSettings {
  
  @scala.inline
  def apply(kafkaHost: String): KafkaSettings = {
    val __obj = js.Dynamic.literal(kafkaHost = kafkaHost.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaSettings]
  }
  
  @scala.inline
  implicit class KafkaSettingsOps[Self <: KafkaSettings] (val x: Self) extends AnyVal {
    
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
    def setKafkaHost(value: String): Self = this.set("kafkaHost", value.asInstanceOf[js.Any])
  }
}
