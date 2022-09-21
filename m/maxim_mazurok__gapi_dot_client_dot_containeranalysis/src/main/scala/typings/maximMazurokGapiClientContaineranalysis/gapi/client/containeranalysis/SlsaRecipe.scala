package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlsaRecipe extends StObject {
  
  /**
    * Collection of all external inputs that influenced the build on top of recipe.definedInMaterial and recipe.entryPoint. For example, if the recipe type were "make", then this might be
    * the flags passed to make aside from the target, which is captured in recipe.entryPoint. Depending on the recipe Type, the structure may be different.
    */
  var arguments: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SlsaRecipe & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Index in materials containing the recipe steps that are not implied by recipe.type. For example, if the recipe type were "make", then this would point to the source containing the
    * Makefile, not the make program itself. Set to -1 if the recipe doesn't come from a material, as zero is default unset value for int64.
    */
  var definedInMaterial: js.UndefOr[String] = js.undefined
  
  /**
    * String identifying the entry point into the build. This is often a path to a configuration file and/or a target label within that file. The syntax and meaning are defined by
    * recipe.type. For example, if the recipe type were "make", then this would reference the directory in which to run make as well as which target to use.
    */
  var entryPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Any other builder-controlled inputs necessary for correctly evaluating the recipe. Usually only needed for reproducing the build but not evaluated as part of policy. Depending on
    * the recipe Type, the structure may be different.
    */
  var environment: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SlsaRecipe & TopLevel[Any]
  ] = js.undefined
  
  /** URI indicating what type of recipe was performed. It determines the meaning of recipe.entryPoint, recipe.arguments, recipe.environment, and materials. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SlsaRecipe {
  
  inline def apply(): SlsaRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlsaRecipe]
  }
  
  extension [Self <: SlsaRecipe](x: Self) {
    
    inline def setArguments(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SlsaRecipe & TopLevel[Any]
    ): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsUndefined: Self = StObject.set(x, "arguments", js.undefined)
    
    inline def setDefinedInMaterial(value: String): Self = StObject.set(x, "definedInMaterial", value.asInstanceOf[js.Any])
    
    inline def setDefinedInMaterialUndefined: Self = StObject.set(x, "definedInMaterial", js.undefined)
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setEnvironment(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientContaineranalysis.maximMazurokGapiClientContaineranalysisStrings.SlsaRecipe & TopLevel[Any]
    ): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
