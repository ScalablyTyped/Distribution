package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageBasicCardButton extends StObject {
  
  /** Required. Action to take when a user taps on the button. */
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction] = js.undefined
  
  /** Required. The title of the button. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageBasicCardButton {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBasicCardButton]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageBasicCardButtonMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUriAction(value: GoogleCloudDialogflowV2IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
