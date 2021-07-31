package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUndeleteAlertsRequest extends StObject {
  
  /** Required. list of alert IDs. */
  var alertId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The unique identifier of the G Suite organization account of the customer the alerts are associated with. */
  var customerId: js.UndefOr[String] = js.undefined
}
object BatchUndeleteAlertsRequest {
  
  @scala.inline
  def apply(): BatchUndeleteAlertsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUndeleteAlertsRequest]
  }
  
  @scala.inline
  implicit class BatchUndeleteAlertsRequestMutableBuilder[Self <: BatchUndeleteAlertsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlertId(value: js.Array[String]): Self = StObject.set(x, "alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlertIdUndefined: Self = StObject.set(x, "alertId", js.undefined)
    
    @scala.inline
    def setAlertIdVarargs(value: String*): Self = StObject.set(x, "alertId", js.Array(value :_*))
    
    @scala.inline
    def setCustomerId(value: String): Self = StObject.set(x, "customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerIdUndefined: Self = StObject.set(x, "customerId", js.undefined)
  }
}
