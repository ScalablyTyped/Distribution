package typings.googleapis.deploymentmanagerAlphaMod.deploymentmanagerAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Write a Cloud Audit log
  */
trait SchemaLogConfigCloudAuditOptions extends StObject {
  
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.undefined
  
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String] = js.undefined
}
object SchemaLogConfigCloudAuditOptions {
  
  inline def apply(): SchemaLogConfigCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogConfigCloudAuditOptions]
  }
  
  extension [Self <: SchemaLogConfigCloudAuditOptions](x: Self) {
    
    inline def setAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
