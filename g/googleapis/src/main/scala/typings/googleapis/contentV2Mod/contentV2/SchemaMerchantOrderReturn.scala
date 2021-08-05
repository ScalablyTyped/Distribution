package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMerchantOrderReturn extends StObject {
  
  var creationDate: js.UndefOr[String] = js.undefined
  
  var merchantOrderId: js.UndefOr[String] = js.undefined
  
  var orderId: js.UndefOr[String] = js.undefined
  
  var orderReturnId: js.UndefOr[String] = js.undefined
  
  var returnItems: js.UndefOr[js.Array[SchemaMerchantOrderReturnItem]] = js.undefined
  
  var returnShipments: js.UndefOr[js.Array[SchemaReturnShipment]] = js.undefined
}
object SchemaMerchantOrderReturn {
  
  inline def apply(): SchemaMerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturn]
  }
  
  extension [Self <: SchemaMerchantOrderReturn](x: Self) {
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    inline def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setOrderReturnId(value: String): Self = StObject.set(x, "orderReturnId", value.asInstanceOf[js.Any])
    
    inline def setOrderReturnIdUndefined: Self = StObject.set(x, "orderReturnId", js.undefined)
    
    inline def setReturnItems(value: js.Array[SchemaMerchantOrderReturnItem]): Self = StObject.set(x, "returnItems", value.asInstanceOf[js.Any])
    
    inline def setReturnItemsUndefined: Self = StObject.set(x, "returnItems", js.undefined)
    
    inline def setReturnItemsVarargs(value: SchemaMerchantOrderReturnItem*): Self = StObject.set(x, "returnItems", js.Array(value :_*))
    
    inline def setReturnShipments(value: js.Array[SchemaReturnShipment]): Self = StObject.set(x, "returnShipments", value.asInstanceOf[js.Any])
    
    inline def setReturnShipmentsUndefined: Self = StObject.set(x, "returnShipments", js.undefined)
    
    inline def setReturnShipmentsVarargs(value: SchemaReturnShipment*): Self = StObject.set(x, "returnShipments", js.Array(value :_*))
  }
}
