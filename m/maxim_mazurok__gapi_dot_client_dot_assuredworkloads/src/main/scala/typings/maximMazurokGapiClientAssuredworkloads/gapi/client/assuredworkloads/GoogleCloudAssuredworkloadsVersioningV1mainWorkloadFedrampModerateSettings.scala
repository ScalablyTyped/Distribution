package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings extends StObject {
  
  /** Input only. Immutable. Settings used to create a CMEK crypto key. */
  var kmsSettings: js.UndefOr[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadFedrampModerateSettings] (val x: Self) extends AnyVal {
    
    inline def setKmsSettings(value: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings): Self = StObject.set(x, "kmsSettings", value.asInstanceOf[js.Any])
    
    inline def setKmsSettingsUndefined: Self = StObject.set(x, "kmsSettings", js.undefined)
  }
}
