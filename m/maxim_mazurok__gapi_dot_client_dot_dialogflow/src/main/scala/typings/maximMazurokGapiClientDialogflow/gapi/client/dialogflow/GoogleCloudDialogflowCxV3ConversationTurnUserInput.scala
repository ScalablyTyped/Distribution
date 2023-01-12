package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ConversationTurnUserInput extends StObject {
  
  /** Whether sentiment analysis is enabled. */
  var enableSentimentAnalysis: js.UndefOr[Boolean] = js.undefined
  
  /** Parameters that need to be injected into the conversation during intent detection. */
  var injectedParameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** Supports text input, event input, dtmf input in the test case. */
  var input: js.UndefOr[GoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /** If webhooks should be allowed to trigger in response to the user utterance. Often if parameters are injected, webhooks should not be enabled. */
  var isWebhookEnabled: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3ConversationTurnUserInput {
  
  inline def apply(): GoogleCloudDialogflowCxV3ConversationTurnUserInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ConversationTurnUserInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3ConversationTurnUserInput] (val x: Self) extends AnyVal {
    
    inline def setEnableSentimentAnalysis(value: Boolean): Self = StObject.set(x, "enableSentimentAnalysis", value.asInstanceOf[js.Any])
    
    inline def setEnableSentimentAnalysisUndefined: Self = StObject.set(x, "enableSentimentAnalysis", js.undefined)
    
    inline def setInjectedParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "injectedParameters", value.asInstanceOf[js.Any])
    
    inline def setInjectedParametersUndefined: Self = StObject.set(x, "injectedParameters", js.undefined)
    
    inline def setInput(value: GoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setIsWebhookEnabled(value: Boolean): Self = StObject.set(x, "isWebhookEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsWebhookEnabledUndefined: Self = StObject.set(x, "isWebhookEnabled", js.undefined)
  }
}
