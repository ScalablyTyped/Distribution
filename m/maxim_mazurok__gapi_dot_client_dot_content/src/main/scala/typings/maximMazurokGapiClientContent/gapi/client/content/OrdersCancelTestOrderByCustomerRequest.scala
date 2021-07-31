package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCancelTestOrderByCustomerRequest extends StObject {
  
  /** The reason for the cancellation. Acceptable values are: - "`changedMind`" - "`orderedWrongItem`" - "`other`" */
  var reason: js.UndefOr[String] = js.undefined
}
object OrdersCancelTestOrderByCustomerRequest {
  
  @scala.inline
  def apply(): OrdersCancelTestOrderByCustomerRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerRequest]
  }
  
  @scala.inline
  implicit class OrdersCancelTestOrderByCustomerRequestMutableBuilder[Self <: OrdersCancelTestOrderByCustomerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
