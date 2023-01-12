package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCreateTestReturnRequest extends StObject {
  
  /** Returned items. */
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.undefined
}
object OrdersCreateTestReturnRequest {
  
  inline def apply(): OrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersCreateTestReturnRequest] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: OrdersCustomBatchRequestEntryCreateTestReturnReturnItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
