package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageText extends StObject {
  
  /** Optional. The collection of the agent's responses. */
  var text: js.UndefOr[js.Array[String]] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageText {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageText]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageTextMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}
