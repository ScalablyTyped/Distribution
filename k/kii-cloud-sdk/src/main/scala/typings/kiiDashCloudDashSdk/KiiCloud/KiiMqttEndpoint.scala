package typings.kiiDashCloudDashSdk.KiiCloud

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
    val __obj = js.Dynamic.literal(host = host, installationID = installationID, mqttTopic = mqttTopic, password = password, portSSL = portSSL, portTCP = portTCP, portWS = portWS, portWSS = portWSS, username = username)
    __obj.updateDynamic("X-MQTT-TTL")(`X-MQTT-TTL`)
    __obj.asInstanceOf[KiiMqttEndpoint]
  }
}

