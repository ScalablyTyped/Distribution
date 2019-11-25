package typings.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiMqttInstallationResponse extends js.Object {
  var installationID: String
  var installationRegistrationID: String
}

object KiiMqttInstallationResponse {
  @scala.inline
  def apply(installationID: String, installationRegistrationID: String): KiiMqttInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any], installationRegistrationID = installationRegistrationID.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KiiMqttInstallationResponse]
  }
}

