package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment extends StObject {
  
  /** Output only. Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.undefined
  
  /** Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request. */
  var audio: js.UndefOr[String] = js.undefined
  
  /** Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it. */
  var uri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
