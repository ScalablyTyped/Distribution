package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageOutputAudioText extends StObject {
  
  /**
    * Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
    */
  var allowPlaybackInterruption: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml).
    */
  var ssml: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The raw text to be synthesized.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageOutputAudioText {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageOutputAudioText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageOutputAudioText]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageOutputAudioText](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionNull: Self = StObject.set(x, "allowPlaybackInterruption", null)
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    inline def setSsmlNull: Self = StObject.set(x, "ssml", null)
    
    inline def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
