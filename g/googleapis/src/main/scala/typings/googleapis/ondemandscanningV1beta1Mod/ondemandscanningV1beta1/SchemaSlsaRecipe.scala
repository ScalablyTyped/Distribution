package typings.googleapis.ondemandscanningV1beta1Mod.ondemandscanningV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSlsaRecipe extends StObject {
  
  /**
    * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
    */
  var arguments: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
    */
  var definedInMaterial: js.UndefOr[String | Null] = js.undefined
  
  /**
    * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
    */
  var entryPoint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on the recipe Type, the structure may be different.
    */
  var environment: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSlsaRecipe {
  
  inline def apply(): SchemaSlsaRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSlsaRecipe]
  }
  
  extension [Self <: SchemaSlsaRecipe](x: Self) {
    
    inline def setArguments(value: StringDictionary[Any]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsNull: Self = StObject.set(x, "arguments", null)
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setDefinedInMaterial(value: String): Self = StObject.set(x, "definedInMaterial", value.asInstanceOf[js.Any])
    
    inline def setDefinedInMaterialNull: Self = StObject.set(x, "definedInMaterial", null)
    
    inline def setDefinedInMaterialUndefined: Self = StObject.set(x, "definedInMaterial", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointNull: Self = StObject.set(x, "entryPoint", null)
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setEnvironment(value: StringDictionary[Any]): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNull: Self = StObject.set(x, "environment", null)
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
