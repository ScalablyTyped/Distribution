package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings extends StObject {
  
  /** Required. Input only. Immutable. Settings used to create a CMEK crypto key. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] = js.native
}
object GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettingsMutableBuilder[Self <: GoogleCloudAssuredworkloadsV1beta1WorkloadFedrampHighSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsSettings(value: GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
