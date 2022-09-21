package typings.googleapis.gameservicesV1betaMod.gameservicesV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudAuditOptions extends StObject {
  
  /**
    * Information used by the Cloud Audit Logging pipeline.
    */
  var authorizationLoggingOptions: js.UndefOr[SchemaAuthorizationLoggingOptions] = js.undefined
  
  /**
    * The log_name to populate in the Cloud Audit Record.
    */
  var logName: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudAuditOptions {
  
  inline def apply(): SchemaCloudAuditOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudAuditOptions]
  }
  
  extension [Self <: SchemaCloudAuditOptions](x: Self) {
    
    inline def setAuthorizationLoggingOptions(value: SchemaAuthorizationLoggingOptions): Self = StObject.set(x, "authorizationLoggingOptions", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationLoggingOptionsUndefined: Self = StObject.set(x, "authorizationLoggingOptions", js.undefined)
    
    inline def setLogName(value: String): Self = StObject.set(x, "logName", value.asInstanceOf[js.Any])
    
    inline def setLogNameNull: Self = StObject.set(x, "logName", null)
    
    inline def setLogNameUndefined: Self = StObject.set(x, "logName", js.undefined)
  }
}
