package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends StObject {
  
  /**
    * The ID of the line item to return.
    */
  var lineItemId: js.UndefOr[String] = js.native
  
  /**
    * Quantity that is returned.
    */
  var quantity: js.UndefOr[Double] = js.native
}
object SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  
  @scala.inline
  def apply(): SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
  
  @scala.inline
  implicit class SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItemMutableBuilder[Self <: SchemaOrdersCustomBatchRequestEntryCreateTestReturnReturnItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLineItemId(value: String): Self = StObject.set(x, "lineItemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemIdUndefined: Self = StObject.set(x, "lineItemId", js.undefined)
    
    @scala.inline
    def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
