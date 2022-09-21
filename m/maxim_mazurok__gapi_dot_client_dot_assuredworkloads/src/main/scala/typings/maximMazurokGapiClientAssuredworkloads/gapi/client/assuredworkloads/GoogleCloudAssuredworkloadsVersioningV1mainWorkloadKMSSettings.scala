package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings extends StObject {
  
  /** Required. Input only. Immutable. The time at which the Key Management Service will automatically create a new version of the crypto key and mark it as the primary. */
  var nextRotationTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the Key Management Service automatically rotates a key. Must be at least 24 hours and at
    * most 876,000 hours.
    */
  var rotationPeriod: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadKMSSettings](x: Self) {
    
    inline def setNextRotationTime(value: String): Self = StObject.set(x, "nextRotationTime", value.asInstanceOf[js.Any])
    
    inline def setNextRotationTimeUndefined: Self = StObject.set(x, "nextRotationTime", js.undefined)
    
    inline def setRotationPeriod(value: String): Self = StObject.set(x, "rotationPeriod", value.asInstanceOf[js.Any])
    
    inline def setRotationPeriodUndefined: Self = StObject.set(x, "rotationPeriod", js.undefined)
  }
}
