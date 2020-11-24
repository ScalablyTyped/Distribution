package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessagePlayAudio extends js.Object {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** Required. URI of the audio clip. Dialogflow does not impose any validation on this value. It is specific to the client that reads it. */
  var audioUri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessagePlayAudio {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessagePlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessagePlayAudio]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessagePlayAudioOps[Self <: GoogleCloudDialogflowCxV3ResponseMessagePlayAudio] (val x: Self) extends AnyVal {
    
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
    def setAudioUri(value: String): Self = this.set("audioUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudioUri: Self = this.set("audioUri", js.undefined)
  }
}
