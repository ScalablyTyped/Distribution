package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse extends StObject {
  
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
object SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageSimpleResponse](x: Self) {
    
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
