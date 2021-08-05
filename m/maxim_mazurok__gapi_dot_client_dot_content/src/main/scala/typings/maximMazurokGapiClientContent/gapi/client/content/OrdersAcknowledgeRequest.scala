package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersAcknowledgeRequest extends StObject {
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
}
object OrdersAcknowledgeRequest {
  
  inline def apply(): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
  
  extension [Self <: OrdersAcknowledgeRequest](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
