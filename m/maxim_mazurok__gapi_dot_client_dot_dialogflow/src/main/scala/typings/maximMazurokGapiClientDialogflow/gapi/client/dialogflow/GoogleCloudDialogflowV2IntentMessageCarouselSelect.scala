package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageCarouselSelect extends StObject {
  
  /** Required. Carousel items. */
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageCarouselSelect {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageCarouselSelectMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageCarouselSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
