package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ConversationModel extends StObject {
  
  /** Metadata for article suggestion models. */
  var articleSuggestionModelMetadata: js.UndefOr[GoogleCloudDialogflowV2ArticleSuggestionModelMetadata] = js.undefined
  
  /** Output only. Creation time of this model. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Required. Datasets used to create model. */
  var datasets: js.UndefOr[js.Array[GoogleCloudDialogflowV2InputDataset]] = js.undefined
  
  /** Required. The display name of the model. At most 64 bytes long. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a
    * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** ConversationModel resource name. Format: `projects//conversationModels/` */
  var name: js.UndefOr[String] = js.undefined
  
  /** Metadata for smart reply models. */
  var smartReplyModelMetadata: js.UndefOr[GoogleCloudDialogflowV2SmartReplyModelMetadata] = js.undefined
  
  /** Output only. State of the model. A model can only serve prediction requests after it gets deployed. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2ConversationModel {
  
  inline def apply(): GoogleCloudDialogflowV2ConversationModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ConversationModel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2ConversationModel] (val x: Self) extends AnyVal {
    
    inline def setArticleSuggestionModelMetadata(value: GoogleCloudDialogflowV2ArticleSuggestionModelMetadata): Self = StObject.set(x, "articleSuggestionModelMetadata", value.asInstanceOf[js.Any])
    
    inline def setArticleSuggestionModelMetadataUndefined: Self = StObject.set(x, "articleSuggestionModelMetadata", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatasets(value: js.Array[GoogleCloudDialogflowV2InputDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: GoogleCloudDialogflowV2InputDataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSmartReplyModelMetadata(value: GoogleCloudDialogflowV2SmartReplyModelMetadata): Self = StObject.set(x, "smartReplyModelMetadata", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyModelMetadataUndefined: Self = StObject.set(x, "smartReplyModelMetadata", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
