package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersUpdateMerchantOrderIdRequest extends StObject {
  
  /** The merchant order id to be assigned to the order. Must be unique per merchant. */
  var merchantOrderId: js.UndefOr[String] = js.native
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
}
object OrdersUpdateMerchantOrderIdRequest {
  
  @scala.inline
  def apply(): OrdersUpdateMerchantOrderIdRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersUpdateMerchantOrderIdRequest]
  }
  
  @scala.inline
  implicit class OrdersUpdateMerchantOrderIdRequestMutableBuilder[Self <: OrdersUpdateMerchantOrderIdRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMerchantOrderId(value: String): Self = StObject.set(x, "merchantOrderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantOrderIdUndefined: Self = StObject.set(x, "merchantOrderId", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
