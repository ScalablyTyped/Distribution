package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigCloudAuditOptions extends StObject {
  
  /** Information used by the Cloud Audit Logging pipeline. */
  var authorizationLoggingOptions: js.UndefOr[AuthorizationLoggingOptions] = js.undefined
  
  /** The log_name to populate in the Cloud Audit Record. */
  var logName: js.UndefOr[String] = js.undefined
}
object LogConfigCloudAuditOptions {
  
  inline def apply(): LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCloudAuditOptions]
  }
  
  extension [Self <: LogConfigCloudAuditOptions](x: Self) {
    
    inline def setAuthorizationLoggingOptions(value: AuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
