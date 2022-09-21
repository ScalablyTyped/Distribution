package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStepInstallMsi extends StObject {
  
  /**
    * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
    */
  var allowedExitCodes: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Required. The id of the relevant artifact in the recipe.
    */
  var artifactId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The flags to use when installing the MSI defaults to ["/i"] (i.e. the install flag).
    */
  var flags: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaSoftwareRecipeStepInstallMsi {
  
  inline def apply(): SchemaSoftwareRecipeStepInstallMsi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStepInstallMsi]
  }
  
  extension [Self <: SchemaSoftwareRecipeStepInstallMsi](x: Self) {
    
    inline def setAllowedExitCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedExitCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedExitCodesNull: Self = StObject.set(x, "allowedExitCodes", null)
    
    inline def setAllowedExitCodesUndefined: Self = StObject.set(x, "allowedExitCodes", js.undefined)
    
    inline def setAllowedExitCodesVarargs(value: Double*): Self = StObject.set(x, "allowedExitCodes", js.Array(value*))
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdNull: Self = StObject.set(x, "artifactId", null)
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
  }
}
