package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiMqttEndpoint extends js.Object {
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
}

