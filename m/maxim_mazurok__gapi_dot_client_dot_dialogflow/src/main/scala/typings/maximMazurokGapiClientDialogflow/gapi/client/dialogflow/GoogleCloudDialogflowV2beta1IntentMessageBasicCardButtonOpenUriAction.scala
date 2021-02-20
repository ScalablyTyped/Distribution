package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction extends StObject {
  
  /** Required. The HTTP or HTTPS scheme URI. */
  var uri: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriActionMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageBasicCardButtonOpenUriAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
