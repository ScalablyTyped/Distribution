package typings.googleapis.mybusinessbusinessinformationV1Mod.mybusinessbusinessinformationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceItem extends StObject {
  
  /**
    * Optional. This field will be set case of free-form services data.
    */
  var freeFormServiceItem: js.UndefOr[SchemaFreeFormServiceItem] = js.undefined
  
  /**
    * Optional. Represents the monetary price of the service item. We recommend that currency_code and units should be set when including a price. This will be treated as a fixed price for the service item.
    */
  var price: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Optional. This field will be set case of structured services data.
    */
  var structuredServiceItem: js.UndefOr[SchemaStructuredServiceItem] = js.undefined
}
object SchemaServiceItem {
  
  inline def apply(): SchemaServiceItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceItem]
  }
  
  extension [Self <: SchemaServiceItem](x: Self) {
    
    inline def setFreeFormServiceItem(value: SchemaFreeFormServiceItem): Self = StObject.set(x, "freeFormServiceItem", value.asInstanceOf[js.Any])
    
    inline def setFreeFormServiceItemUndefined: Self = StObject.set(x, "freeFormServiceItem", js.undefined)
    
    inline def setPrice(value: SchemaMoney): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setStructuredServiceItem(value: SchemaStructuredServiceItem): Self = StObject.set(x, "structuredServiceItem", value.asInstanceOf[js.Any])
    
    inline def setStructuredServiceItemUndefined: Self = StObject.set(x, "structuredServiceItem", js.undefined)
  }
}
