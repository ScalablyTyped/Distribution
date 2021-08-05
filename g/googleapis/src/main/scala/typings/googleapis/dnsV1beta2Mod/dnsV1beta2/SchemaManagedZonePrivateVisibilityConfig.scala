package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePrivateVisibilityConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var networks: js.UndefOr[js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]] = js.undefined
}
object SchemaManagedZonePrivateVisibilityConfig {
  
  inline def apply(): SchemaManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfig]
  }
  
  extension [Self <: SchemaManagedZonePrivateVisibilityConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaManagedZonePrivateVisibilityConfigNetwork*): Self = StObject.set(x, "networks", js.Array(value :_*))
  }
}
