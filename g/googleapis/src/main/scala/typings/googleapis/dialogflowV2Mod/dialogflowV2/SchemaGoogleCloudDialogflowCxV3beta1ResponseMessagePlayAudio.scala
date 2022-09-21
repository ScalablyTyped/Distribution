package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio extends StObject {
  
  /**
    * Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request.
    */
  var allowPlaybackInterruption: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it.
    */
  var audioUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionNull: Self = StObject.set(x, "allowPlaybackInterruption", null)
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
    
    inline def setAudioUriNull: Self = StObject.set(x, "audioUri", null)
    
    inline def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
  }
}
