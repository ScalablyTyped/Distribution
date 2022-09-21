package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLoggingSettings extends StObject {
  
  /** Indicates whether audit logging is on/off for admin activity read APIs i.e. Get/List DataSources, Get/List SearchApplications etc. */
  var logAdminReadActions: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether audit logging is on/off for data access read APIs i.e. ListItems, GetItem etc. */
  var logDataReadActions: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether audit logging is on/off for data access write APIs i.e. IndexItem etc. */
  var logDataWriteActions: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource name of the GCP Project to store audit logs. Cloud audit logging will be enabled after project_name has been updated through CustomerService. Format:
    * projects/{project_id}
    */
  var project: js.UndefOr[String] = js.undefined
}
object AuditLoggingSettings {
  
  inline def apply(): AuditLoggingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditLoggingSettings]
  }
  
  extension [Self <: AuditLoggingSettings](x: Self) {
    
    inline def setLogAdminReadActions(value: Boolean): Self = StObject.set(x, "logAdminReadActions", value.asInstanceOf[js.Any])
    
    inline def setLogAdminReadActionsUndefined: Self = StObject.set(x, "logAdminReadActions", js.undefined)
    
    inline def setLogDataReadActions(value: Boolean): Self = StObject.set(x, "logDataReadActions", value.asInstanceOf[js.Any])
    
    inline def setLogDataReadActionsUndefined: Self = StObject.set(x, "logDataReadActions", js.undefined)
    
    inline def setLogDataWriteActions(value: Boolean): Self = StObject.set(x, "logDataWriteActions", value.asInstanceOf[js.Any])
    
    inline def setLogDataWriteActionsUndefined: Self = StObject.set(x, "logDataWriteActions", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
