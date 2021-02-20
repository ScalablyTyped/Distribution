package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings extends StObject {
  
  /** Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary. */
  var nextRotationTime: js.UndefOr[String] = js.native
  
  /**
    * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at
    * most 876,000 hours.
    */
  var rotationPeriod: js.UndefOr[String] = js.native
}
object GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings {
  
  @scala.inline
  def apply(): GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings]
  }
  
  @scala.inline
  implicit class GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettingsMutableBuilder[Self <: GoogleCloudAssuredworkloadsV1beta1WorkloadKMSSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    @scala.inline
    def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
  }
}
