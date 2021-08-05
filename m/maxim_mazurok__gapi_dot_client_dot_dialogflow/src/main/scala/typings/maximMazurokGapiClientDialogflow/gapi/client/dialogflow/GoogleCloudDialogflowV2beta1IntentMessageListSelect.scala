package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageListSelect extends StObject {
  
  /** Required. List items. */
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageListSelectItem]] = js.undefined
  
  /** Optional. Subtitle of the list. */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /** Optional. The overall title of the list. */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageListSelect {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageListSelect]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageListSelect](x: Self) {
    
    inline def setItems(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageListSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageListSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
