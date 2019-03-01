package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiMqttEndpoint extends js.Object {
  var `X-MQTT-TTL`: scala.Double
  var host: java.lang.String
  var installationID: java.lang.String
  var mqttTopic: java.lang.String
  var password: java.lang.String
  var portSSL: scala.Double
  var portTCP: scala.Double
  var portWS: scala.Double
  var portWSS: scala.Double
  var username: java.lang.String
}

object KiiMqttEndpoint {
  @scala.inline
  def apply(
    `X-MQTT-TTL`: scala.Double,
    host: java.lang.String,
    installationID: java.lang.String,
    mqttTopic: java.lang.String,
    password: java.lang.String,
    portSSL: scala.Double,
    portTCP: scala.Double,
    portWS: scala.Double,
    portWSS: scala.Double,
    username: java.lang.String
  ): KiiMqttEndpoint = {
    val __obj = js.Dynamic.literal(`X-MQTT-TTL` = `X-MQTT-TTL`)
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("installationID")(installationID)
    __obj.updateDynamic("mqttTopic")(mqttTopic)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("portSSL")(portSSL)
    __obj.updateDynamic("portTCP")(portTCP)
    __obj.updateDynamic("portWS")(portWS)
    __obj.updateDynamic("portWSS")(portWSS)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[KiiMqttEndpoint]
  }
}

