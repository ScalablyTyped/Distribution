package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersCancelTestOrderByCustomerRequest extends StObject {
  
  /**
    * The reason for the cancellation.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object SchemaOrdersCancelTestOrderByCustomerRequest {
  
  @scala.inline
  def apply(): SchemaOrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersCancelTestOrderByCustomerRequest]
  }
  
  @scala.inline
  implicit class SchemaOrdersCancelTestOrderByCustomerRequestMutableBuilder[Self <: SchemaOrdersCancelTestOrderByCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
