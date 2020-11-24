package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest extends js.Object {
  
  /** The collection of entity types to update or create. */
  var entityTypeBatchInline: js.UndefOr[GoogleCloudDialogflowV2EntityTypeBatch] = js.native
  
  /**
    * The URI to a Google Cloud Storage file containing entity types to update or create. The file format can either be a serialized proto (of EntityBatch type) or a JSON object. Note:
    * The URI must start with "gs://".
    */
  var entityTypeBatchUri: js.UndefOr[String] = js.native
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. The mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateEntityTypesRequestOps[Self <: GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest] (val x: Self) extends AnyVal {
    
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
    def setEntityTypeBatchInline(value: GoogleCloudDialogflowV2EntityTypeBatch): Self = this.set("entityTypeBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypeBatchInline: Self = this.set("entityTypeBatchInline", js.undefined)
    
    @scala.inline
    def setEntityTypeBatchUri(value: String): Self = this.set("entityTypeBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityTypeBatchUri: Self = this.set("entityTypeBatchUri", js.undefined)
    
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
