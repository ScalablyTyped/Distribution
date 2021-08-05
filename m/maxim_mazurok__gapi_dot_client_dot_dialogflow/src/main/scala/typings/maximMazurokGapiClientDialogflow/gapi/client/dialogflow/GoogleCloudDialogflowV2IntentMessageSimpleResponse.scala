package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageSimpleResponse extends StObject {
  
  /** Optional. The text to display. */
  var displayText: js.UndefOr[String] = js.undefined
  
  /** One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech. */
  var ssml: js.UndefOr[String] = js.undefined
  
  /** One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml. */
  var textToSpeech: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageSimpleResponse {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponse](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
