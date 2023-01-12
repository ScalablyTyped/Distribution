package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlsaProvenance extends StObject {
  
  /** required */
  var builder: js.UndefOr[SlsaBuilder] = js.undefined
  
  /**
    * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless
    * metadata.completeness.materials is true. Unset or null is equivalent to empty.
    */
  var materials: js.UndefOr[js.Array[Material]] = js.undefined
  
  var metadata: js.UndefOr[SlsaMetadata] = js.undefined
  
  /**
    * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit
    * identical output (if the build is reproducible). required
    */
  var recipe: js.UndefOr[SlsaRecipe] = js.undefined
}
object SlsaProvenance {
  
  inline def apply(): SlsaProvenance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlsaProvenance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlsaProvenance] (val x: Self) extends AnyVal {
    
    inline def setBuilder(value: SlsaBuilder): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
    
    inline def setBuilderUndefined: Self = StObject.set(x, "builder", js.undefined)
    
    inline def setMaterials(value: js.Array[Material]): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
    
    inline def setMaterialsVarargs(value: Material*): Self = StObject.set(x, "materials", js.Array(value*))
    
    inline def setMetadata(value: SlsaMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setRecipe(value: SlsaRecipe): Self = StObject.set(x, "recipe", value.asInstanceOf[js.Any])
    
    inline def setRecipeUndefined: Self = StObject.set(x, "recipe", js.undefined)
  }
}
