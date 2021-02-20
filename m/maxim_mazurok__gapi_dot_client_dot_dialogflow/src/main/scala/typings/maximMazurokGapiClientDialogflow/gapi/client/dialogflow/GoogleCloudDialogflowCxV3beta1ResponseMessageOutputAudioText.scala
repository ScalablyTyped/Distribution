package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText extends StObject {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.native
  
  /** The SSML text to be synthesized. For more information, see [SSML](/speech/text-to-speech/docs/ssml). */
  var ssml: js.UndefOr[String] = js.native
  
  /** The raw text to be synthesized. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioTextMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageOutputAudioText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setSsml(value: String): Self = StObject.set(x, "ssml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmlUndefined: Self = StObject.set(x, "ssml", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
