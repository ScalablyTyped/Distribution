package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends StObject {
  
  /**
    * The ID of the line item to return.
    */
  var lineItemId: js.UndefOr[String] = js.undefined
  
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.undefined
}
object SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  
  inline def apply(): SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
  
  extension [Self <: SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem](x: Self) {
    
    inline def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    inline def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
