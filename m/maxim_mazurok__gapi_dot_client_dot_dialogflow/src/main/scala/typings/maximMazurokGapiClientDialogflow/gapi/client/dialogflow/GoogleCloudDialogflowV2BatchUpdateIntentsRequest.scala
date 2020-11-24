package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchUpdateIntentsRequest extends js.Object {
  
  /** The collection of intents to update or create. */
  var intentBatchInline: js.UndefOr[GoogleCloudDialogflowV2IntentBatch] = js.native
  
  /**
    * The URI to a Google Cloud Storage file containing intents to update or create. The file format can either be a serialized proto (of IntentBatch type) or JSON object. Note: The URI
    * must start with "gs://".
    */
  var intentBatchUri: js.UndefOr[String] = js.native
  
  /** Optional. The resource view to apply to the returned intent. */
  var intentView: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. The mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2BatchUpdateIntentsRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateIntentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateIntentsRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateIntentsRequestOps[Self <: GoogleCloudDialogflowV2BatchUpdateIntentsRequest] (val x: Self) extends AnyVal {
    
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
    def setIntentBatchInline(value: GoogleCloudDialogflowV2IntentBatch): Self = this.set("intentBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentBatchInline: Self = this.set("intentBatchInline", js.undefined)
    
    @scala.inline
    def setIntentBatchUri(value: String): Self = this.set("intentBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentBatchUri: Self = this.set("intentBatchUri", js.undefined)
    
    @scala.inline
    def setIntentView(value: String): Self = this.set("intentView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentView: Self = this.set("intentView", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
