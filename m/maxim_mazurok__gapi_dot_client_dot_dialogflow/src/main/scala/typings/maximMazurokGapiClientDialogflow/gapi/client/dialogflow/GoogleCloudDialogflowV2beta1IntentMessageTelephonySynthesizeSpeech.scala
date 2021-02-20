package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech extends StObject {
  
  /** The SSML to be synthesized. For more information, see [SSML](https://developers.google.com/actions/reference/ssml). */
  var ssml: js.UndefOr[String] = js.native
  
  /** The raw text to be synthesized. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeechMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageTelephonySynthesizeSpeech] (val x: Self) extends AnyVal {
    
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
