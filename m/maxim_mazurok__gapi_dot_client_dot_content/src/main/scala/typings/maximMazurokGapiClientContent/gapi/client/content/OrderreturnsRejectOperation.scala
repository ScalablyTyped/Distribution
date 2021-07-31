package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsRejectOperation extends StObject {
  
  /** The reason for the return. */
  var reason: js.UndefOr[String] = js.undefined
  
  /** The explanation of the reason. */
  var reasonText: js.UndefOr[String] = js.undefined
}
object OrderreturnsRejectOperation {
  
  @scala.inline
  def apply(): OrderreturnsRejectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsRejectOperation]
  }
  
  @scala.inline
  implicit class OrderreturnsRejectOperationMutableBuilder[Self <: OrderreturnsRejectOperation] (val x: Self) extends AnyVal {
    
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
