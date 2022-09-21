package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFunctionMock extends StObject {
  
  /**
    * The list of `Arg` values to match. The order in which the arguments are provided is the order in which they must appear in the function invocation.
    */
  var args: js.UndefOr[js.Array[SchemaArg]] = js.undefined
  
  /**
    * The name of the function. The function name must match one provided by a service declaration.
    */
  var function: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The mock result of the function call.
    */
  var result: js.UndefOr[SchemaResult] = js.undefined
}
object SchemaFunctionMock {
  
  inline def apply(): SchemaFunctionMock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionMock]
  }
  
  extension [Self <: SchemaFunctionMock](x: Self) {
    
    inline def setArgs(value: js.Array[SchemaArg]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: SchemaArg*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionNull: Self = StObject.set(x, "function", null)
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setResult(value: SchemaResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
