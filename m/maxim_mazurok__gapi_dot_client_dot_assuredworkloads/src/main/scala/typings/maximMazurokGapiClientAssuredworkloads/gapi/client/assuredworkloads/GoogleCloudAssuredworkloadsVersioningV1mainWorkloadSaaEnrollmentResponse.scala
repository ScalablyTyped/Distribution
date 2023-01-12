package typings.maximMazurokGapiClientAssuredworkloads.gapi.client.assuredworkloads

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse extends StObject {
  
  /** Indicates SAA enrollment setup error if any. */
  var setupErrors: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Indicates SAA enrollment status of a given workload. */
  var setupStatus: js.UndefOr[String] = js.undefined
}
object GoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse {
  
  inline def apply(): GoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudAssuredworkloadsVersioningV1mainWorkloadSaaEnrollmentResponse] (val x: Self) extends AnyVal {
    
    inline def setSetupErrors(value: js.Array[String]): Self = StObject.set(x, "setupErrors", value.asInstanceOf[js.Any])
    
    inline def setSetupErrorsUndefined: Self = StObject.set(x, "setupErrors", js.undefined)
    
    inline def setSetupErrorsVarargs(value: String*): Self = StObject.set(x, "setupErrors", js.Array(value*))
    
    inline def setSetupStatus(value: String): Self = StObject.set(x, "setupStatus", value.asInstanceOf[js.Any])
    
    inline def setSetupStatusUndefined: Self = StObject.set(x, "setupStatus", js.undefined)
  }
}
