package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UndeleteAlertRequest extends StObject {
  
  /** Optional. The unique identifier of the G Suite organization account of the customer the alert is associated with. Inferred from the caller identity if not provided. */
  var customerId: js.UndefOr[String] = js.native
}
object UndeleteAlertRequest {
  
  @scala.inline
  def apply(): UndeleteAlertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteAlertRequest]
  }
  
  @scala.inline
  implicit class UndeleteAlertRequestMutableBuilder[Self <: UndeleteAlertRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
