package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SupportTicketResponse extends StObject {
  
  var error: js.UndefOr[String] = js.native
  
  var statusCode: Double = js.native
}
object SupportTicketResponse {
  
  @scala.inline
  def apply(statusCode: Double): SupportTicketResponse = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportTicketResponse]
  }
  
  @scala.inline
  implicit class SupportTicketResponseMutableBuilder[Self <: SupportTicketResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
  }
}
