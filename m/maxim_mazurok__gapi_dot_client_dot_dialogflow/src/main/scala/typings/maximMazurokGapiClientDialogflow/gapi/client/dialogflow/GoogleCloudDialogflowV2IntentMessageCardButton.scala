package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageCardButton extends StObject {
  
  /** Optional. The text to send back to the Dialogflow API or a URI to open. */
  var postback: js.UndefOr[String] = js.undefined
  
  /** Optional. The text to show on the button. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageCardButton {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCardButton]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageCardButtonMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
