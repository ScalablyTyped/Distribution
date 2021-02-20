package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton extends StObject {
  
  /** Required. Action to take when a user taps on the button. */
  var openUriAction: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] = js.native
  
  /** Required. The title of the button. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageBasicCardButton] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenUriAction(value: GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction): Self = StObject.set(x, "openUriAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUriActionUndefined: Self = StObject.set(x, "openUriAction", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
