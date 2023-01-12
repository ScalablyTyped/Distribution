package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3SpeechToTextSettings extends StObject {
  
  /** Whether to use speech adaptation for speech recognition. */
  var enableSpeechAdaptation: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3SpeechToTextSettings {
  
  inline def apply(): GoogleCloudDialogflowCxV3SpeechToTextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3SpeechToTextSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3SpeechToTextSettings] (val x: Self) extends AnyVal {
    
    inline def setEnableSpeechAdaptation(value: Boolean): Self = StObject.set(x, "enableSpeechAdaptation", value.asInstanceOf[js.Any])
    
    inline def setEnableSpeechAdaptationUndefined: Self = StObject.set(x, "enableSpeechAdaptation", js.undefined)
  }
}
