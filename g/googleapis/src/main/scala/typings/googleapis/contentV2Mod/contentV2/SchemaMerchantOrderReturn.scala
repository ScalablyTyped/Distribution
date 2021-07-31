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
  
  @scala.inline
  def apply(): SchemaMerchantOrderReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMerchantOrderReturn]
  }
  
  @scala.inline
  implicit class SchemaMerchantOrderReturnMutableBuilder[Self <: SchemaMerchantOrderReturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setOrderReturnId(value: String): Self = StObject.set(x, "orderReturnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderReturnIdUndefined: Self = StObject.set(x, "orderReturnId", js.undefined)
    
    @scala.inline
    def setReturnItems(value: js.Array[SchemaMerchantOrderReturnItem]): Self = StObject.set(x, "returnItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnItemsUndefined: Self = StObject.set(x, "returnItems", js.undefined)
    
    @scala.inline
    def setReturnItemsVarargs(value: SchemaMerchantOrderReturnItem*): Self = StObject.set(x, "returnItems", js.Array(value :_*))
    
    @scala.inline
    def setReturnShipments(value: js.Array[SchemaReturnShipment]): Self = StObject.set(x, "returnShipments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnShipmentsUndefined: Self = StObject.set(x, "returnShipments", js.undefined)
    
    @scala.inline
    def setReturnShipmentsVarargs(value: SchemaReturnShipment*): Self = StObject.set(x, "returnShipments", js.Array(value :_*))
  }
}
