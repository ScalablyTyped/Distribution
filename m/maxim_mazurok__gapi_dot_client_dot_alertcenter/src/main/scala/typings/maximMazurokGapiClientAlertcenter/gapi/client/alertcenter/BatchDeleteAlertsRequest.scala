package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteAlertsRequest extends js.Object {
  
  /** Required. list of alert IDs. */
  var alertId: js.UndefOr[js.Array[String]] = js.native
  
  /** Optional. The unique identifier of the G Suite organization account of the customer the alerts are associated with. */
  var customerId: js.UndefOr[String] = js.native
}
object BatchDeleteAlertsRequest {
  
  @scala.inline
  def apply(): BatchDeleteAlertsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteAlertsRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteAlertsRequestOps[Self <: BatchDeleteAlertsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlertIdVarargs(value: String*): Self = this.set("alertId", js.Array(value :_*))
    
    @scala.inline
    def setAlertId(value: js.Array[String]): Self = this.set("alertId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlertId: Self = this.set("alertId", js.undefined)
    
    @scala.inline
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
  }
}
