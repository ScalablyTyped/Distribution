package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMerchantOrderReturnItem extends StObject {
  
  /**
    * The reason that the customer chooses to return an item.
    */
  var customerReturnReason: js.UndefOr[SchemaCustomerReturnReason] = js.undefined
  
  /**
    * Product level item ID. If the returned items are of the same product, they will have the same ID.
    */
  var itemId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason that merchant chooses to accept a return item.
    */
  var merchantReturnReason: js.UndefOr[SchemaRefundReason] = js.undefined
  
  /**
    * Product data from the time of the order placement.
    */
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.undefined
  
  /**
    * IDs of the return shipments that this return item belongs to.
    */
  var returnShipmentIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * State of the item. Acceptable values are: - "`canceled`" - "`new`" - "`received`" - "`refunded`" - "`rejected`"
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaMerchantOrderReturnItem {
  
  inline def apply(): SchemaMerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturnItem]
  }
  
  extension [Self <: SchemaMerchantOrderReturnItem](x: Self) {
    
    inline def setCustomerReturnReason(value: SchemaCustomerReturnReason): Self = StObject.set(x, "customerReturnReason", value.asInstanceOf[js.Any])
    
    inline def setCustomerReturnReasonUndefined: Self = StObject.set(x, "customerReturnReason", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdNull: Self = StObject.set(x, "itemId", null)
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setMerchantReturnReason(value: SchemaRefundReason): Self = StObject.set(x, "merchantReturnReason", value.asInstanceOf[js.Any])
    
    inline def setMerchantReturnReasonUndefined: Self = StObject.set(x, "merchantReturnReason", js.undefined)
    
    inline def setProduct(value: SchemaOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setReturnShipmentIds(value: js.Array[String]): Self = StObject.set(x, "returnShipmentIds", value.asInstanceOf[js.Any])
    
    inline def setReturnShipmentIdsNull: Self = StObject.set(x, "returnShipmentIds", null)
    
    inline def setReturnShipmentIdsUndefined: Self = StObject.set(x, "returnShipmentIds", js.undefined)
    
    inline def setReturnShipmentIdsVarargs(value: String*): Self = StObject.set(x, "returnShipmentIds", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
