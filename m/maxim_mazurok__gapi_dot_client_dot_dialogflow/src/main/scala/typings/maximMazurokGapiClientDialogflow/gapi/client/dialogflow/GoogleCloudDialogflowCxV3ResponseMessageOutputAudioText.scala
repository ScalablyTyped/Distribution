package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText extends js.Object {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml). */
  var ssml: js.UndefOr[String] = js.native
  
  /** The raw text to be synthesized. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3ResponseMessageOutputAudioTextOps[Self <: GoogleCloudDialogflowCxV3ResponseMessageOutputAudioText] (val x: Self) extends AnyVal {
    
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
    def setSsml(value: String): Self = this.set("ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsml: Self = this.set("ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
}
