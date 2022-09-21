package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePrivateVisibilityConfigNetwork extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified URL of the VPC network to bind to. Format this URL like https://www.googleapis.com/compute/v1/projects/{project\}/global/networks/{network\}
    */
  var networkUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZonePrivateVisibilityConfigNetwork {
  
  inline def apply(): SchemaManagedZonePrivateVisibilityConfigNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfigNetwork]
  }
  
  extension [Self <: SchemaManagedZonePrivateVisibilityConfigNetwork](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    inline def setNetworkUrlNull: Self = StObject.set(x, "networkUrl", null)
    
    inline def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
