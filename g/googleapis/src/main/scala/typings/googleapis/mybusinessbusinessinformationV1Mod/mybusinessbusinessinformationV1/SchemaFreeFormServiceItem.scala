package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFreeFormServiceItem extends StObject {
  
  /**
    * Required. This field represents the category name (i.e. the category's stable ID). The `category` and `service_type_id` should match the possible combinations provided in the `Category` message.
    */
  var category: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Language-tagged labels for the item. We recommend that item names be 140 characters or less, and descriptions 250 characters or less. This field should only be set if the input is a custom service item. Standardized service types should be updated via service_type_id.
    */
  var label: js.UndefOr[SchemaLabel] = js.undefined
}
object SchemaFreeFormServiceItem {
  
  inline def apply(): SchemaFreeFormServiceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFreeFormServiceItem]
  }
  
  extension [Self <: SchemaFreeFormServiceItem](x: Self) {
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryNull: Self = StObject.set(x, "category", null)
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setLabel(value: SchemaLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
  }
}
