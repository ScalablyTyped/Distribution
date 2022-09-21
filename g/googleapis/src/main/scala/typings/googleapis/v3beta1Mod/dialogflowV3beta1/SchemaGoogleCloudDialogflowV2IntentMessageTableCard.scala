package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageTableCard extends StObject {
  
  /**
    * Optional. List of buttons for the card.
    */
  var buttons: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]] = js.undefined
  
  /**
    * Optional. Display properties for the columns in this table.
    */
  var columnProperties: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageColumnProperties]] = js.undefined
  
  /**
    * Optional. Image which should be displayed on the card.
    */
  var image: js.UndefOr[SchemaGoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  /**
    * Optional. Rows in this table of data.
    */
  var rows: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow]] = js.undefined
  
  /**
    * Optional. Subtitle to the title.
    */
  var subtitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Title of the card.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageTableCard {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageTableCard]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageTableCard](x: Self) {
    
    inline def setButtons(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageBasicCardButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setColumnProperties(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageColumnProperties]): Self = StObject.set(x, "columnProperties", value.asInstanceOf[js.Any])
    
    inline def setColumnPropertiesUndefined: Self = StObject.set(x, "columnProperties", js.undefined)
    
    inline def setColumnPropertiesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageColumnProperties*): Self = StObject.set(x, "columnProperties", js.Array(value*))
    
    inline def setImage(value: SchemaGoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setRows(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageTableCardRow*): Self = StObject.set(x, "rows", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleNull: Self = StObject.set(x, "subtitle", null)
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
