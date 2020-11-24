package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo extends js.Object {
  
  /** Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the parameter, unique within the form. This field cannot be modified by the webhook. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was just collected on the last conversation turn. */
  var justCollected: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user
    * specifies them. Required parameters must be filled before form filling concludes.
    */
  var required: js.UndefOr[Boolean] = js.native
  
  /**
    * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter. This field can be set to INVALID by the webhook to invalidate the parameter; other
    * values set by the webhook will be ignored.
    */
  var state: js.UndefOr[String] = js.native
  
  /** Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field can be set by the webhook to change the parameter value. */
  var value: js.UndefOr[js.Any] = js.native
}
object GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfoOps[Self <: GoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setJustCollected(value: Boolean): Self = this.set("justCollected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustCollected: Self = this.set("justCollected", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
