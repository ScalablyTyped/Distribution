package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageTableCard extends StObject {
  
  /** Optional. List of buttons for the card. */
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.undefined
  
  /** Optional. Display properties for the columns in this table. */
  var columnProperties: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]] = js.undefined
  
  /** Optional. Image which should be displayed on the card. */
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /** Optional. Rows in this table of data. */
  var rows: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]] = js.undefined
  
  /** Optional. Subtitle to the title. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** Required. Title of the card. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageTableCard {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageTableCard]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageTableCard](x: Self) {
    
    inline def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setColumnProperties(value: js.Array[GoogleCloudDialogflowV2IntentMessageColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    inline def setColumnPropertiesVarargs(value: GoogleCloudDialogflowV2IntentMessageColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value :_*))
    
    inline def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setRows(value: js.Array[GoogleCloudDialogflowV2IntentMessageTableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: GoogleCloudDialogflowV2IntentMessageTableCardRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
