package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig extends StObject {
  
  /**
    * Configuration for logging requests made to this project to Stackdriver Logging
    */
  var requestLogging: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2RequestLogging] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2MonitoringConfig](x: Self) {
    
    inline def setRequestLogging(value: SchemaGoogleCloudIdentitytoolkitAdminV2RequestLogging): Self = StObject.set(x, "requestLogging", value.asInstanceOf[js.Any])
    
    inline def setRequestLoggingUndefined: Self = StObject.set(x, "requestLogging", js.undefined)
  }
}
