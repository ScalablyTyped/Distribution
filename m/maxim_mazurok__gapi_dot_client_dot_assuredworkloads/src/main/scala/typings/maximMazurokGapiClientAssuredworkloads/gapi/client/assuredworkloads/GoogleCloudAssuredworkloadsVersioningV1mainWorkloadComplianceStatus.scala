package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus extends StObject {
  
  /** Count of active Violations which are acknowledged in the Workload. */
  var acknowledgedViolationCount: js.UndefOr[Double] = js.undefined
  
  /** Count of active Violations which haven't been acknowledged. */
  var activeViolationCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus](x: Self) {
    
    inline def setAcknowledgedViolationCount(value: Double): Self = StObject.set(x, "acknowledgedViolationCount", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgedViolationCountUndefined: Self = StObject.set(x, "acknowledgedViolationCount", js.undefined)
    
    inline def setActiveViolationCount(value: Double): Self = StObject.set(x, "activeViolationCount", value.asInstanceOf[js.Any])
    
    inline def setActiveViolationCountUndefined: Self = StObject.set(x, "activeViolationCount", js.undefined)
  }
}
