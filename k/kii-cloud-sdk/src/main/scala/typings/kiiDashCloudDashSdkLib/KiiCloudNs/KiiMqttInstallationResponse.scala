package typings
package kiiDashCloudDashSdkLib.KiiCloudNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiMqttInstallationResponse extends js.Object {
  var installationID: java.lang.String
  var installationRegistrationID: java.lang.String
}

object KiiMqttInstallationResponse {
  @scala.inline
  def apply(installationID: java.lang.String, installationRegistrationID: java.lang.String): KiiMqttInstallationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("installationID")(installationID)
    __obj.updateDynamic("installationRegistrationID")(installationRegistrationID)
    __obj.asInstanceOf[KiiMqttInstallationResponse]
  }
}

