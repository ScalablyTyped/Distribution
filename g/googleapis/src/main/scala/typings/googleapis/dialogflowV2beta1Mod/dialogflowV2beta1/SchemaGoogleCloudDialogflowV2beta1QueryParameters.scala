package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the parameters of the conversational query.
  */
trait SchemaGoogleCloudDialogflowV2beta1QueryParameters extends StObject {
  
  /**
    * Optional. The collection of contexts to be activated before this query is
    * executed.
    */
  var contexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Context]] = js.undefined
  
  /**
    * Optional. The geo location of this conversational query.
    */
  var geoLocation: js.UndefOr[SchemaGoogleTypeLatLng] = js.undefined
  
  /**
    * Optional. KnowledgeBases to get alternative results from. If not set, the
    * KnowledgeBases enabled in the agent (through UI) will be used. Format:
    * `projects/&lt;Project ID&gt;/knowledgeBases/&lt;Knowledge Base ID&gt;`.
    */
  var knowledgeBaseNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Optional. This field can be used to pass custom data into the webhook
    * associated with the agent. Arbitrary JSON objects are supported.
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * Optional. Specifies whether to delete all contexts in the current session
    * before the new ones are activated.
    */
  var resetContexts: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Configures the type of sentiment analysis to perform. If not
    * provided, sentiment analysis is not performed. Note: Sentiment Analysis
    * is only currently available for Enterprise Edition agents.
    */
  var sentimentAnalysisRequestConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig] = js.undefined
  
  /**
    * Optional. Additional session entity types to replace or extend developer
    * entity types with. The entity synonyms apply to all languages and persist
    * for the session of this query.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]] = js.undefined
  
  /**
    * Optional. The time zone of this conversational query from the [time zone
    * database](https://www.iana.org/time-zones), e.g., America/New_York,
    * Europe/Paris. If not provided, the time zone specified in agent settings
    * is used.
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1QueryParameters {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1QueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1QueryParameters]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1QueryParametersMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2beta1QueryParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Context]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Context*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setGeoLocation(value: SchemaGoogleTypeLatLng): Self = StObject.set(x, "geoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoLocationUndefined: Self = StObject.set(x, "geoLocation", js.undefined)
    
    @scala.inline
    def setKnowledgeBaseNames(value: js.Array[String]): Self = StObject.set(x, "knowledgeBaseNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKnowledgeBaseNamesUndefined: Self = StObject.set(x, "knowledgeBaseNames", js.undefined)
    
    @scala.inline
    def setKnowledgeBaseNamesVarargs(value: String*): Self = StObject.set(x, "knowledgeBaseNames", js.Array(value :_*))
    
    @scala.inline
    def setPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    @scala.inline
    def setResetContexts(value: Boolean): Self = StObject.set(x, "resetContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetContextsUndefined: Self = StObject.set(x, "resetContexts", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisRequestConfig(value: SchemaGoogleCloudDialogflowV2beta1SentimentAnalysisRequestConfig): Self = StObject.set(x, "sentimentAnalysisRequestConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentAnalysisRequestConfigUndefined: Self = StObject.set(x, "sentimentAnalysisRequestConfig", js.undefined)
    
    @scala.inline
    def setSessionEntityTypes(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SessionEntityType]): Self = StObject.set(x, "sessionEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionEntityTypesUndefined: Self = StObject.set(x, "sessionEntityTypes", js.undefined)
    
    @scala.inline
    def setSessionEntityTypesVarargs(value: SchemaGoogleCloudDialogflowV2beta1SessionEntityType*): Self = StObject.set(x, "sessionEntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
