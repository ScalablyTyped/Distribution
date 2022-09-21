package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStepExecFile extends StObject {
  
  /**
    * Defaults to [0]. A list of possible return values that the program can return to indicate a success.
    */
  var allowedExitCodes: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * Arguments to be passed to the provided executable.
    */
  var args: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The id of the relevant artifact in the recipe.
    */
  var artifactId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The absolute path of the file on the local filesystem.
    */
  var localPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipeStepExecFile {
  
  inline def apply(): SchemaSoftwareRecipeStepExecFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStepExecFile]
  }
  
  extension [Self <: SchemaSoftwareRecipeStepExecFile](x: Self) {
    
    inline def setAllowedExitCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedExitCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedExitCodesNull: Self = StObject.set(x, "allowedExitCodes", null)
    
    inline def setAllowedExitCodesUndefined: Self = StObject.set(x, "allowedExitCodes", js.undefined)
    
    inline def setAllowedExitCodesVarargs(value: Double*): Self = StObject.set(x, "allowedExitCodes", js.Array(value*))
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsNull: Self = StObject.set(x, "args", null)
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setArtifactId(value: String): Self = StObject.set(x, "artifactId", value.asInstanceOf[js.Any])
    
    inline def setArtifactIdNull: Self = StObject.set(x, "artifactId", null)
    
    inline def setArtifactIdUndefined: Self = StObject.set(x, "artifactId", js.undefined)
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathNull: Self = StObject.set(x, "localPath", null)
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
  }
}
