package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1SpeechToTextSettings extends StObject {
  
  /**
    * Whether to use speech adaptation for speech recognition.
    */
  var enableSpeechAdaptation: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1SpeechToTextSettings {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1SpeechToTextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1SpeechToTextSettings]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1SpeechToTextSettings](x: Self) {
    
    inline def setEnableSpeechAdaptation(value: Boolean): Self = StObject.set(x, "enableSpeechAdaptation", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeechAdaptationNull: Self = StObject.set(x, "enableSpeechAdaptation", null)
    
    inline def setEnableSpeechAdaptationUndefined: Self = StObject.set(x, "enableSpeechAdaptation", js.undefined)
  }
}
