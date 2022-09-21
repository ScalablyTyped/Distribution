package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountAutomaticImprovements extends StObject {
  
  /**
    * This improvement will attempt to automatically correct submitted images if they don't meet the [image requirements](https://support.google.com/merchants/answer/6324350), for example, removing overlays. If successful, the image will be replaced and approved. This improvement is only applied to images of disapproved offers. For more information see: [Automatic image improvements](https://support.google.com/merchants/answer/9242973) This field is only updated (cleared) if provided.
    */
  var imageImprovements: js.UndefOr[SchemaAccountImageImprovements] = js.undefined
  
  /**
    * Turning on [item updates](https://support.google.com/merchants/answer/3246284) allows Google to automatically update items for you. When item updates are on, Google uses the structured data markup on the website and advanced data extractors to update the price and availability of the items. When the item updates are off, items with mismatched data aren't shown. This field is only updated (cleared) if provided.
    */
  var itemUpdates: js.UndefOr[SchemaAccountItemUpdates] = js.undefined
  
  /**
    * Not available for MCAs [accounts](https://support.google.com/merchants/answer/188487). By turning on [automatic shipping improvements](https://support.google.com/merchants/answer/10027038), you are allowing Google to improve the accuracy of your delivery times shown to shoppers using Google. More accurate delivery times, especially when faster, typically lead to better conversion rates. Google will improve your estimated delivery times based on various factors: - Delivery address of an order - Current handling time and shipping time settings - Estimated weekdays or business days - Parcel tracking data This field is only updated (cleared) if provided.
    */
  var shippingImprovements: js.UndefOr[SchemaAccountShippingImprovements] = js.undefined
}
object SchemaAccountAutomaticImprovements {
  
  inline def apply(): SchemaAccountAutomaticImprovements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountAutomaticImprovements]
  }
  
  extension [Self <: SchemaAccountAutomaticImprovements](x: Self) {
    
    inline def setImageImprovements(value: SchemaAccountImageImprovements): Self = StObject.set(x, "imageImprovements", value.asInstanceOf[js.Any])
    
    inline def setImageImprovementsUndefined: Self = StObject.set(x, "imageImprovements", js.undefined)
    
    inline def setItemUpdates(value: SchemaAccountItemUpdates): Self = StObject.set(x, "itemUpdates", value.asInstanceOf[js.Any])
    
    inline def setItemUpdatesUndefined: Self = StObject.set(x, "itemUpdates", js.undefined)
    
    inline def setShippingImprovements(value: SchemaAccountShippingImprovements): Self = StObject.set(x, "shippingImprovements", value.asInstanceOf[js.Any])
    
    inline def setShippingImprovementsUndefined: Self = StObject.set(x, "shippingImprovements", js.undefined)
  }
}
