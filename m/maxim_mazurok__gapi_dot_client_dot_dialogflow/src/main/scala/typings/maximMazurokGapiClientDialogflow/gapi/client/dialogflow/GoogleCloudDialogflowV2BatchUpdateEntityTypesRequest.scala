package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest extends StObject {
  
  /** The collection of entity types to update or create. */
  var entityTypeBatchInline: js.UndefOr[GoogleCloudDialogflowV2EntityTypeBatch] = js.undefined
  
  /**
    * The URI to a Google Cloud Storage file containing entity types to update or create. The file format can either be a serialized proto (of EntityBatch type) or a JSON object. Note:
    * The URI must start with "gs://".
    */
  var entityTypeBatchUri: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Optional. The mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateEntityTypesRequestMutableBuilder[Self <: GoogleCloudDialogflowV2BatchUpdateEntityTypesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityTypeBatchInline(value: GoogleCloudDialogflowV2EntityTypeBatch): Self = StObject.set(x, "entityTypeBatchInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeBatchInlineUndefined: Self = StObject.set(x, "entityTypeBatchInline", js.undefined)
    
    @scala.inline
    def setEntityTypeBatchUri(value: String): Self = StObject.set(x, "entityTypeBatchUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityTypeBatchUriUndefined: Self = StObject.set(x, "entityTypeBatchUri", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
