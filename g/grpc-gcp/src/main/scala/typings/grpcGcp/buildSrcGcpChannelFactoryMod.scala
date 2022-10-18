package typings.grpcGcp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.grpcGcp.anon.TypeofCallCredentials
import typings.grpcGcp.anon.TypeofChannelCredentials
import typings.grpcGcp.anon.TypeofMetadata
import typings.grpcGcp.anon.TypeofServerCredentials
import typings.grpcGcp.anon.Typeofcredentials
import typings.grpcGcp.anon.Typeofexperimental
import typings.grpcGcp.buildSrcChannelRefMod.ChannelRef
import typings.grpcGcp.buildSrcGeneratedGrpcGcpMod.grpc.gcp.IAffinityConfig
import typings.grpcGrpcJs.anon.PartialConsole
import typings.grpcGrpcJs.buildSrcChannelMod.Channel
import typings.grpcGrpcJs.buildSrcChannelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.buildSrcClientInterceptorsMod.InterceptingCallInterface
import typings.grpcGrpcJs.buildSrcClientMod.Client
import typings.grpcGrpcJs.buildSrcConstantsMod.LogVerbosity
import typings.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typings.grpcGrpcJs.buildSrcMakeClientMod.PackageDefinition
import typings.grpcGrpcJs.buildSrcMakeClientMod.ServiceClientConstructor
import typings.grpcGrpcJs.buildSrcServerMod.Server
import typings.grpcGrpcJs.mod.ChannelCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGcpChannelFactoryMod {
  
  @JSImport("grpc-gcp/build/src/gcp_channel_factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGcpChannelFactoryClass(grpc: GrpcModule): GcpChannelFactoryConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("getGcpChannelFactoryClass")(grpc.asInstanceOf[js.Any]).asInstanceOf[GcpChannelFactoryConstructor]
  
  @js.native
  trait GcpChannelFactoryConstructor
    extends StObject
       with Instantiable3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ Any, 
          GcpChannelFactoryInterface
        ]
  
  @js.native
  trait GcpChannelFactoryInterface
    extends StObject
       with Channel {
    
    def bind(channelRef: ChannelRef, affinityKey: String): Unit = js.native
    
    def getAffinityConfig(methodName: String): IAffinityConfig = js.native
    
    def getChannelRef(): ChannelRef = js.native
    def getChannelRef(affinityKey: String): ChannelRef = js.native
    
    def shouldRequestDebugHeaders(): Boolean = js.native
    def shouldRequestDebugHeaders(lastRequested: js.Date): Boolean = js.native
    
    def unbind(): Unit = js.native
    def unbind(boundKey: String): Unit = js.native
  }
  
  @js.native
  trait GrpcModule extends StObject {
    
    var CallCredentials: TypeofCallCredentials = js.native
    
    var Channel: Instantiable3[
        /* target */ String, 
        /* credentials */ typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
        /* options */ ChannelOptions, 
        typings.grpcGrpcJs.mod.Channel
      ] = js.native
    
    var ChannelCredentials: TypeofChannelCredentials = js.native
    
    var Client: Instantiable2[
        /* address */ String, 
        /* credentials */ typings.grpcGrpcJs.buildSrcChannelCredentialsMod.ChannelCredentials, 
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
    
    def getChannelzHandlers(): Any = js.native
    
    def getChannelzServiceDefinition(): Any = js.native
    
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
