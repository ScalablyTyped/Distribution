package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment extends StObject {
  
  /**
    * Output only. Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request.
    */
  var allowPlaybackInterruption: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request.
    */
  var audio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionNull: Self = StObject.set(x, "allowPlaybackInterruption", null)
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
