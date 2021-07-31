package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mock function definition.  Mocks must refer to a function declared by the
  * target service. The type of the function args and result will be inferred
  * at test time. If either the arg or result values are not compatible with
  * function type declaration, the request will be considered invalid.  More
  * than one `FunctionMock` may be provided for a given function name so long
  * as the `Arg` matchers are distinct. There may be only one function for a
  * given overload where all `Arg` values are `Arg.any_value`.
  */
trait SchemaFunctionMock extends StObject {
  
  /**
    * The list of `Arg` values to match. The order in which the arguments are
    * provided is the order in which they must appear in the function
    * invocation.
    */
  var args: js.UndefOr[js.Array[SchemaArg]] = js.undefined
  
  /**
    * The name of the function.  The function name must match one provided by a
    * service declaration.
    */
  var function: js.UndefOr[String] = js.undefined
  
  /**
    * The mock result of the function call.
    */
  var result: js.UndefOr[SchemaResult] = js.undefined
}
object SchemaFunctionMock {
  
  @scala.inline
  def apply(): SchemaFunctionMock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFunctionMock]
  }
  
  @scala.inline
  implicit class SchemaFunctionMockMutableBuilder[Self <: SchemaFunctionMock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[SchemaArg]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: SchemaArg*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    @scala.inline
    def setResult(value: SchemaResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
