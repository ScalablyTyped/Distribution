package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MqttConfig extends StObject {
  
  /** If enabled, allows connections using the MQTT protocol. Otherwise, MQTT connections to this registry will fail. */
  var mqttEnabledState: js.UndefOr[String] = js.undefined
}
object MqttConfig {
  
  inline def apply(): MqttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MqttConfig]
  }
  
  extension [Self <: MqttConfig](x: Self) {
    
    inline def setMqttEnabledState(value: String): Self = StObject.set(x, "mqttEnabledState", value.asInstanceOf[js.Any])
    
    inline def setMqttEnabledStateUndefined: Self = StObject.set(x, "mqttEnabledState", js.undefined)
  }
}
