package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio extends StObject {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** Required. URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it. */
  var audioUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudioMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessagePlayAudio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
  }
}
