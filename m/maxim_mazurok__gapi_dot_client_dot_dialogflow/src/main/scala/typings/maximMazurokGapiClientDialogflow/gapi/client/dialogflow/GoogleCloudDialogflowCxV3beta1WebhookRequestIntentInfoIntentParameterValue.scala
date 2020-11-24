package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue extends js.Object {
  
  /** Always present. Original text value extracted from user utterance. */
  var originalValue: js.UndefOr[String] = js.native
  
  /** Always present. Structured value for the parameter extracted from user utterance. */
  var resolvedValue: js.UndefOr[js.Any] = js.native
}
object GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValueOps[Self <: GoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfoIntentParameterValue] (val x: Self) extends AnyVal {
    
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
    def setOriginalValue(value: String): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalValue: Self = this.set("originalValue", js.undefined)
    
    @scala.inline
    def setResolvedValue(value: js.Any): Self = this.set("resolvedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolvedValue: Self = this.set("resolvedValue", js.undefined)
  }
}
