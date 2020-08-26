package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KiiMqttEndpoint extends js.Object {
  var `X-MQTT-TTL`: Double = js.native
  var host: String = js.native
  var installationID: String = js.native
  var mqttTopic: String = js.native
  var password: String = js.native
  var portSSL: Double = js.native
  var portTCP: Double = js.native
  var portWS: Double = js.native
  var portWSS: Double = js.native
  var username: String = js.native
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
  implicit class KiiMqttEndpointOps[Self <: KiiMqttEndpoint] (val x: Self) extends AnyVal {
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
    def `setX-MQTT-TTL`(value: Double): Self = this.set("X-MQTT-TTL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstallationID(value: String): Self = this.set("installationID", value.asInstanceOf[js.Any])
    @scala.inline
    def setMqttTopic(value: String): Self = this.set("mqttTopic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortSSL(value: Double): Self = this.set("portSSL", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortTCP(value: Double): Self = this.set("portTCP", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortWS(value: Double): Self = this.set("portWS", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortWSS(value: Double): Self = this.set("portWSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
  
}

