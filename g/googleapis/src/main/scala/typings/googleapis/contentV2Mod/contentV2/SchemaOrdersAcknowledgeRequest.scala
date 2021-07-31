package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersAcknowledgeRequest extends StObject {
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
}
object SchemaOrdersAcknowledgeRequest {
  
  @scala.inline
  def apply(): SchemaOrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersAcknowledgeRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersAcknowledgeRequestMutableBuilder[Self <: SchemaOrdersAcknowledgeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
