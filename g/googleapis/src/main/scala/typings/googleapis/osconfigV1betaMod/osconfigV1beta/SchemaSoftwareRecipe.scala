package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipe extends StObject {
  
  /**
    * Resources available to be used in the steps in the recipe.
    */
  var artifacts: js.UndefOr[js.Array[SchemaSoftwareRecipeArtifact]] = js.undefined
  
  /**
    * Default is INSTALLED. The desired state the agent should maintain for this recipe. INSTALLED: The software recipe is installed on the instance but won't be updated to new versions. UPDATED: The software recipe is installed on the instance. The recipe is updated to a higher version, if a higher version of the recipe is assigned to this instance. REMOVE: Remove is unsupported for software recipes and attempts to create or update a recipe to the REMOVE state is rejected.
    */
  var desiredState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actions to be taken for installing this recipe. On failure it stops executing steps and does not attempt another installation. Any steps taken (including partially completed steps) are not rolled back.
    */
  var installSteps: js.UndefOr[js.Array[SchemaSoftwareRecipeStep]] = js.undefined
  
  /**
    * Required. Unique identifier for the recipe. Only one recipe with a given name is installed on an instance. Names are also used to identify resources which helps to determine whether guest policies have conflicts. This means that requests to create multiple recipes with the same name and version are rejected since they could potentially have conflicting assignments.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Actions to be taken for updating this recipe. On failure it stops executing steps and does not attempt another update for this recipe. Any steps taken (including partially completed steps) are not rolled back.
    */
  var updateSteps: js.UndefOr[js.Array[SchemaSoftwareRecipeStep]] = js.undefined
  
  /**
    * The version of this software recipe. Version can be up to 4 period separated numbers (e.g. 12.34.56.78).
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipe {
  
  inline def apply(): SchemaSoftwareRecipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipe]
  }
  
  extension [Self <: SchemaSoftwareRecipe](x: Self) {
    
    inline def setArtifacts(value: js.Array[SchemaSoftwareRecipeArtifact]): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: SchemaSoftwareRecipeArtifact*): Self = StObject.set(x, "artifacts", js.Array(value*))
    
    inline def setDesiredState(value: String): Self = StObject.set(x, "desiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateNull: Self = StObject.set(x, "desiredState", null)
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "desiredState", js.undefined)
    
    inline def setInstallSteps(value: js.Array[SchemaSoftwareRecipeStep]): Self = StObject.set(x, "installSteps", value.asInstanceOf[js.Any])
    
    inline def setInstallStepsUndefined: Self = StObject.set(x, "installSteps", js.undefined)
    
    inline def setInstallStepsVarargs(value: SchemaSoftwareRecipeStep*): Self = StObject.set(x, "installSteps", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateSteps(value: js.Array[SchemaSoftwareRecipeStep]): Self = StObject.set(x, "updateSteps", value.asInstanceOf[js.Any])
    
    inline def setUpdateStepsUndefined: Self = StObject.set(x, "updateSteps", js.undefined)
    
    inline def setUpdateStepsVarargs(value: SchemaSoftwareRecipeStep*): Self = StObject.set(x, "updateSteps", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
