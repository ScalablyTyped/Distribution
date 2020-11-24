package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRetryPolicy extends js.Object {
  
  /** Specifies the allowed number retries. This number must be > 0. If not specified, defaults to 1. */
  var numRetries: js.UndefOr[Double] = js.native
  
  /**
    * Specifies a non-zero timeout per retry attempt.
    * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set, will use the largest timeout among all backend services associated with the
    * route.
    */
  var perTryTimeout: js.UndefOr[Duration] = js.native
  
  /**
    * Specfies one or more conditions when this retry rule applies. Valid values are:
    * - 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code, or if the backend service does not respond at all, example: disconnects, reset,
    * read timeout, connection failure, and refused streams.
    * - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
    * -
    * - connect-failure: Loadbalancer will retry on failures connecting to backend services, for example due to connection timeouts.
    * - retriable-4xx: Loadbalancer will retry for retriable 4xx response codes. Currently the only retriable error supported is 409.
    * - refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry.
    * - cancelledLoadbalancer will retry if the gRPC status code in the response header is set to cancelled
    * - deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
    * - resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
    * - unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
    */
  var retryConditions: js.UndefOr[js.Array[String]] = js.native
}
object HttpRetryPolicy {
  
  @scala.inline
  def apply(): HttpRetryPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpRetryPolicy]
  }
  
  @scala.inline
  implicit class HttpRetryPolicyOps[Self <: HttpRetryPolicy] (val x: Self) extends AnyVal {
    
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
    def setNumRetries(value: Double): Self = this.set("numRetries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRetries: Self = this.set("numRetries", js.undefined)
    
    @scala.inline
    def setPerTryTimeout(value: Duration): Self = this.set("perTryTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerTryTimeout: Self = this.set("perTryTimeout", js.undefined)
    
    @scala.inline
    def setRetryConditionsVarargs(value: String*): Self = this.set("retryConditions", js.Array(value :_*))
    
    @scala.inline
    def setRetryConditions(value: js.Array[String]): Self = this.set("retryConditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryConditions: Self = this.set("retryConditions", js.undefined)
  }
}
