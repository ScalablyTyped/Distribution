package typings.googleapis.osconfigV1betaMod.osconfigV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecStepConfig extends StObject {
  
  /**
    * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
    */
  var allowedSuccessCodes: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
  /**
    * A Google Cloud Storage object containing the executable.
    */
  var gcsObject: js.UndefOr[SchemaGcsObject] = js.undefined
  
  /**
    * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
    */
  var interpreter: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An absolute path to the executable on the VM.
    */
  var localPath: js.UndefOr[String | Null] = js.undefined
}
object SchemaExecStepConfig {
  
  inline def apply(): SchemaExecStepConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecStepConfig]
  }
  
  extension [Self <: SchemaExecStepConfig](x: Self) {
    
    inline def setAllowedSuccessCodes(value: js.Array[Double]): Self = StObject.set(x, "allowedSuccessCodes", value.asInstanceOf[js.Any])
    
    inline def setAllowedSuccessCodesNull: Self = StObject.set(x, "allowedSuccessCodes", null)
    
    inline def setAllowedSuccessCodesUndefined: Self = StObject.set(x, "allowedSuccessCodes", js.undefined)
    
    inline def setAllowedSuccessCodesVarargs(value: Double*): Self = StObject.set(x, "allowedSuccessCodes", js.Array(value*))
    
    inline def setGcsObject(value: SchemaGcsObject): Self = StObject.set(x, "gcsObject", value.asInstanceOf[js.Any])
    
    inline def setGcsObjectUndefined: Self = StObject.set(x, "gcsObject", js.undefined)
    
    inline def setInterpreter(value: String): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    inline def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    inline def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    inline def setLocalPath(value: String): Self = StObject.set(x, "localPath", value.asInstanceOf[js.Any])
    
    inline def setLocalPathNull: Self = StObject.set(x, "localPath", null)
    
    inline def setLocalPathUndefined: Self = StObject.set(x, "localPath", js.undefined)
  }
}
