package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircuitBreakers extends js.Object {
  
  /** The maximum number of connections to the backend service. If not specified, there is no limit. */
  var maxConnections: js.UndefOr[Double] = js.native
  
  /** The maximum number of pending requests allowed to the backend service. If not specified, there is no limit. */
  var maxPendingRequests: js.UndefOr[Double] = js.native
  
  /** The maximum number of parallel requests that allowed to the backend service. If not specified, there is no limit. */
  var maxRequests: js.UndefOr[Double] = js.native
  
  /**
    * Maximum requests for a single connection to the backend service. This parameter is respected by both the HTTP/1.1 and HTTP/2 implementations. If not specified, there is no limit.
    * Setting this parameter to 1 will effectively disable keep alive.
    */
  var maxRequestsPerConnection: js.UndefOr[Double] = js.native
  
  /** The maximum number of parallel retries allowed to the backend cluster. If not specified, the default is 1. */
  var maxRetries: js.UndefOr[Double] = js.native
}
object CircuitBreakers {
  
  @scala.inline
  def apply(): CircuitBreakers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CircuitBreakers]
  }
  
  @scala.inline
  implicit class CircuitBreakersOps[Self <: CircuitBreakers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxConnections(value: Double): Self = this.set("maxConnections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxConnections: Self = this.set("maxConnections", js.undefined)
    
    @scala.inline
    def setMaxPendingRequests(value: Double): Self = this.set("maxPendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPendingRequests: Self = this.set("maxPendingRequests", js.undefined)
    
    @scala.inline
    def setMaxRequests(value: Double): Self = this.set("maxRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequests: Self = this.set("maxRequests", js.undefined)
    
    @scala.inline
    def setMaxRequestsPerConnection(value: Double): Self = this.set("maxRequestsPerConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRequestsPerConnection: Self = this.set("maxRequestsPerConnection", js.undefined)
    
    @scala.inline
    def setMaxRetries(value: Double): Self = this.set("maxRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRetries: Self = this.set("maxRetries", js.undefined)
  }
}
