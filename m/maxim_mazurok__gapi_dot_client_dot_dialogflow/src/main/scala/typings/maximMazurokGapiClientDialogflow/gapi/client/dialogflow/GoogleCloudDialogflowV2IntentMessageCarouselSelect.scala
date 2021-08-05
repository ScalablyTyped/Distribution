package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageCarouselSelect extends StObject {
  
  /** Required. Carousel items. */
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageCarouselSelect {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageCarouselSelect](x: Self) {
    
    inline def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
