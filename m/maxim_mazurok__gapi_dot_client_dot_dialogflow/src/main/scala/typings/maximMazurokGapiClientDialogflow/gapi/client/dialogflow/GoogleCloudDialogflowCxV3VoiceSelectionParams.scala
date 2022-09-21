package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3VoiceSelectionParams extends StObject {
  
  /**
    * Optional. The name of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and ssml_gender. For the list of available voices,
    * please refer to [Supported voices and languages](https://cloud.google.com/text-to-speech/docs/voices).
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The preferred gender of the voice. If not set, the service will choose a voice based on the other parameters such as language_code and name. Note that this is only a
    * preference, not requirement. If a voice of the appropriate gender is not available, the synthesizer substitutes a voice with a different gender rather than failing the request.
    */
  var ssmlGender: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3VoiceSelectionParams {
  
  inline def apply(): GoogleCloudDialogflowCxV3VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3VoiceSelectionParams]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3VoiceSelectionParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
