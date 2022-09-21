package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCompleteness extends StObject {
  
  /**
    * If true, the builder claims that recipe.arguments is complete, meaning that all external inputs are properly captured in the recipe.
    */
  var arguments: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, the builder claims that recipe.environment is claimed to be complete.
    */
  var environment: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If true, the builder claims that materials are complete, usually through some controls to prevent network access. Sometimes called "hermetic".
    */
  var materials: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCompleteness {
  
  inline def apply(): SchemaCompleteness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompleteness]
  }
  
  extension [Self <: SchemaCompleteness](x: Self) {
    
    inline def setArguments(value: Boolean): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsNull: Self = StObject.set(x, "arguments", null)
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setEnvironment(value: Boolean): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setMaterials(value: Boolean): Self = StObject.set(x, "materials", value.asInstanceOf[js.Any])
    
    inline def setMaterialsNull: Self = StObject.set(x, "materials", null)
    
    inline def setMaterialsUndefined: Self = StObject.set(x, "materials", js.undefined)
  }
}
