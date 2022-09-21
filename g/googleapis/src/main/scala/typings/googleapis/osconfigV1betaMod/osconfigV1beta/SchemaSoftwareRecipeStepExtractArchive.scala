package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStepExtractArchive extends StObject {
  
  /**
    * Required. The id of the relevant artifact in the recipe.
    */
  var artifactId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Directory to extract archive to. Defaults to `/` on Linux or `C:\` on Windows.
    */
  var destination: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of the archive to extract.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipeStepExtractArchive {
  
  inline def apply(): SchemaSoftwareRecipeStepExtractArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStepExtractArchive]
  }
  
  extension [Self <: SchemaSoftwareRecipeStepExtractArchive](x: Self) {
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdNull: Self = StObject.set(x, "artifactId", null)
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
    
    inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationNull: Self = StObject.set(x, "destination", null)
    
    inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
