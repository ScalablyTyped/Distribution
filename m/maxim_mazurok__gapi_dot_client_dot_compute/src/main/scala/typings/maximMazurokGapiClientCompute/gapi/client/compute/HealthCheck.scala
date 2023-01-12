package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheck extends StObject {
  
  /** How often (in seconds) to send a health check. The default value is 5 seconds. */
  var checkIntervalSec: js.UndefOr[Double] = js.undefined
  
  /** [Output Only] Creation timestamp in 3339 text format. */
  var creationTimestamp: js.UndefOr[String] = js.undefined
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.undefined
  
  var grpcHealthCheck: js.UndefOr[GRPCHealthCheck] = js.undefined
  
  /** A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2. */
  var healthyThreshold: js.UndefOr[Double] = js.undefined
  
  var http2HealthCheck: js.UndefOr[HTTP2HealthCheck] = js.undefined
  
  var httpHealthCheck: js.UndefOr[HTTPHealthCheck_] = js.undefined
  
  var httpsHealthCheck: js.UndefOr[HTTPSHealthCheck_] = js.undefined
  
  /** [Output Only] The unique identifier for the resource. This identifier is defined by the server. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Type of the resource. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Configure logging on this health check. */
  var logConfig: js.UndefOr[HealthCheckLogConfig] = js.undefined
  
  /**
    * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63
    * characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character
    * is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Region where the health check resides. Not applicable to global health checks. */
  var region: js.UndefOr[String] = js.undefined
  
  /** [Output Only] Server-defined URL for the resource. */
  var selfLink: js.UndefOr[String] = js.undefined
  
  var sslHealthCheck: js.UndefOr[SSLHealthCheck] = js.undefined
  
  var tcpHealthCheck: js.UndefOr[TCPHealthCheck] = js.undefined
  
  /** How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec. */
  var timeoutSec: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not specified, the default is TCP. Exactly one of the protocol-specific health check field must be
    * specified, which must match type field.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2. */
  var unhealthyThreshold: js.UndefOr[Double] = js.undefined
}
object HealthCheck {
  
  inline def apply(): HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HealthCheck] (val x: Self) extends AnyVal {
    
    inline def setCheckIntervalSec(value: Double): Self = StObject.set(x, "checkIntervalSec", value.asInstanceOf[js.Any])
    
    inline def setCheckIntervalSecUndefined: Self = StObject.set(x, "checkIntervalSec", js.undefined)
    
    inline def setCreationTimestamp(value: String): Self = StObject.set(x, "creationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "creationTimestamp", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setGrpcHealthCheck(value: GRPCHealthCheck): Self = StObject.set(x, "grpcHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setGrpcHealthCheckUndefined: Self = StObject.set(x, "grpcHealthCheck", js.undefined)
    
    inline def setHealthyThreshold(value: Double): Self = StObject.set(x, "healthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdUndefined: Self = StObject.set(x, "healthyThreshold", js.undefined)
    
    inline def setHttp2HealthCheck(value: HTTP2HealthCheck): Self = StObject.set(x, "http2HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHttp2HealthCheckUndefined: Self = StObject.set(x, "http2HealthCheck", js.undefined)
    
    inline def setHttpHealthCheck(value: HTTPHealthCheck_): Self = StObject.set(x, "httpHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHttpHealthCheckUndefined: Self = StObject.set(x, "httpHealthCheck", js.undefined)
    
    inline def setHttpsHealthCheck(value: HTTPSHealthCheck_): Self = StObject.set(x, "httpsHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHttpsHealthCheckUndefined: Self = StObject.set(x, "httpsHealthCheck", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLogConfig(value: HealthCheckLogConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
    
    inline def setSslHealthCheck(value: SSLHealthCheck): Self = StObject.set(x, "sslHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setSslHealthCheckUndefined: Self = StObject.set(x, "sslHealthCheck", js.undefined)
    
    inline def setTcpHealthCheck(value: TCPHealthCheck): Self = StObject.set(x, "tcpHealthCheck", value.asInstanceOf[js.Any])
    
    inline def setTcpHealthCheckUndefined: Self = StObject.set(x, "tcpHealthCheck", js.undefined)
    
    inline def setTimeoutSec(value: Double): Self = StObject.set(x, "timeoutSec", value.asInstanceOf[js.Any])
    
    inline def setTimeoutSecUndefined: Self = StObject.set(x, "timeoutSec", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUnhealthyThreshold(value: Double): Self = StObject.set(x, "unhealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdUndefined: Self = StObject.set(x, "unhealthyThreshold", js.undefined)
  }
}
