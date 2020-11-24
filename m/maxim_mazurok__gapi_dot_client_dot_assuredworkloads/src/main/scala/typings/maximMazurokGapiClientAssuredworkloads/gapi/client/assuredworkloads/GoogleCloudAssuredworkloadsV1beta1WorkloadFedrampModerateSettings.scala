package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings extends js.Object {
  
  /** Required. Input only. Immutable. Settings used to create a CMEK crypto key. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] = js.native
}
object GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettingsOps[Self <: GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampModerateSettings] (val x: Self) extends AnyVal {
    
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
    def setKmsSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings): Self = this.set("kmsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsSettings: Self = this.set("kmsSettings", js.undefined)
  }
}
