package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata extends StObject {
  
  /**
    * A list of call annotations that apply to this call.
    */
  var annotations: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1CallAnnotation]] = js.undefined
  
  /**
    * All the entities in the call.
    */
  var entities: js.UndefOr[StringDictionary[SchemaGoogleCloudContactcenterinsightsV1Entity] | Null] = js.undefined
  
  /**
    * All the matched intents in the call.
    */
  var intents: js.UndefOr[StringDictionary[SchemaGoogleCloudContactcenterinsightsV1Intent] | Null] = js.undefined
  
  /**
    * Overall conversation-level issue modeling result.
    */
  var issueModelResult: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1IssueModelResult] = js.undefined
  
  /**
    * All the matched phrase matchers in the call.
    */
  var phraseMatchers: js.UndefOr[StringDictionary[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData] | Null] = js.undefined
  
  /**
    * Overall conversation-level sentiment for each channel of the call.
    */
  var sentiments: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment]] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1AnalysisResultCallAnalysisMetadata](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1CallAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1CallAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setEntities(value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1Entity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesNull: Self = StObject.set(x, "entities", null)
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    inline def setIntents(value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1Intent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsNull: Self = StObject.set(x, "intents", null)
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIssueModelResult(value: SchemaGoogleCloudContactcenterinsightsV1IssueModelResult): Self = StObject.set(x, "issueModelResult", value.asInstanceOf[js.Any])
    
    inline def setIssueModelResultUndefined: Self = StObject.set(x, "issueModelResult", js.undefined)
    
    inline def setPhraseMatchers(value: StringDictionary[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchData]): Self = StObject.set(x, "phraseMatchers", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatchersNull: Self = StObject.set(x, "phraseMatchers", null)
    
    inline def setPhraseMatchersUndefined: Self = StObject.set(x, "phraseMatchers", js.undefined)
    
    inline def setSentiments(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment]): Self = StObject.set(x, "sentiments", value.asInstanceOf[js.Any])
    
    inline def setSentimentsUndefined: Self = StObject.set(x, "sentiments", js.undefined)
    
    inline def setSentimentsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1ConversationLevelSentiment*): Self = StObject.set(x, "sentiments", js.Array(value*))
  }
}
