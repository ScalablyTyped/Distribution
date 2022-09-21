package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ConversationModel extends StObject {
  
  /**
    * Metadata for article suggestion models.
    */
  var articleSuggestionModelMetadata: js.UndefOr[SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata] = js.undefined
  
  /**
    * Output only. Creation time of this model.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Datasets used to create model.
    */
  var datasets: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2InputDataset]] = js.undefined
  
  /**
    * Required. The display name of the model. At most 64 bytes long.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Language code for the conversation model. If not specified, the language is en-US. Language at ConversationModel should be set for all non en-us languages. This should be a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag. Example: "en-US".
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ConversationModel resource name. Format: `projects//conversationModels/`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metadata for smart reply models.
    */
  var smartReplyModelMetadata: js.UndefOr[SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata] = js.undefined
  
  /**
    * Output only. State of the model. A model can only serve prediction requests after it gets deployed.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ConversationModel {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ConversationModel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ConversationModel]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ConversationModel](x: Self) {
    
    inline def setArticleSuggestionModelMetadata(value: SchemaGoogleCloudDialogflowV2ArticleSuggestionModelMetadata): Self = StObject.set(x, "articleSuggestionModelMetadata", value.asInstanceOf[js.Any])
    
    inline def setArticleSuggestionModelMetadataUndefined: Self = StObject.set(x, "articleSuggestionModelMetadata", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDatasets(value: js.Array[SchemaGoogleCloudDialogflowV2InputDataset]): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: SchemaGoogleCloudDialogflowV2InputDataset*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSmartReplyModelMetadata(value: SchemaGoogleCloudDialogflowV2SmartReplyModelMetadata): Self = StObject.set(x, "smartReplyModelMetadata", value.asInstanceOf[js.Any])
    
    inline def setSmartReplyModelMetadataUndefined: Self = StObject.set(x, "smartReplyModelMetadata", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
