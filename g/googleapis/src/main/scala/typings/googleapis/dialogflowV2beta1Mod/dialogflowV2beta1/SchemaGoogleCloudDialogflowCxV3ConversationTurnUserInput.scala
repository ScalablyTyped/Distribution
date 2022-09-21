package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput extends StObject {
  
  /**
    * Whether sentiment analysis is enabled.
    */
  var enableSentimentAnalysis: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Parameters that need to be injected into the conversation during intent detection.
    */
  var injectedParameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Supports text input, event input, dtmf input in the test case.
    */
  var input: js.UndefOr[SchemaGoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /**
    * If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled.
    */
  var isWebhookEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ConversationTurnUserInput](x: Self) {
    
    inline def setEnableSentimentAnalysis(value: Boolean): Self = StObject.set(x, "enableSentimentAnalysis", value.asInstanceOf[js.Any])
    
    inline def setEnableSentimentAnalysisNull: Self = StObject.set(x, "enableSentimentAnalysis", null)
    
    inline def setEnableSentimentAnalysisUndefined: Self = StObject.set(x, "enableSentimentAnalysis", js.undefined)
    
    inline def setInjectedParameters(value: StringDictionary[Any]): Self = StObject.set(x, "injectedParameters", value.asInstanceOf[js.Any])
    
    inline def setInjectedParametersNull: Self = StObject.set(x, "injectedParameters", null)
    
    inline def setInjectedParametersUndefined: Self = StObject.set(x, "injectedParameters", js.undefined)
    
    inline def setInput(value: SchemaGoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setIsWebhookEnabled(value: Boolean): Self = StObject.set(x, "isWebhookEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsWebhookEnabledNull: Self = StObject.set(x, "isWebhookEnabled", null)
    
    inline def setIsWebhookEnabledUndefined: Self = StObject.set(x, "isWebhookEnabled", js.undefined)
  }
}
