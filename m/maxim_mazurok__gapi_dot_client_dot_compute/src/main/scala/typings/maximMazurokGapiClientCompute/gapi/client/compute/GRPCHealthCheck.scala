package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GRPCHealthCheck extends StObject {
  
  /**
    * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention:
    * - Empty service_name means the overall status of all services at the backend.
    * - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service.
    * The grpc_service_name can only be ASCII.
    */
  var grpcServiceName: js.UndefOr[String] = js.native
  
  /**
    * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1
    * through 65535.
    */
  var port: js.UndefOr[Double] = js.native
  
  /** Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035. */
  var portName: js.UndefOr[String] = js.native
  
  /**
    * Specifies how port is selected for health checking, can be one of following values:
    * USE_FIXED_PORT: The port number in port is used for health checking.
    * USE_NAMED_PORT: The portName is used for health checking.
    * USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the
    * Backend Service is used for health checking.
    *
    *
    * If not specified, gRPC health check follows behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String] = js.native
}
object GRPCHealthCheck {
  
  @scala.inline
  def apply(): GRPCHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GRPCHealthCheck]
  }
  
  @scala.inline
  implicit class GRPCHealthCheckMutableBuilder[Self <: GRPCHealthCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGrpcServiceName(value: String): Self = StObject.set(x, "grpcServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrpcServiceNameUndefined: Self = StObject.set(x, "grpcServiceName", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    @scala.inline
    def setPortSpecification(value: String): Self = StObject.set(x, "portSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortSpecificationUndefined: Self = StObject.set(x, "portSpecification", js.undefined)
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
