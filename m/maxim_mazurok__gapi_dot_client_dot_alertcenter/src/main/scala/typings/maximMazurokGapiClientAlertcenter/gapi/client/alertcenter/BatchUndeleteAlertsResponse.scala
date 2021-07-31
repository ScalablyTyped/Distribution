package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUndeleteAlertsResponse extends StObject {
  
  /** The status details for each failed alert_id. */
  var failedAlertStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status}
    */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.BatchUndeleteAlertsResponse & TopLevel[js.Any]
  ] = js.undefined
  
  /** The successful list of alert IDs. */
  var successAlertIds: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchUndeleteAlertsResponse {
  
  @scala.inline
  def apply(): BatchUndeleteAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUndeleteAlertsResponse]
  }
  
  @scala.inline
  implicit class BatchUndeleteAlertsResponseMutableBuilder[Self <: BatchUndeleteAlertsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedAlertStatus(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status}
      */ typings.maximMazurokGapiClientAlertcenter.maximMazurokGapiClientAlertcenterStrings.BatchUndeleteAlertsResponse & TopLevel[js.Any]
    ): Self = StObject.set(x, "failedAlertStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedAlertStatusUndefined: Self = StObject.set(x, "failedAlertStatus", js.undefined)
    
    @scala.inline
    def setSuccessAlertIds(value: js.Array[String]): Self = StObject.set(x, "successAlertIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessAlertIdsUndefined: Self = StObject.set(x, "successAlertIds", js.undefined)
    
    @scala.inline
    def setSuccessAlertIdsVarargs(value: String*): Self = StObject.set(x, "successAlertIds", js.Array(value :_*))
  }
}
