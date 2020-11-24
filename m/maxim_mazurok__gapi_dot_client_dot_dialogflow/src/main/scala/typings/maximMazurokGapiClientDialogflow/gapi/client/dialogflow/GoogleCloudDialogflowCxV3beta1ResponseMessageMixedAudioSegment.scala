package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment extends js.Object {
  
  /** Output only. Whether the playback of this segment can be interrupted by the end user's speech and the client should then start the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** Raw audio synthesized from the Dialogflow agent's response using the output config specified in the request. */
  var audio: js.UndefOr[String] = js.native
  
  /** Client-specific URI that points to an audio clip accessible to the client. Dialogflow does not impose any validation on it. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegmentOps[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageMixedAudioSegment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = this.set("allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPlaybackInterruption: Self = this.set("allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setAudio(value: String): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
