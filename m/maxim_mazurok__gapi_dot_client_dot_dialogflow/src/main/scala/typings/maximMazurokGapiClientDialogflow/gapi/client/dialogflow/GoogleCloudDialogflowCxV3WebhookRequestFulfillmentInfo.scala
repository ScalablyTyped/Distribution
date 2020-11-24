package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo extends js.Object {
  
  /** Always present. The tag used to identify which fulfillment is being called. */
  var tag: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfoOps[Self <: GoogleCloudDialogflowCxV3WebhookRequestFulfillmentInfo] (val x: Self) extends AnyVal {
    
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
