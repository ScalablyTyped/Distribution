package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsAcknowledgeRequest extends StObject {
  
  /** [required] The ID of the operation, unique across all operations for a given order return. */
  var operationId: js.UndefOr[String] = js.undefined
}
object OrderreturnsAcknowledgeRequest {
  
  @scala.inline
  def apply(): OrderreturnsAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class OrderreturnsAcknowledgeRequestMutableBuilder[Self <: OrderreturnsAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
