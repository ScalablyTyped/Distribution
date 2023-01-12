package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlsaCompleteness extends StObject {
  
  /** If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe. */
  var arguments: js.UndefOr[Boolean] = js.undefined
  
  /** If true, the builder claims that recipe.environment is claimed to be complete. */
  var environment: js.UndefOr[Boolean] = js.undefined
  
  /** If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic". */
  var materials: js.UndefOr[Boolean] = js.undefined
}
object SlsaCompleteness {
  
  inline def apply(): SlsaCompleteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlsaCompleteness]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlsaCompleteness] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: Boolean): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setEnvironment(value: Boolean): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaterials(value: Boolean): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
  }
}
