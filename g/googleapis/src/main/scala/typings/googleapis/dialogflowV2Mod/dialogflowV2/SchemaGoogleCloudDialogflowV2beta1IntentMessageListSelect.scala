package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The card for presenting a list of options to select from.
  */
trait SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect extends StObject {
  
  /**
    * Required. List items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]] = js.undefined
  
  /**
    * Optional. The overall title of the list.
    */
  var title: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelect](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
