package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ResponseMessageText extends StObject {
  
  /** Output only. Whether the playback of this message can be interrupted by the end user's speech and the client can then starts the next Dialogflow request. */
  var allowPlaybackInterruption: js.UndefOr[Boolean] = js.undefined
  
  /** Required. A collection of text responses. */
  var text: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowCxV3ResponseMessageText {
  
  inline def apply(): GoogleCloudDialogflowCxV3ResponseMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ResponseMessageText]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ResponseMessageText](x: Self) {
    
    inline def setAllowPlaybackInterruption(value: Boolean): Self = StObject.set(x, "allowPlaybackInterruption", value.asInstanceOf[js.Any])
    
    inline def setAllowPlaybackInterruptionUndefined: Self = StObject.set(x, "allowPlaybackInterruption", js.undefined)
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
