package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard extends StObject {
  
  /** Optional. Settings for displaying the image. Applies to every image in items. */
  var imageDisplayOptions: js.UndefOr[String] = js.undefined
  
  /** Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten. */
  var items: js.UndefOr[
    js.Array[GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem]
  ] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageBrowseCarouselCard] (val x: Self) extends AnyVal {
    
    inline def setImageDisplayOptions(value: String): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    inline def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
