package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3PageInfoFormInfo extends js.Object {
  
  /** Optional for both WebhookRequest and WebhookResponse. The parameters contained in the form. Note that the webhook cannot add or remove any form parameter. */
  var parameterInfo: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]] = js.native
}
object GoogleCloudDialogflowCxV3PageInfoFormInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3PageInfoFormInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3PageInfoFormInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3PageInfoFormInfoOps[Self <: GoogleCloudDialogflowCxV3PageInfoFormInfo] (val x: Self) extends AnyVal {
    
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
    def setParameterInfoVarargs(value: GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo*): Self = this.set("parameterInfo", js.Array(value :_*))
    
    @scala.inline
    def setParameterInfo(value: js.Array[GoogleCloudDialogflowCxV3PageInfoFormInfoParameterInfo]): Self = this.set("parameterInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameterInfo: Self = this.set("parameterInfo", js.undefined)
  }
}
