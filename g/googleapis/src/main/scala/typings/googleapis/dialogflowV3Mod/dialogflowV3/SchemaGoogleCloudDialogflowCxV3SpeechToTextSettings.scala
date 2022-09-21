package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings extends StObject {
  
  /**
    * Whether to use speech adaptation for speech recognition.
    */
  var enableSpeechAdaptation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3SpeechToTextSettings](x: Self) {
    
    inline def setEnableSpeechAdaptation(value: Boolean): Self = StObject.set(x, "enableSpeechAdaptation", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeechAdaptationNull: Self = StObject.set(x, "enableSpeechAdaptation", null)
    
    inline def setEnableSpeechAdaptationUndefined: Self = StObject.set(x, "enableSpeechAdaptation", js.undefined)
  }
}
