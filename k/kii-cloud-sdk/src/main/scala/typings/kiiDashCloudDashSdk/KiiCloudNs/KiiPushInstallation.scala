package typings.kiiDashCloudDashSdk.KiiCloudNs

import typings.kiiDashCloudDashSdk.Anon_ErrorFailure
import typings.kiiDashCloudDashSdk.Anon_ErrorFailureResponse
import typings.kiiDashCloudDashSdk.Anon_ErrorFailureResponseSuccess
import typings.kiiDashCloudDashSdk.Anon_ErrorFailureResponseSuccessAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a KiiPushInstallation object
  */
@JSGlobal("KiiCloud.KiiPushInstallation")
@js.native
class KiiPushInstallation () extends js.Object {
  /**
    * Get MQTT endpoint.
    * If the MQTT endpoint is not ready, this method retries request up to three times.
    * <br><br>
    * Note that only MQTT over tls is supported currently.<br>
    * Don't use portSSL, portWS or portWSS until we support it.
    *
    * @param installationID The ID of the installation in the platform.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(response).
    *       <ul>
    *         <li>response.installationID is ID of the installation in the platform.</li>
    *         <li>response.username is username to use for connecting to the MQTT broker.</li>
    *         <li>response.password is assword to use for connecting to the MQTT broker.</li>
    *         <li>response.mqttTopic is topic to subscribe in the MQTT broker.</li>
    *         <li>response.host is hostname of the MQTT broker.</li>
    *         <li>response.X-MQTT-TTL is the amount of time in seconds that specifies how long the mqttTopic will be valid, after that the client needs to request new MQTT endpoint info.</li>
    *         <li>response.portTCP is port to connect using plain TCP.</li>
    *         <li>response.portSSL is port to connect using SSL/TLS.</li>
    *         <li>response.portWS is port to connect using plain Websocket.</li>
    *         <li>response.portWSS is port to connect using SSL/TLS Websocket.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    */
  def getMqttEndpoint(installationID: String): js.Promise[KiiMqttEndpoint] = js.native
  def getMqttEndpoint(installationID: String, callbacks: Anon_ErrorFailureResponseSuccessAny): js.Promise[KiiMqttEndpoint] = js.native
  /**
    * Register the id issued by GCM to the Kii cloud for current logged in user.
    *
    * @param installationRegistrationID The ID of registration that identifies the installation externally.
    * @param development Indicates if the installation is for development or production environment.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(response).
    *       <ul>
    *         <li>response.installationID is ID of the installation in the platform.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    */
  def installGcm(installationRegistrationID: String, development: Boolean): js.Promise[KiiGcmInstallationResponse] = js.native
  def installGcm(installationRegistrationID: String, development: Boolean, callbacks: Anon_ErrorFailureResponse): js.Promise[KiiGcmInstallationResponse] = js.native
  /**
    * Register a MQTT installation to the Kii cloud for current logged in user.
    *
    * @param development Indicates if the installation is for development or production environment.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function(response).
    *       <ul>
    *         <li>response.installationID is ID of the installation in the platform.</li>
    *         <li>response.installationRegistrationID is ID of registration that identifies the installation externally.</li>
    *       </ul>
    *     </li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    */
  def installMqtt(development: Boolean): js.Promise[KiiMqttInstallationResponse] = js.native
  def installMqtt(development: Boolean, callbacks: Anon_ErrorFailureResponseSuccess): js.Promise[KiiMqttInstallationResponse] = js.native
  /**
    * Unregister the push settings by the id(issued by push provider) that is used for installation.
    *
    * @param installationRegistrationID The ID of registration that identifies the installation externally.
    * @param deviceType The type of the installation, current implementation only supports "ANDROID" and "MQTT".
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function().</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    */
  def uninstall(installationRegistrationID: String, deviceType: String): js.Promise[Unit] = js.native
  def uninstall(installationRegistrationID: String, deviceType: String, callbacks: Anon_ErrorFailure): js.Promise[Unit] = js.native
  /**
    * Unregister the push settings by the id(issued by KiiCloud) that is used for installation.
    *
    * @param installationID The ID of the installation issued by KiiCloud.
    * @param callbacks An object with callback methods defined
    *
    * @return return promise object.
    *   <ul>
    *     <li>fulfill callback function: function().</li>
    *     <li>reject callback function: function(error). error is an Error instance.
    *       <ul>
    *         <li>error.message</li>
    *       </ul>
    *     </li>
    *   </ul>
    *
    * @example
    *
    */
  def uninstallByInstallationID(installationID: String): js.Promise[Unit] = js.native
  def uninstallByInstallationID(installationID: String, callbacks: Anon_ErrorFailure): js.Promise[Unit] = js.native
}

