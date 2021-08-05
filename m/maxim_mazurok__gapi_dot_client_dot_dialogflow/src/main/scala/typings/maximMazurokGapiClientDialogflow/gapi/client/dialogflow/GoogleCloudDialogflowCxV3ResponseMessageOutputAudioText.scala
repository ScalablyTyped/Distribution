package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText extends StObject {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.undefined
  
  /** The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml). */
  var ssml: js.UndefOr[String] = js.undefined
  
  /** The raw text to be synthesized. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText {
  
  inline def apply(): GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
