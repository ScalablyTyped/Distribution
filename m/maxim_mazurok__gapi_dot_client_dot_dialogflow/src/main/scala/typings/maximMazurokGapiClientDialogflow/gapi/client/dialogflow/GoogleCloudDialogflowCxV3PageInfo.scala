package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3PageInfo extends js.Object {
  
  /** Always present for WebhookRequest. Ignored for WebhookResponse. The unique identifier of the current page. Format: `projects//locations//agents//flows//pages/`. */
  var currentPage: js.UndefOr[String] = js.native
  
  /** Optional for both WebhookRequest and WebhookResponse. Information about the form. */
  var formInfo: js.UndefOr[GoogleCloudDialogflowCxV3PageInfoFormInfo] = js.native
}
object GoogleCloudDialogflowCxV3PageInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3PageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3PageInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3PageInfoOps[Self <: GoogleCloudDialogflowCxV3PageInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrentPage(value: String): Self = this.set("currentPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPage: Self = this.set("currentPage", js.undefined)
    
    @scala.inline
    def setFormInfo(value: GoogleCloudDialogflowCxV3PageInfoFormInfo): Self = this.set("formInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormInfo: Self = this.set("formInfo", js.undefined)
  }
}
