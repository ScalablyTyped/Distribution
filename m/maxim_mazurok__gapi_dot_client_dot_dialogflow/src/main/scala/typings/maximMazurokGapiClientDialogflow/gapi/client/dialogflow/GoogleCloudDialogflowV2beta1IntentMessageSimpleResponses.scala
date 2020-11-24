package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses extends js.Object {
  
  /** Required. The list of simple responses. */
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageSimpleResponsesOps[Self <: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
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
    def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse*): Self = this.set("simpleResponses", js.Array(value :_*))
    
    @scala.inline
    def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]): Self = this.set("simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleResponses: Self = this.set("simpleResponses", js.undefined)
  }
}
