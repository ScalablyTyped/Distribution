package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePrivateVisibilityConfig extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of VPC networks that can see this zone.
    */
  var networks: js.UndefOr[js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]] = js.undefined
}
object SchemaManagedZonePrivateVisibilityConfig {
  
  inline def apply(): SchemaManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfig]
  }
  
  extension [Self <: SchemaManagedZonePrivateVisibilityConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworks(value: js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    inline def setNetworksVarargs(value: SchemaManagedZonePrivateVisibilityConfigNetwork*): Self = StObject.set(x, "networks", js.Array(value*))
  }
}
