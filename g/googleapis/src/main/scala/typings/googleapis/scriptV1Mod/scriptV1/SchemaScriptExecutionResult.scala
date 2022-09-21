package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaScriptExecutionResult extends StObject {
  
  /**
    * The returned value of the execution.
    */
  var returnValue: js.UndefOr[SchemaValue] = js.undefined
}
object SchemaScriptExecutionResult {
  
  inline def apply(): SchemaScriptExecutionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaScriptExecutionResult]
  }
  
  extension [Self <: SchemaScriptExecutionResult](x: Self) {
    
    inline def setReturnValue(value: SchemaValue): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
  }
}
