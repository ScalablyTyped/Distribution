package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig extends StObject {
  
  /**
    * Enable entity extraction in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Currently, this feature is not general available, please contact Google to get access.
    */
  var enableEntityExtraction: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Enable sentiment analysis in conversation messages on [agent assist stage](https://cloud.google.com/dialogflow/priv/docs/contact-center/basics#stages). If unspecified, defaults to false. Sentiment analysis inspects user input and identifies the prevailing subjective opinion, especially to determine a user's attitude as positive, negative, or neutral: https://cloud.google.com/natural-language/docs/basics#sentiment_analysis For Participants.StreamingAnalyzeContent method, result will be in StreamingAnalyzeContentResponse.message.SentimentAnalysisResult. For Participants.AnalyzeContent method, result will be in AnalyzeContentResponse.message.SentimentAnalysisResult For Conversations.ListMessages method, result will be in ListMessagesResponse.messages.SentimentAnalysisResult If Pub/Sub notification is configured, result will be in ConversationEvent.new_message_payload.SentimentAnalysisResult.
    */
  var enableSentimentAnalysis: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2HumanAgentAssistantConfigMessageAnalysisConfig](x: Self) {
    
    inline def setEnableEntityExtraction(value: Boolean): Self = StObject.set(x, "enableEntityExtraction", value.asInstanceOf[js.Any])
    
    inline def setEnableEntityExtractionNull: Self = StObject.set(x, "enableEntityExtraction", null)
    
    inline def setEnableEntityExtractionUndefined: Self = StObject.set(x, "enableEntityExtraction", js.undefined)
    
    inline def setEnableSentimentAnalysis(value: Boolean): Self = StObject.set(x, "enableSentimentAnalysis", value.asInstanceOf[js.Any])
    
    inline def setEnableSentimentAnalysisNull: Self = StObject.set(x, "enableSentimentAnalysis", null)
    
    inline def setEnableSentimentAnalysisUndefined: Self = StObject.set(x, "enableSentimentAnalysis", js.undefined)
  }
}
