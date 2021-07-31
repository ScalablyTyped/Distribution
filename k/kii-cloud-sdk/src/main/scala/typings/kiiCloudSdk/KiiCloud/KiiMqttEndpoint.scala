package typings.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KiiMqttEndpoint extends StObject {
  
  var `X-MQTT-TTL`: Double
  
  var host: String
  
  var installationID: String
  
  var mqttTopic: String
  
  var password: String
  
  var portSSL: Double
  
  var portTCP: Double
  
  var portWS: Double
  
  var portWSS: Double
  
  var username: String
}
object KiiMqttEndpoint {
  
  @scala.inline
  def apply(
    `X-MQTT-TTL`: Double,
    host: String,
    installationID: String,
    mqttTopic: String,
    password: String,
    portSSL: Double,
    portTCP: Double,
    portWS: Double,
    portWSS: Double,
    username: String
  ): KiiMqttEndpoint = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], installationID = installationID.asInstanceOf[js.Any], mqttTopic = mqttTopic.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], portSSL = portSSL.asInstanceOf[js.Any], portTCP = portTCP.asInstanceOf[js.Any], portWS = portWS.asInstanceOf[js.Any], portWSS = portWSS.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.updateDynamic("X-MQTT-TTL")(`X-MQTT-TTL`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiMqttEndpoint]
  }
  
  @scala.inline
  implicit class KiiMqttEndpointMutableBuilder[Self <: KiiMqttEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallationID(value: String): Self = StObject.set(x, "installationID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMqttTopic(value: String): Self = StObject.set(x, "mqttTopic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSSL(value: Double): Self = StObject.set(x, "portSSL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortTCP(value: Double): Self = StObject.set(x, "portTCP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortWS(value: Double): Self = StObject.set(x, "portWS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortWSS(value: Double): Self = StObject.set(x, "portWSS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setX-MQTT-TTL`(value: Double): Self = StObject.set(x, "X-MQTT-TTL", value.asInstanceOf[js.Any])
  }
}
