package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect extends StObject {
  
  /** Required. Carousel items. */
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageCarouselSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
