package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageTableCard extends StObject {
  
  /** Optional. List of buttons for the card. */
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.native
  
  /** Optional. Display properties for the columns in this table. */
  var columnProperties: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]] = js.native
  
  /** Optional. Image which should be displayed on the card. */
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.native
  
  /** Optional. Rows in this table of data. */
  var rows: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]] = js.native
  
  /** Optional. Subtitle to the title. */
  var subtitle: js.UndefOr[String] = js.native
  
  /** Required. Title of the card. */
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageTableCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageTableCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageTableCardMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageTableCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setColumnProperties(value: js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    @scala.inline
    def setColumnPropertiesVarargs(value: GoogleCloudDialogflowV2IntentMessageColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: GoogleCloudDialogflowV2IntentMessageTableCardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
