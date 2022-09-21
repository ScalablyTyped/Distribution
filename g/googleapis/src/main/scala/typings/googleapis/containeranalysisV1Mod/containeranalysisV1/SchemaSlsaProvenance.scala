package typings.googleapis.containeranalysisV1Mod.containeranalysisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlsaProvenance extends StObject {
  
  /**
    * required
    */
  var builder: js.UndefOr[SchemaSlsaBuilder] = js.undefined
  
  /**
    * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
    */
  var materials: js.UndefOr[js.Array[SchemaMaterial]] = js.undefined
  
  var metadata: js.UndefOr[SchemaSlsaMetadata] = js.undefined
  
  /**
    * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible). required
    */
  var recipe: js.UndefOr[SchemaSlsaRecipe] = js.undefined
}
object SchemaSlsaProvenance {
  
  inline def apply(): SchemaSlsaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlsaProvenance]
  }
  
  extension [Self <: SchemaSlsaProvenance](x: Self) {
    
    inline def setBuilder(value: SchemaSlsaBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
    
    inline def setMaterials(value: js.Array[SchemaMaterial]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: SchemaMaterial*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: SchemaSlsaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRecipe(value: SchemaSlsaRecipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
