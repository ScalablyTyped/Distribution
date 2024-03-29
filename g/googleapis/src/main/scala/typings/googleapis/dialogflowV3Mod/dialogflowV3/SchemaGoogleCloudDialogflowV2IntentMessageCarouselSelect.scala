package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect extends StObject {
  
  /**
    * Required. Carousel items.
    */
  var items: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelect](x: Self) {
    
    inline def setItems(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
