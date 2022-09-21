package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSoftwareRecipeStepRunScript extends StObject {
  
  /**
    * Return codes that indicate that the software installed or updated successfully. Behaviour defaults to [0]
    */
  var allowedExitCodes: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * The script interpreter to use to run the script. If no interpreter is specified the script is executed directly, which likely only succeed for scripts with [shebang lines](https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
    */
  var interpreter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The shell script to be executed.
    */
  var script: js.UndefOr[String | Null] = js.undefined
}
object SchemaSoftwareRecipeStepRunScript {
  
  inline def apply(): SchemaSoftwareRecipeStepRunScript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSoftwareRecipeStepRunScript]
  }
  
  extension [Self <: SchemaSoftwareRecipeStepRunScript](x: Self) {
    
    inline def setAllowedExitCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedExitCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedExitCodesNull: Self = StObject.set(x, "allowedExitCodes", null)
    
    inline def setAllowedExitCodesUndefined: Self = StObject.set(x, "allowedExitCodes", js.undefined)
    
    inline def setAllowedExitCodesVarargs(value: Double*): Self = StObject.set(x, "allowedExitCodes", js.Array(value*))
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setScript(value: String): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptNull: Self = StObject.set(x, "script", null)
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
