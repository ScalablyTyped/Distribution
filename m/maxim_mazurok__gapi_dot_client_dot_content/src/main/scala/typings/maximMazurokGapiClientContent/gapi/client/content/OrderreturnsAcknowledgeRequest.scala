package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsAcknowledgeRequest extends StObject {
  
  /** [required] The ID of the operation, unique across all operations for a given order return. */
  var operationId: js.UndefOr[String] = js.undefined
}
object OrderreturnsAcknowledgeRequest {
  
  inline def apply(): OrderreturnsAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsAcknowledgeRequest]
  }
  
  extension [Self <: OrderreturnsAcknowledgeRequest](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
