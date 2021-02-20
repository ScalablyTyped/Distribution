package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersAcknowledgeRequest extends StObject {
  
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.native
}
object OrdersAcknowledgeRequest {
  
  @scala.inline
  def apply(): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class OrdersAcknowledgeRequestMutableBuilder[Self <: OrdersAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
