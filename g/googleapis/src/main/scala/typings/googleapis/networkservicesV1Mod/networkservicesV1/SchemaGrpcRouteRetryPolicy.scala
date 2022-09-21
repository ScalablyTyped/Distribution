package typings.googleapis.networkservicesV1Mod.networkservicesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGrpcRouteRetryPolicy extends StObject {
  
  /**
    * Specifies the allowed number of retries. This number must be \> 0. If not specified, default to 1.
    */
  var numRetries: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * - connect-failure: Router will retry on failures connecting to Backend Services, for example due to connection timeouts. - refused-stream: Router will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: Router will retry if the gRPC status code in the response header is set to cancelled - deadline-exceeded: Router will retry if the gRPC status code in the response header is set to deadline-exceeded - resource-exhausted: Router will retry if the gRPC status code in the response header is set to resource-exhausted - unavailable: Router will retry if the gRPC status code in the response header is set to unavailable
    */
  var retryConditions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGrpcRouteRetryPolicy {
  
  inline def apply(): SchemaGrpcRouteRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGrpcRouteRetryPolicy]
  }
  
  extension [Self <: SchemaGrpcRouteRetryPolicy](x: Self) {
    
    inline def setNumRetries(value: Double): Self = StObject.set(x, "numRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesNull: Self = StObject.set(x, "numRetries", null)
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "numRetries", js.undefined)
    
    inline def setRetryConditions(value: js.Array[String]): Self = StObject.set(x, "retryConditions", value.asInstanceOf[js.Any])
    
    inline def setRetryConditionsNull: Self = StObject.set(x, "retryConditions", null)
    
    inline def setRetryConditionsUndefined: Self = StObject.set(x, "retryConditions", js.undefined)
    
    inline def setRetryConditionsVarargs(value: String*): Self = StObject.set(x, "retryConditions", js.Array(value*))
  }
}
