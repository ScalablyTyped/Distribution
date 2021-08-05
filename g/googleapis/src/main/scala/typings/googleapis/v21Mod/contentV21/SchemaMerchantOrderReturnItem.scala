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
  
  inline def apply(): SchemaMerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturnItem]
  }
  
  extension [Self <: SchemaMerchantOrderReturnItem](x: Self) {
    
    inline def setCustomerReturnReason(value: SchemaCustomerReturnReason): Self = StObject.set(x, "customerReturnReason", value.asInstanceOf[js.Any])
    
    inline def setCustomerReturnReasonUndefined: Self = StObject.set(x, "customerReturnReason", js.undefined)
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setMerchantReturnReason(value: SchemaRefundReason): Self = StObject.set(x, "merchantReturnReason", value.asInstanceOf[js.Any])
    
    inline def setMerchantReturnReasonUndefined: Self = StObject.set(x, "merchantReturnReason", js.undefined)
    
    inline def setProduct(value: SchemaOrderLineItemProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setReturnShipmentIds(value: js.Array[String]): Self = StObject.set(x, "returnShipmentIds", value.asInstanceOf[js.Any])
    
    inline def setReturnShipmentIdsUndefined: Self = StObject.set(x, "returnShipmentIds", js.undefined)
    
    inline def setReturnShipmentIdsVarargs(value: String*): Self = StObject.set(x, "returnShipmentIds", js.Array(value :_*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
