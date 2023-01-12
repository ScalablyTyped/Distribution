package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UndeleteAlertRequest extends StObject {
  
  /** Optional. The unique identifier of the Google Workspace organization account of the customer the alert is associated with. Inferred from the caller identity if not provided. */
  var customerId: js.UndefOr[String] = js.undefined
}
object UndeleteAlertRequest {
  
  inline def apply(): UndeleteAlertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UndeleteAlertRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UndeleteAlertRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
