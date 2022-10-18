package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUndeleteAlertsResponse extends StObject {
  
  /** The status details for each failed alert_id. */
  var failedAlertStatus: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status} */ js.Any
  ] = js.undefined
  
  /** The successful list of alert IDs. */
  var successAlertIds: js.UndefOr[js.Array[String]] = js.undefined
}
object BatchUndeleteAlertsResponse {
  
  inline def apply(): BatchUndeleteAlertsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUndeleteAlertsResponse]
  }
  
  extension [Self <: BatchUndeleteAlertsResponse](x: Self) {
    
    inline def setFailedAlertStatus(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: @maxim_mazurok/gapi.client.alertcenter.gapi.client.alertcenter.Status} */ js.Any
    ): Self = StObject.set(x, "failedAlertStatus", value.asInstanceOf[js.Any])
    
    inline def setFailedAlertStatusUndefined: Self = StObject.set(x, "failedAlertStatus", js.undefined)
    
    inline def setSuccessAlertIds(value: js.Array[String]): Self = StObject.set(x, "successAlertIds", value.asInstanceOf[js.Any])
    
    inline def setSuccessAlertIdsUndefined: Self = StObject.set(x, "successAlertIds", js.undefined)
    
    inline def setSuccessAlertIdsVarargs(value: String*): Self = StObject.set(x, "successAlertIds", js.Array(value*))
  }
}
