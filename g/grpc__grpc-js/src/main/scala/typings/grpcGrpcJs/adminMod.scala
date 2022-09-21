package typings.grpcGrpcJs

import typings.grpcGrpcJs.srcServerMod.Server
import typings.grpcGrpcJs.srcServerMod.UntypedServiceImplementation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adminMod {
  
  @JSImport("@grpc/grpc-js/build/src/admin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addAdminServicesToServer(server: Server): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addAdminServicesToServer")(server.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerAdminService(getServiceDefinition: GetServiceDefinition, getHandlers: GetHandlers): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerAdminService")(getServiceDefinition.asInstanceOf[js.Any], getHandlers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type GetHandlers = js.Function0[UntypedServiceImplementation]
  
  type GetServiceDefinition = js.Function0[js.Object]
}
