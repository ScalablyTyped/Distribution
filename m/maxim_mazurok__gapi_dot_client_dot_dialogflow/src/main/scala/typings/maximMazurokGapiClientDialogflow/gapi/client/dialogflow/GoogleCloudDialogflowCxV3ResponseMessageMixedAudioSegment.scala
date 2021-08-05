package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment extends StObject {
  
  /** Output only. Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.undefined
  
  /** Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request. */
  var audio: js.UndefOr[String] = js.undefined
  
  /** Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment {
  
  inline def apply(): GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ResponseMessageMixedAudioSegment](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
