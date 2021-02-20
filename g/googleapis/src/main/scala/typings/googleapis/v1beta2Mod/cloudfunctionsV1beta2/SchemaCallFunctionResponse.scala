package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of `CallFunction` method.
  */
@js.native
trait SchemaCallFunctionResponse extends StObject {
  
  /**
    * Either system or user-function generated error. Set if execution was not
    * successful.
    */
  var error: js.UndefOr[String] = js.native
  
  /**
    * Execution id of function invocation.
    */
  var executionId: js.UndefOr[String] = js.native
  
  /**
    * Result populated for successful execution of synchronous function. Will
    * not be populated if function does not return a result through context.
    */
  var result: js.UndefOr[String] = js.native
}
object SchemaCallFunctionResponse {
  
  @scala.inline
  def apply(): SchemaCallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallFunctionResponse]
  }
  
  @scala.inline
  implicit class SchemaCallFunctionResponseMutableBuilder[Self <: SchemaCallFunctionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
