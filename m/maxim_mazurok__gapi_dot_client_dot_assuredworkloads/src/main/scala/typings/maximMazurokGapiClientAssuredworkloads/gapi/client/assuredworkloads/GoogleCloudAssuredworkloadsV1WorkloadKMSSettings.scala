package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1WorkloadKMSSettings extends js.Object {
  
  /** Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary. */
  var nextRotationTime: js.UndefOr[String] = js.native
  
  /**
    * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at
    * most 876,000 hours.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
}
object GoogleCloudAssuredworkloadsV1WorkloadKMSSettings {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1WorkloadKMSSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1WorkloadKMSSettings]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1WorkloadKMSSettingsOps[Self <: GoogleCloudAssuredworkloadsV1WorkloadKMSSettings] (val x: Self) extends AnyVal {
    
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
    def setNextRotationTime(value: String): Self = this.set("nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextRotationTime: Self = this.set("nextRotationTime", js.undefined)
    
    @scala.inline
    def setRotationPeriod(value: String): Self = this.set("rotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotationPeriod: Self = this.set("rotationPeriod", js.undefined)
  }
}
