package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchDeleteAlertsResponse extends js.Object {
  
  /** The status details for each failed alert_id. */
  var failedAlertStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status}
    */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.BatchDeleteAlertsResponse with TopLevel[js.Any]
  ] = js.native
  
  /** The successful list of alert IDs. */
  var successAlertIds: js.UndefOr[js.Array[String]] = js.native
}
object BatchDeleteAlertsResponse {
  
  @scala.inline
  def apply(): BatchDeleteAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteAlertsResponse]
  }
  
  @scala.inline
  implicit class BatchDeleteAlertsResponseOps[Self <: BatchDeleteAlertsResponse] (val x: Self) extends AnyVal {
    
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
    def setFailedAlertStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status}
      */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.BatchDeleteAlertsResponse with TopLevel[js.Any]
    ): Self = this.set("failedAlertStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedAlertStatus: Self = this.set("failedAlertStatus", js.undefined)
    
    @scala.inline
    def setSuccessAlertIdsVarargs(value: String*): Self = this.set("successAlertIds", js.Array(value :_*))
    
    @scala.inline
    def setSuccessAlertIds(value: js.Array[String]): Self = this.set("successAlertIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessAlertIds: Self = this.set("successAlertIds", js.undefined)
  }
}
