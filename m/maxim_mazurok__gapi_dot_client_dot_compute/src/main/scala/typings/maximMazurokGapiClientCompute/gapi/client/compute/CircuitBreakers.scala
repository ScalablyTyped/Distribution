package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitBreakers extends StObject {
  
  /** Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /** Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. */
  var maxPendingRequests: js.UndefOr[Double] = js.undefined
  
  /** The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit. */
  var maxRequests: js.UndefOr[Double] = js.undefined
  
  /** Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  
  /** Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object CircuitBreakers {
  
  inline def apply(): CircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircuitBreakers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CircuitBreakers] (val x: Self) extends AnyVal {
    
    inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    inline def setMaxPendingRequests(value: Double): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
    
    inline def setMaxRequests(value: Double): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsPerConnection(value: Double): Self = StObject.set(x, "maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    inline def setMaxRequestsPerConnectionUndefined: Self = StObject.set(x, "maxRequestsPerConnection", js.undefined)
    
    inline def setMaxRequestsUndefined: Self = StObject.set(x, "maxRequests", js.undefined)
    
    inline def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    inline def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
