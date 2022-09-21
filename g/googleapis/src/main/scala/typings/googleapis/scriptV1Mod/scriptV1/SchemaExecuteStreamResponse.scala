package typings.googleapis.scriptV1Mod.scriptV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaExecuteStreamResponse extends StObject {
  
  /**
    * The result of the execution.
    */
  var result: js.UndefOr[SchemaScriptExecutionResult] = js.undefined
}
object SchemaExecuteStreamResponse {
  
  inline def apply(): SchemaExecuteStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExecuteStreamResponse]
  }
  
  extension [Self <: SchemaExecuteStreamResponse](x: Self) {
    
    inline def setResult(value: SchemaScriptExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
