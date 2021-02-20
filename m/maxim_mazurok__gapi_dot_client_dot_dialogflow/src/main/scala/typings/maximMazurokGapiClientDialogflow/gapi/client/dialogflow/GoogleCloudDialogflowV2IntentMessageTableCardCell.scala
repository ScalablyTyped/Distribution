package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageTableCardCell extends StObject {
  
  /** Required. Text in this cell. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageTableCardCell {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageTableCardCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageTableCardCell]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageTableCardCellMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageTableCardCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
