package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGRPCHealthCheck extends StObject {
  
  /**
    * The gRPC service name for the health check. This field is optional. The value of grpc_service_name has the following meanings by convention: - Empty service_name means the overall status of all services at the backend. - Non-empty service_name means the health of that gRPC service, as defined by the owner of the service. The grpc_service_name can only be ASCII.
    */
  var grpcServiceName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The port number for the health check request. Must be specified if port_name and port_specification are not set or if port_specification is USE_FIXED_PORT. Valid values are 1 through 65535.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Port name as defined in InstanceGroup#NamedPort#name. If both port and port_name are defined, port takes precedence. The port_name should conform to RFC1035.
    */
  var portName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies how port is selected for health checking, can be one of following values: USE_FIXED_PORT: The port number in port is used for health checking. USE_NAMED_PORT: The portName is used for health checking. USE_SERVING_PORT: For NetworkEndpointGroup, the port specified for each network endpoint is used for health checking. For other backends, the port or named port specified in the Backend Service is used for health checking. If not specified, gRPC health check follows behavior specified in port and portName fields.
    */
  var portSpecification: js.UndefOr[String | Null] = js.undefined
}
object SchemaGRPCHealthCheck {
  
  inline def apply(): SchemaGRPCHealthCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGRPCHealthCheck]
  }
  
  extension [Self <: SchemaGRPCHealthCheck](x: Self) {
    
    inline def setGrpcServiceName(value: String): Self = StObject.set(x, "grpcServiceName", value.asInstanceOf[js.Any])
    
    inline def setGrpcServiceNameNull: Self = StObject.set(x, "grpcServiceName", null)
    
    inline def setGrpcServiceNameUndefined: Self = StObject.set(x, "grpcServiceName", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setPortNameNull: Self = StObject.set(x, "portName", null)
    
    inline def setPortNameUndefined: Self = StObject.set(x, "portName", js.undefined)
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortSpecification(value: String): Self = StObject.set(x, "portSpecification", value.asInstanceOf[js.Any])
    
    inline def setPortSpecificationNull: Self = StObject.set(x, "portSpecification", null)
    
    inline def setPortSpecificationUndefined: Self = StObject.set(x, "portSpecification", js.undefined)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
