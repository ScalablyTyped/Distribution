package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1ImportDataRequest extends StObject {
  
  /** Required. Specify the input source of the data. */
  var inputConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1InputConfig] = js.undefined
  
  /** Email of the user who started the import task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1ImportDataRequest {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1ImportDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImportDataRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImportDataRequest] (val x: Self) extends AnyVal {
    
    inline def setInputConfig(value: GoogleCloudDatalabelingV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
  }
}
