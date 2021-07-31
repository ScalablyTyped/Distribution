package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCancelRequest extends StObject {
  
  /**
    * The ID of the operation. Unique across all operations for a given order.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The explanation of the reason.
    */
  var reasonText: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCancelRequest {
  
  @scala.inline
  def apply(): SchemaOrdersCancelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersCancelRequestMutableBuilder[Self <: SchemaOrdersCancelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonText(value: String): Self = StObject.set(x, "reasonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonTextUndefined: Self = StObject.set(x, "reasonText", js.undefined)
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
