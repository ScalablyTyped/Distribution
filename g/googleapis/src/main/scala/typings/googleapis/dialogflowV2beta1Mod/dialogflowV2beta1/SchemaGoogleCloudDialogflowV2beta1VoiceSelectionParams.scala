package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of which voice to use for speech synthesis.
  */
trait SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams extends StObject {
  
  /**
    * Optional. The name of the voice. If not set, the service will choose a
    * voice based on the other parameters such as language_code and gender.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The preferred gender of the voice. If not set, the service will
    * choose a voice based on the other parameters such as language_code and
    * name. Note that this is only a preference, not requirement. If a voice of
    * the appropriate gender is not available, the synthesizer should
    * substitute a voice with a different gender rather than failing the
    * request.
    */
  var ssmlGender: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1VoiceSelectionParams](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSsmlGender(value: String): Self = StObject.set(x, "ssmlGender", value.asInstanceOf[js.Any])
    
    inline def setSsmlGenderUndefined: Self = StObject.set(x, "ssmlGender", js.undefined)
  }
}
