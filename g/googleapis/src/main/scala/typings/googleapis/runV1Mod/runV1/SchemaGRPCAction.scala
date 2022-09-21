package typings.googleapis.runV1Mod.runV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGRPCAction extends StObject {
  
  /**
    * Port number of the gRPC service. Number must be in the range 1 to 65535.
    */
  var port: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Service is the name of the service to place in the gRPC HealthCheckRequest (see https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the default behavior is defined by gRPC.
    */
  var service: js.UndefOr[String | Null] = js.undefined
}
object SchemaGRPCAction {
  
  inline def apply(): SchemaGRPCAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGRPCAction]
  }
  
  extension [Self <: SchemaGRPCAction](x: Self) {
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortNull: Self = StObject.set(x, "port", null)
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceNull: Self = StObject.set(x, "service", null)
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
