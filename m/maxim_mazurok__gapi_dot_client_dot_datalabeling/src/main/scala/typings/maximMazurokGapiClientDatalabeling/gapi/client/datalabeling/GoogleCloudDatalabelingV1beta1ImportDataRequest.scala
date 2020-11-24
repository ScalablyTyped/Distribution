package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1ImportDataRequest extends js.Object {
  
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
  implicit class GoogleCloudDatalabelingV1beta1ImportDataRequestOps[Self <: GoogleCloudDatalabelingV1beta1ImportDataRequest] (val x: Self) extends AnyVal {
    
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
    def setInputConfig(value: GoogleCloudDatalabelingV1beta1InputConfig): Self = this.set("inputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputConfig: Self = this.set("inputConfig", js.undefined)
    
    @scala.inline
    def setUserEmailAddress(value: String): Self = this.set("userEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmailAddress: Self = this.set("userEmailAddress", js.undefined)
  }
}
