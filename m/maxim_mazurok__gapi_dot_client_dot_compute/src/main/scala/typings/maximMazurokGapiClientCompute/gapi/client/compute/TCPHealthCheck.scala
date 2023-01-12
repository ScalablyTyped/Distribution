package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TCPHealthCheck extends StObject {
  
  /** The TCP port number for the health check request. The default value is 80. Valid values are 1 through 65535. */
  var port: js.UndefOr[Double] = js.undefined
  
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. */
  var portName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName
    * is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or
    * named port specified in the Backend Service is used for health checking. If not specified, TCP health check follows behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.undefined
  
  /** Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE. */
  var proxyHeader: js.UndefOr[String] = js.undefined
  
  /**
    * The application data to send once the TCP connection has been established (default value is empty). If both request and response are empty, the connection establishment alone will
    * indicate health. The request data can only be ASCII.
    */
  var request: js.UndefOr[String] = js.undefined
  
  /** The bytes to match against the beginning of the response data. If left empty (the default value), any response will indicate health. The response data can only be ASCII. */
  var response: js.UndefOr[String] = js.undefined
}
object TCPHealthCheck {
  
  inline def apply(): TCPHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TCPHealthCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TCPHealthCheck] (val x: Self) extends AnyVal {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    inline def setPortSpecification(value: String): Self = StObject.set(x, "portSpecification", value.asInstanceOf[js.Any])
    
    inline def setPortSpecificationUndefined: Self = StObject.set(x, "portSpecification", js.undefined)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProxyHeader(value: String): Self = StObject.set(x, "proxyHeader", value.asInstanceOf[js.Any])
    
    inline def setProxyHeaderUndefined: Self = StObject.set(x, "proxyHeader", js.undefined)
    
    inline def setRequest(value: String): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponse(value: String): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "response", js.undefined)
  }
}
