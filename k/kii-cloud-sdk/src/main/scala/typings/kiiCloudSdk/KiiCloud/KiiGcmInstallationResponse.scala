package typings.kiiCloudSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KiiGcmInstallationResponse extends js.Object {
  var installationID: String = js.native
}

object KiiGcmInstallationResponse {
  @scala.inline
  def apply(installationID: String): KiiGcmInstallationResponse = {
    val __obj = js.Dynamic.literal(installationID = installationID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiGcmInstallationResponse]
  }
  @scala.inline
  implicit class KiiGcmInstallationResponseOps[Self <: KiiGcmInstallationResponse] (val x: Self) extends AnyVal {
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
    def setInstallationID(value: String): Self = this.set("installationID", value.asInstanceOf[js.Any])
  }
  
}

