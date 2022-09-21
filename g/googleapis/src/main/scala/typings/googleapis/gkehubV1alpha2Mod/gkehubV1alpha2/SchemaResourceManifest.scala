package typings.googleapis.gkehubV1alpha2Mod.gkehubV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceManifest extends StObject {
  
  /**
    * Whether the resource provided in the manifest is `cluster_scoped`. If unset, the manifest is assumed to be namespace scoped. This field is used for REST mapping when applying the resource in a cluster.
    */
  var clusterScoped: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * YAML manifest of the resource.
    */
  var manifest: js.UndefOr[String | Null] = js.undefined
}
object SchemaResourceManifest {
  
  inline def apply(): SchemaResourceManifest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceManifest]
  }
  
  extension [Self <: SchemaResourceManifest](x: Self) {
    
    inline def setClusterScoped(value: Boolean): Self = StObject.set(x, "clusterScoped", value.asInstanceOf[js.Any])
    
    inline def setClusterScopedNull: Self = StObject.set(x, "clusterScoped", null)
    
    inline def setClusterScopedUndefined: Self = StObject.set(x, "clusterScoped", js.undefined)
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestNull: Self = StObject.set(x, "manifest", null)
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
