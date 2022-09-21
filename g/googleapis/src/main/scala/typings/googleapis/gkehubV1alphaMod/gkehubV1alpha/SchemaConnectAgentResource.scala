package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConnectAgentResource extends StObject {
  
  /**
    * YAML manifest of the resource.
    */
  var manifest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Kubernetes type of the resource.
    */
  var `type`: js.UndefOr[SchemaTypeMeta] = js.undefined
}
object SchemaConnectAgentResource {
  
  inline def apply(): SchemaConnectAgentResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConnectAgentResource]
  }
  
  extension [Self <: SchemaConnectAgentResource](x: Self) {
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
    
    inline def setType(value: SchemaTypeMeta): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
