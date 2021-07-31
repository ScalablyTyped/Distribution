package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCreateTestReturnRequest extends StObject {
  
  /** Returned items. */
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.undefined
}
object OrdersCreateTestReturnRequest {
  
  @scala.inline
  def apply(): OrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnRequest]
  }
  
  @scala.inline
  implicit class OrdersCreateTestReturnRequestMutableBuilder[Self <: OrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: OrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
