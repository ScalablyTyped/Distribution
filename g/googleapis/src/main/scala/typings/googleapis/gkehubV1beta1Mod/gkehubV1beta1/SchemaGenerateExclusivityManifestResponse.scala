package typings.googleapis.gkehubV1beta1Mod.gkehubV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateExclusivityManifestResponse extends StObject {
  
  /**
    * The YAML manifest of the membership CR to apply if a new version of the CR is available. Empty if no update needs to be applied.
    */
  var crManifest: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The YAML manifest of the membership CRD to apply if a newer version of the CRD is available. Empty if no update needs to be applied.
    */
  var crdManifest: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateExclusivityManifestResponse {
  
  inline def apply(): SchemaGenerateExclusivityManifestResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateExclusivityManifestResponse]
  }
  
  extension [Self <: SchemaGenerateExclusivityManifestResponse](x: Self) {
    
    inline def setCrManifest(value: String): Self = StObject.set(x, "crManifest", value.asInstanceOf[js.Any])
    
    inline def setCrManifestNull: Self = StObject.set(x, "crManifest", null)
    
    inline def setCrManifestUndefined: Self = StObject.set(x, "crManifest", js.undefined)
    
    inline def setCrdManifest(value: String): Self = StObject.set(x, "crdManifest", value.asInstanceOf[js.Any])
    
    inline def setCrdManifestNull: Self = StObject.set(x, "crdManifest", null)
    
    inline def setCrdManifestUndefined: Self = StObject.set(x, "crdManifest", js.undefined)
  }
}
