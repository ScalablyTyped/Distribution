package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse extends StObject {
  
  /** Indicates SAA enrollment setup error if any. */
  var setupErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates SAA enrollment status of a given workload. */
  var setupStatus: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse {
  
  inline def apply(): GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse]
  }
  
  extension [Self <: GoogleCloudAssuredworkloadsV1WorkloadSaaEnrollmentResponse](x: Self) {
    
    inline def setSetupErrors(value: js.Array[String]): Self = StObject.set(x, "setupErrors", value.asInstanceOf[js.Any])
    
    inline def setSetupErrorsUndefined: Self = StObject.set(x, "setupErrors", js.undefined)
    
    inline def setSetupErrorsVarargs(value: String*): Self = StObject.set(x, "setupErrors", js.Array(value*))
    
    inline def setSetupStatus(value: String): Self = StObject.set(x, "setupStatus", value.asInstanceOf[js.Any])
    
    inline def setSetupStatusUndefined: Self = StObject.set(x, "setupStatus", js.undefined)
  }
}
