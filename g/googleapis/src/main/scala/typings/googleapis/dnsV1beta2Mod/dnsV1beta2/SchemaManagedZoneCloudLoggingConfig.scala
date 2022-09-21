package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneCloudLoggingConfig extends StObject {
  
  /**
    * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
    */
  var enableLogging: js.UndefOr[Boolean | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZoneCloudLoggingConfig {
  
  inline def apply(): SchemaManagedZoneCloudLoggingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneCloudLoggingConfig]
  }
  
  extension [Self <: SchemaManagedZoneCloudLoggingConfig](x: Self) {
    
    inline def setEnableLogging(value: Boolean): Self = StObject.set(x, "enableLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableLoggingNull: Self = StObject.set(x, "enableLogging", null)
    
    inline def setEnableLoggingUndefined: Self = StObject.set(x, "enableLogging", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
