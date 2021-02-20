package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageColumnProperties extends StObject {
  
  /** Required. Column heading. */
  var header: js.UndefOr[String] = js.native
  
  /** Optional. Defines text alignment for all cells in this column. */
  var horizontalAlignment: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageColumnProperties {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageColumnProperties]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageColumnPropertiesMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: String): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
