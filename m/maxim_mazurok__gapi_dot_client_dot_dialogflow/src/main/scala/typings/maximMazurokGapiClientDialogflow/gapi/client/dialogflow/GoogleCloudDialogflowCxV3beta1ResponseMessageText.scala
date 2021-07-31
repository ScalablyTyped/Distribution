package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1ResponseMessageText extends StObject {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.undefined
  
  /** Required. A collection of text responses. */
  var text: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1ResponseMessageText {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowCxV3beta1ResponseMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1ResponseMessageText]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowCxV3beta1ResponseMessageTextMutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1ResponseMessageText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    @scala.inline
    def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
