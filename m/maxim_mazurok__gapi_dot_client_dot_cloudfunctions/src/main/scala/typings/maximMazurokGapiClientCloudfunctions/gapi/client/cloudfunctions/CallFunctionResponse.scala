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
  
  inline def apply(): CallFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallFunctionResponse]
  }
  
  extension [Self <: CallFunctionResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
