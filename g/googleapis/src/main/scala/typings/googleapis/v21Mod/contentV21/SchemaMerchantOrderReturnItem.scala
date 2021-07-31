package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMerchantOrderReturnItem extends StObject {
  
  var customerReturnReason: js.UndefOr[SchemaCustomerReturnReason] = js.undefined
  
  var itemId: js.UndefOr[String] = js.undefined
  
  var merchantReturnReason: js.UndefOr[SchemaRefundReason] = js.undefined
  
  var product: js.UndefOr[SchemaOrderLineItemProduct] = js.undefined
  
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object SchemaMerchantOrderReturnItem {
  
  @scala.inline
  def apply(): SchemaMerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturnItem]
  }
  
  @scala.inline
  implicit class SchemaMerchantOrderReturnItemMutableBuilder[Self <: SchemaMerchantOrderReturnItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerReturnReason(value: SchemaCustomerReturnReason): Self = StObject.set(x, "customerReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerReturnReasonUndefined: Self = StObject.set(x, "customerReturnReason", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setMerchantReturnReason(value: SchemaRefundReason): Self = StObject.set(x, "merchantReturnReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantReturnReasonUndefined: Self = StObject.set(x, "merchantReturnReason", js.undefined)
    
    @scala.inline
    def setProduct(value: SchemaOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    @scala.inline
    def setReturnShipmentIds(value: js.Array[String]): Self = StObject.set(x, "returnShipmentIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnShipmentIdsUndefined: Self = StObject.set(x, "returnShipmentIds", js.undefined)
    
    @scala.inline
    def setReturnShipmentIdsVarargs(value: String*): Self = StObject.set(x, "returnShipmentIds", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
