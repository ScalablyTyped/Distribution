package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InTotoProvenance extends StObject {
  
  /** required */
  var builderConfig: js.UndefOr[BuilderConfig] = js.undefined
  
  /**
    * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless
    * metadata.completeness.materials is true. Unset or null is equivalent to empty.
    */
  var materials: js.UndefOr[js.Array[String]] = js.undefined
  
  var metadata: js.UndefOr[Metadata] = js.undefined
  
  /**
    * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit
    * identical output (if the build is reproducible). required
    */
  var recipe: js.UndefOr[Recipe] = js.undefined
}
object InTotoProvenance {
  
  inline def apply(): InTotoProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InTotoProvenance]
  }
  
  extension [Self <: InTotoProvenance](x: Self) {
    
    inline def setBuilderConfig(value: BuilderConfig): Self = StObject.set(x, "builderConfig", value.asInstanceOf[js.Any])
    
    inline def setBuilderConfigUndefined: Self = StObject.set(x, "builderConfig", js.undefined)
    
    inline def setMaterials(value: js.Array[String]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: String*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRecipe(value: Recipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
