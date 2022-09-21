package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaHttpRouteRetryPolicy extends StObject {
  
  /**
    * Specifies the allowed number of retries. This number must be \> 0. If not specified, default to 1.
    */
  var numRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Specifies a non-zero timeout per retry attempt.
    */
  var perTryTimeout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies one or more conditions when this retry policy applies. Valid values are: 5xx: Proxy will attempt a retry if the destination service responds with any 5xx response code, of if the destination service does not respond at all, example: disconnect, reset, read timeout, connection failure and refused streams. gateway-error: Similar to 5xx, but only applies to response codes 502, 503, 504. reset: Proxy will attempt a retry if the destination service does not respond at all (disconnect/reset/read timeout) connect-failure: Proxy will retry on failures connecting to destination for example due to connection timeouts. retriable-4xx: Proxy will retry fro retriable 4xx response codes. Currently the only retriable error supported is 409. refused-stream: Proxy will retry if the destination resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
    */
  var retryConditions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaHttpRouteRetryPolicy {
  
  inline def apply(): SchemaHttpRouteRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteRetryPolicy]
  }
  
  extension [Self <: SchemaHttpRouteRetryPolicy](x: Self) {
    
    inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesNull: Self = StObject.set(x, "numRetries", null)
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
    
    inline def setPerTryTimeout(value: String): Self = StObject.set(x, "perTryTimeout", value.asInstanceOf[js.Any])
    
    inline def setPerTryTimeoutNull: Self = StObject.set(x, "perTryTimeout", null)
    
    inline def setPerTryTimeoutUndefined: Self = StObject.set(x, "perTryTimeout", js.undefined)
    
    inline def setRetryConditions(value: js.Array[String]): Self = StObject.set(x, "retryConditions", value.asInstanceOf[js.Any])
    
    inline def setRetryConditionsNull: Self = StObject.set(x, "retryConditions", null)
    
    inline def setRetryConditionsUndefined: Self = StObject.set(x, "retryConditions", js.undefined)
    
    inline def setRetryConditionsVarargs(value: String*): Self = StObject.set(x, "retryConditions", js.Array(value*))
  }
}
