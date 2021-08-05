package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneForwardingConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var targetNameServers: js.UndefOr[js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]] = js.undefined
}
object SchemaManagedZoneForwardingConfig {
  
  inline def apply(): SchemaManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfig]
  }
  
  extension [Self <: SchemaManagedZoneForwardingConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNameServers(value: js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    inline def setTargetNameServersVarargs(value: SchemaManagedZoneForwardingConfigNameServerTarget*): Self = StObject.set(x, "targetNameServers", js.Array(value :_*))
  }
}
