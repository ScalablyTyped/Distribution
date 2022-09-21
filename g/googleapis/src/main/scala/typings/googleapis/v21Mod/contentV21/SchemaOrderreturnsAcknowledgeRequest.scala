package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderreturnsAcknowledgeRequest extends StObject {
  
  /**
    * [required] The ID of the operation, unique across all operations for a given order return.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderreturnsAcknowledgeRequest {
  
  inline def apply(): SchemaOrderreturnsAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderreturnsAcknowledgeRequest]
  }
  
  extension [Self <: SchemaOrderreturnsAcknowledgeRequest](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
