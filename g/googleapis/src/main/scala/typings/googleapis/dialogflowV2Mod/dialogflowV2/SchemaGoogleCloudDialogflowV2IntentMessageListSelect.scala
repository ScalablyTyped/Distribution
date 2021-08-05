package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card for presenting a list of options to select from.
  */
trait SchemaGoogleCloudDialogflowV2IntentMessageListSelect extends StObject {
  
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]] = js.undefined
  
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageListSelect {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageListSelect]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageListSelect](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
