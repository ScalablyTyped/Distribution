package typings.grpcGcp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.grpcGcp.anon.CreateGcpApiConfig
import typings.grpcGcp.anon.TypeofCallCredentials
import typings.grpcGcp.anon.TypeofChannelCredentials
import typings.grpcGcp.anon.TypeofMetadata
import typings.grpcGcp.anon.TypeofServerCredentials
import typings.grpcGcp.anon.Typeofcredentials
import typings.grpcGcp.anon.Typeofexperimental
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.clientMod.Client
import typings.grpcGrpcJs.constantsMod.LogVerbosity
import typings.grpcGrpcJs.makeClientMod.GrpcObject
import typings.grpcGrpcJs.makeClientMod.PackageDefinition
import typings.grpcGrpcJs.makeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.srcServerMod.Server
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzDefinition
import typings.grpcGrpcJs.v1ChannelzMod.ChannelzHandlers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(grpc: GrpcModule): CreateGcpApiConfig = ^.asInstanceOf[js.Dynamic].apply(grpc.asInstanceOf[js.Any]).asInstanceOf[CreateGcpApiConfig]
  
  @JSImport("grpc-gcp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait GrpcModule extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ ChannelCredentials, 
        /* options */ ChannelOptions, 
        typings.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ ChannelCredentials, 
        typings.grpcGrpcJs.mod.Client
      ] = js.native
    
    var InterceptingCall: Instantiable1[/* nextCall */ InterceptingCallInterface, typings.grpcGrpcJs.mod.InterceptingCall] = js.native
    
    var InterceptorConfigurationError: Instantiable1[/* message */ String, typings.grpcGrpcJs.mod.InterceptorConfigurationError] = js.native
    
    var ListenerBuilder: Instantiable0[typings.grpcGrpcJs.mod.ListenerBuilder] = js.native
    
    var Metadata: TypeofMetadata = js.native
    
    var RequesterBuilder: Instantiable0[typings.grpcGrpcJs.mod.RequesterBuilder] = js.native
    
    var Server: Instantiable0[typings.grpcGrpcJs.mod.Server] = js.native
    
    var ServerCredentials: TypeofServerCredentials = js.native
    
    var StatusBuilder: Instantiable0[typings.grpcGrpcJs.mod.StatusBuilder] = js.native
    
    def addAdminServicesToServer(server: Server): Unit = js.native
    
    def closeClient(client: Client): Unit = js.native
    
    val credentials: Typeofcredentials = js.native
    
    val experimental: Typeofexperimental = js.native
    
    def getChannelzHandlers(): ChannelzHandlers = js.native
    
    def getChannelzServiceDefinition(): ChannelzDefinition = js.native
    
    def getClientChannel(client: Client): Channel = js.native
    
    def load(filename: Any, format: Any, options: Any): scala.Nothing = js.native
    
    def loadObject(value: Any, options: Any): scala.Nothing = js.native
    
    def loadPackageDefinition(packageDef: PackageDefinition): GrpcObject = js.native
    
    def makeClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def makeGenericClientConstructor(methods: js.Object, serviceName: String): ServiceClientConstructor = js.native
    def makeGenericClientConstructor(methods: js.Object, serviceName: String, classOptions: js.Object): ServiceClientConstructor = js.native
    
    def setLogVerbosity(verbosity: LogVerbosity): Unit = js.native
    
    def setLogger(logger: PartialConsole): Unit = js.native
    
    def waitForClientReady(client: Client, deadline: js.Date, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    def waitForClientReady(client: Client, deadline: Double, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
  }
}
