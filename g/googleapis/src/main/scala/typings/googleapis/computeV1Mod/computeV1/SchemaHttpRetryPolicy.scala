package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRetryPolicy extends StObject {
  
  /**
    * Specifies the allowed number retries. This number must be \> 0. If not specified, defaults to 1.
    */
  var numRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
    */
  var perTryTimeout: js.UndefOr[SchemaDuration] = js.undefined
  
  /**
    * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
    */
  var retryConditions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHttpRetryPolicy {
  
  inline def apply(): SchemaHttpRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRetryPolicy]
  }
  
  extension [Self <: SchemaHttpRetryPolicy](x: Self) {
    
    inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesNull: Self = StObject.set(x, "numRetries", null)
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
    
    inline def setPerTryTimeout(value: SchemaDuration): Self = StObject.set(x, "perTryTimeout", value.asInstanceOf[js.Any])
    
    inline def setPerTryTimeoutUndefined: Self = StObject.set(x, "perTryTimeout", js.undefined)
    
    inline def setRetryConditions(value: js.Array[String]): Self = StObject.set(x, "retryConditions", value.asInstanceOf[js.Any])
    
    inline def setRetryConditionsNull: Self = StObject.set(x, "retryConditions", null)
    
    inline def setRetryConditionsUndefined: Self = StObject.set(x, "retryConditions", js.undefined)
    
    inline def setRetryConditionsVarargs(value: String*): Self = StObject.set(x, "retryConditions", js.Array(value*))
  }
}
