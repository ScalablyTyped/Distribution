package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImportDataRequest extends StObject {
  
  /** Required. Specify the input source of the data. */
  var inputConfig: js.UndefOr[GoogleCloudDatalabelingV1beta1InputConfig] = js.native
  
  /** Email of the user who started the import task and should be notified by email. If empty no notification will be sent. */
  var userEmailAddress: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1ImportDataRequest {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1ImportDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1ImportDataRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1ImportDataRequestMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1ImportDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfig(value: GoogleCloudDatalabelingV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = StObject.set(x, "userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailAddressUndefined: Self = StObject.set(x, "userEmailAddress", js.undefined)
  }
}
