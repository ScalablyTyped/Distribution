package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KiiGcmInstallationResponse extends js.Object {
  var installationID: String
}

object KiiGcmInstallationResponse {
  @scala.inline
  def apply(installationID: String): KiiGcmInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiGcmInstallationResponse]
  }
}

