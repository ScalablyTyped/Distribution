package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallFunctionResponse extends StObject {
  
  /** Either system or user-function generated error. Set if execution was not successful. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Execution id of function invocation. */
  var executionId: js.UndefOr[String] = js.undefined
  
  /** Result populated for successful execution of synchronous function. Will not be populated if function does not return a result through context. */
  var result: js.UndefOr[String] = js.undefined
}
object CallFunctionResponse {
  
  @scala.inline
  def apply(): CallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionResponse]
  }
  
  @scala.inline
  implicit class CallFunctionResponseMutableBuilder[Self <: CallFunctionResponse] (val x: Self) extends AnyVal {
    
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
