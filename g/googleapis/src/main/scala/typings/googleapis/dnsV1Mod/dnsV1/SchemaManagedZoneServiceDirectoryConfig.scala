package typings.googleapis.dnsV1Mod.dnsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneServiceDirectoryConfig extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Contains information about the namespace associated with the zone.
    */
  var namespace: js.UndefOr[SchemaManagedZoneServiceDirectoryConfigNamespace] = js.undefined
}
object SchemaManagedZoneServiceDirectoryConfig {
  
  inline def apply(): SchemaManagedZoneServiceDirectoryConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneServiceDirectoryConfig]
  }
  
  extension [Self <: SchemaManagedZoneServiceDirectoryConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNamespace(value: SchemaManagedZoneServiceDirectoryConfigNamespace): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
