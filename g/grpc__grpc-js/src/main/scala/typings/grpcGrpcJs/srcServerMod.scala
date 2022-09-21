package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.channelOptionsMod.ChannelOptions
import typings.grpcGrpcJs.channelzMod.ServerRef
import typings.grpcGrpcJs.makeClientMod.Deserialize
import typings.grpcGrpcJs.makeClientMod.Serialize
import typings.grpcGrpcJs.serverCallMod.HandleCall
import typings.grpcGrpcJs.serverCredentialsMod.ServerCredentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcServerMod {
  
  @JSImport("@grpc/grpc-js/build/src/server", "Server")
  @js.native
  open class Server () extends StObject {
    def this(options: ChannelOptions) = this()
    
    /* private */ var _setupHandlers: Any = js.native
    
    def addHttp2Port(): scala.Nothing = js.native
    
    def addProtoService(): scala.Nothing = js.native
    
    def addService(service: js.Object, implementation: UntypedServiceImplementation): Unit = js.native
    
    def bind(port: String, creds: ServerCredentials): scala.Nothing = js.native
    
    def bindAsync(
      port: String,
      creds: ServerCredentials,
      callback: js.Function2[/* error */ js.Error | Null, /* port */ Double, Unit]
    ): Unit = js.native
    
    /* private */ var callTracker: Any = js.native
    
    /* private */ val channelzEnabled: Any = js.native
    
    /* private */ var channelzRef: Any = js.native
    
    /* private */ var channelzTrace: Any = js.native
    
    def forceShutdown(): Unit = js.native
    
    /* private */ var getChannelzInfo: Any = js.native
    
    /**
      * Get the channelz reference object for this server. The returned value is
      * garbage if channelz is disabled for this server.
      * @returns
      */
    def getChannelzRef(): ServerRef = js.native
    
    /* private */ var getChannelzSessionInfoGetter: Any = js.native
    
    /* private */ var handlers: Any = js.native
    
    /* private */ var http2ServerList: Any = js.native
    
    /* private */ var listenerChildrenTracker: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def register[RequestType, ResponseType](
      name: String,
      handler: HandleCall[RequestType, ResponseType],
      serialize: Serialize[ResponseType],
      deserialize: Deserialize[RequestType],
      `type`: String
    ): Boolean = js.native
    
    def removeService(service: js.Object): Unit = js.native
    
    /* private */ var sessionChildrenTracker: Any = js.native
    
    /* private */ var sessions: Any = js.native
    
    def start(): Unit = js.native
    
    /* private */ var started: Any = js.native
    
    /* private */ var trace: Any = js.native
    
    def tryShutdown(callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def unregister(name: String): Boolean = js.native
  }
  
  type UntypedHandleCall = HandleCall[Any, Any]
  
  type UntypedServiceImplementation = StringDictionary[UntypedHandleCall]
}
