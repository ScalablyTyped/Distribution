package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInTotoProvenance extends StObject {
  
  /**
    * required
    */
  var builderConfig: js.UndefOr[SchemaBuilderConfig] = js.undefined
  
  /**
    * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
    */
  var materials: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var metadata: js.UndefOr[SchemaMetadata] = js.undefined
  
  /**
    * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
    */
  var recipe: js.UndefOr[SchemaRecipe] = js.undefined
}
object SchemaInTotoProvenance {
  
  inline def apply(): SchemaInTotoProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInTotoProvenance]
  }
  
  extension [Self <: SchemaInTotoProvenance](x: Self) {
    
    inline def setBuilderConfig(value: SchemaBuilderConfig): Self = StObject.set(x, "builderConfig", value.asInstanceOf[js.Any])
    
    inline def setBuilderConfigUndefined: Self = StObject.set(x, "builderConfig", js.undefined)
    
    inline def setMaterials(value: js.Array[String]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsNull: Self = StObject.set(x, "materials", null)
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: String*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: SchemaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRecipe(value: SchemaRecipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
