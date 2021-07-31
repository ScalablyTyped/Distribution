package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CircuitBreakers extends StObject {
  
  /** The maximum number of connections to the backend service. If not specified, there is no limit. */
  var maxConnections: js.UndefOr[Double] = js.undefined
  
  /** The maximum number of pending requests allowed to the backend service. If not specified, there is no limit. */
  var maxPendingRequests: js.UndefOr[Double] = js.undefined
  
  /** The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit. */
  var maxRequests: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit.
    * Setting this parameter to 1 will effectively disable keep alive.
    */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.undefined
  
  /** The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1. */
  var maxRetries: js.UndefOr[Double] = js.undefined
}
object CircuitBreakers {
  
  @scala.inline
  def apply(): CircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircuitBreakers]
  }
  
  @scala.inline
  implicit class CircuitBreakersMutableBuilder[Self <: CircuitBreakers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
    
    @scala.inline
    def setMaxPendingRequests(value: Double): Self = StObject.set(x, "maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPendingRequestsUndefined: Self = StObject.set(x, "maxPendingRequests", js.undefined)
    
    @scala.inline
    def setMaxRequests(value: Double): Self = StObject.set(x, "maxRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRequestsPerConnection(value: Double): Self = StObject.set(x, "maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRequestsPerConnectionUndefined: Self = StObject.set(x, "maxRequestsPerConnection", js.undefined)
    
    @scala.inline
    def setMaxRequestsUndefined: Self = StObject.set(x, "maxRequests", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = StObject.set(x, "maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRetriesUndefined: Self = StObject.set(x, "maxRetries", js.undefined)
  }
}
