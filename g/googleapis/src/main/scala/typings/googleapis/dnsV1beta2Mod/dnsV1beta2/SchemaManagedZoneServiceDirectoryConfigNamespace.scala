package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneServiceDirectoryConfigNamespace extends StObject {
  
  /**
    * The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
    */
  var deletionTime: js.UndefOr[String | Null] = js.undefined
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project\}/locations/{location\}/namespaces/{namespace\}
    */
  var namespaceUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaManagedZoneServiceDirectoryConfigNamespace {
  
  inline def apply(): SchemaManagedZoneServiceDirectoryConfigNamespace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneServiceDirectoryConfigNamespace]
  }
  
  extension [Self <: SchemaManagedZoneServiceDirectoryConfigNamespace](x: Self) {
    
    inline def setDeletionTime(value: String): Self = StObject.set(x, "deletionTime", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimeNull: Self = StObject.set(x, "deletionTime", null)
    
    inline def setDeletionTimeUndefined: Self = StObject.set(x, "deletionTime", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNamespaceUrl(value: String): Self = StObject.set(x, "namespaceUrl", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUrlNull: Self = StObject.set(x, "namespaceUrl", null)
    
    inline def setNamespaceUrlUndefined: Self = StObject.set(x, "namespaceUrl", js.undefined)
  }
}
