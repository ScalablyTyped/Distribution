package typings.maximMazurokGapiClientApigateway.gapi.client.apigateway

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApigatewayListOperationsResponse extends StObject {
  
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[ApigatewayOperation]] = js.undefined
}
object ApigatewayListOperationsResponse {
  
  inline def apply(): ApigatewayListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApigatewayListOperationsResponse]
  }
  
  extension [Self <: ApigatewayListOperationsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOperations(value: js.Array[ApigatewayOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: ApigatewayOperation*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
