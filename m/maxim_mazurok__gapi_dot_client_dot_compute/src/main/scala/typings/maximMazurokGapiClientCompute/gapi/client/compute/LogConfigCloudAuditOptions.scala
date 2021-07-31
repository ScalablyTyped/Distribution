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
  
  @scala.inline
  def apply(): LogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigCloudAuditOptions]
  }
  
  @scala.inline
  implicit class LogConfigCloudAuditOptionsMutableBuilder[Self <: LogConfigCloudAuditOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationLoggingOptions(value: AuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    @scala.inline
    def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
