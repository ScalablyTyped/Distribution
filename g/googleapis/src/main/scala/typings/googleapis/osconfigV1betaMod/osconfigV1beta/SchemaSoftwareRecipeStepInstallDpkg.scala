package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStepInstallDpkg extends StObject {
  
  /**
    * Required. The id of the relevant artifact in the recipe.
    */
  var artifactId: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipeStepInstallDpkg {
  
  inline def apply(): SchemaSoftwareRecipeStepInstallDpkg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStepInstallDpkg]
  }
  
  extension [Self <: SchemaSoftwareRecipeStepInstallDpkg](x: Self) {
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdNull: Self = StObject.set(x, "artifactId", null)
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
  }
}
