package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a service-defined function call that was invoked during test
  * execution.
  */
trait SchemaFunctionCall extends StObject {
  
  /**
    * The arguments that were provided to the function.
    */
  var args: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Name of the function invoked.
    */
  var function: js.UndefOr[String] = js.undefined
}
object SchemaFunctionCall {
  
  inline def apply(): SchemaFunctionCall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionCall]
  }
  
  extension [Self <: SchemaFunctionCall](x: Self) {
    
    inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
  }
}
