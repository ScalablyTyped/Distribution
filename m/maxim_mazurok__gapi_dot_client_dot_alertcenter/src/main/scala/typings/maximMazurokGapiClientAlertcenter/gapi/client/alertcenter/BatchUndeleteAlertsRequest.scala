package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUndeleteAlertsRequest extends StObject {
  
  /** Required. list of alert IDs. */
  var alertId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The unique identifier of the Google Workspace organization account of the customer the alerts are associated with. */
  var customerId: js.UndefOr[String] = js.undefined
}
object BatchUndeleteAlertsRequest {
  
  inline def apply(): BatchUndeleteAlertsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUndeleteAlertsRequest]
  }
  
  extension [Self <: BatchUndeleteAlertsRequest](x: Self) {
    
    inline def setAlertId(value: js.Array[String]): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    inline def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    inline def setAlertIdVarargs(value: String*): Self = StObject.set(x, "alertId", js.Array(value*))
    
    inline def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    inline def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
