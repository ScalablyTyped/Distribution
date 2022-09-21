package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse extends StObject {
  
  /**
    * Optional. The text to display.
    */
  var displayText: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One of text_to_speech or ssml must be provided. Structured spoken response to the user in the SSML format. Mutually exclusive with text_to_speech.
    */
  var ssml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One of text_to_speech or ssml must be provided. The plain text of the speech output. Mutually exclusive with ssml.
    */
  var textToSpeech: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageSimpleResponse](x: Self) {
    
    inline def setDisplayText(value: String): Self = StObject.set(x, "displayText", value.asInstanceOf[js.Any])
    
    inline def setDisplayTextNull: Self = StObject.set(x, "displayText", null)
    
    inline def setDisplayTextUndefined: Self = StObject.set(x, "displayText", js.undefined)
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setTextToSpeech(value: String): Self = StObject.set(x, "textToSpeech", value.asInstanceOf[js.Any])
    
    inline def setTextToSpeechNull: Self = StObject.set(x, "textToSpeech", null)
    
    inline def setTextToSpeechUndefined: Self = StObject.set(x, "textToSpeech", js.undefined)
  }
}
