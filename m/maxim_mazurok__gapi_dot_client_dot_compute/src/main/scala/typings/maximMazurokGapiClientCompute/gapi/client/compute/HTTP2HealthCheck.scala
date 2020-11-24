package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTTP2HealthCheck extends js.Object {
  
  /** The value of the host header in the HTTP/2 health check request. If left empty (default value), the IP on behalf of which this health check is performed will be used. */
  var host: js.UndefOr[String] = js.native
  
  /** The TCP port number for the health check request. The default value is 443. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.native
  
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * Specifies how port is selected for health checking, can be one of following values:
    * USE_FIXED_PORT: The port number in port is used for health checking.
    * USE_NAMED_PORT: The portName is used for health checking.
    * USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the
    * Backend Service is used for health checking.
    *
    *
    * If not specified, HTTP2 health check follows behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
  
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.native
  
  /** The request path of the HTTP/2 health check request. The default value is /. */
  var requestPath: js.UndefOr[String] = js.native
  
  /** The string to match anywhere in the first 1024 bytes of the response body. If left empty (the default value), the status code determines health. The response data can only be ASCII. */
  var response: js.UndefOr[String] = js.native
}
object HTTP2HealthCheck {
  
  @scala.inline
  def apply(): HTTP2HealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HTTP2HealthCheck]
  }
  
  @scala.inline
  implicit class HTTP2HealthCheckOps[Self <: HTTP2HealthCheck] (val x: Self) extends AnyVal {
    
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
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setPortName(value: String): Self = this.set("portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortName: Self = this.set("portName", js.undefined)
    
    @scala.inline
    def setPortSpecification(value: String): Self = this.set("portSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortSpecification: Self = this.set("portSpecification", js.undefined)
    
    @scala.inline
    def setProxyHeader(value: String): Self = this.set("proxyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxyHeader: Self = this.set("proxyHeader", js.undefined)
    
    @scala.inline
    def setRequestPath(value: String): Self = this.set("requestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestPath: Self = this.set("requestPath", js.undefined)
    
    @scala.inline
    def setResponse(value: String): Self = this.set("response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
  }
}
