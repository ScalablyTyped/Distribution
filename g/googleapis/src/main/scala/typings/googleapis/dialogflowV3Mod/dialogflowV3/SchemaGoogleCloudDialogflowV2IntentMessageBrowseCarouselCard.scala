package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard extends StObject {
  
  /**
    * Optional. Settings for displaying the image. Applies to every image in items.
    */
  var imageDisplayOptions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. List of items in the Browse Carousel Card. Minimum of two items, maximum of ten.
    */
  var items: js.UndefOr[
    js.Array[
      SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem
    ]
  ] = js.undefined
}
object SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCard](x: Self) {
    
    inline def setImageDisplayOptions(value: String): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptionsNull: Self = StObject.set(x, "imageDisplayOptions", null)
    
    inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    inline def setItems(
      value: js.Array[
          SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem
        ]
    ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessageBrowseCarouselCardBrowseCarouselCardItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
