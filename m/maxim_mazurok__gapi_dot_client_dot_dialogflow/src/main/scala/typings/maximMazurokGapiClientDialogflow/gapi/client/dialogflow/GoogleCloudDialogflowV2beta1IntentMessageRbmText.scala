package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmText extends js.Object {
  
  /** Optional. One or more suggestions to show to the user. */
  var rbmSuggestion: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]] = js.native
  
  /** Required. Text sent and displayed to the user. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmText {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmText]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmTextOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmText] (val x: Self) extends AnyVal {
    
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
    def setRbmSuggestionVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion*): Self = this.set("rbmSuggestion", js.Array(value :_*))
    
    @scala.inline
    def setRbmSuggestion(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]): Self = this.set("rbmSuggestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRbmSuggestion: Self = this.set("rbmSuggestion", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
