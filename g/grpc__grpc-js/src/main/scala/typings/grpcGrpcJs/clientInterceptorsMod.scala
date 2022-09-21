package typings.grpcGrpcJs

import typings.grpcGrpcJs.anon.PartialInterceptingListen
import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.callStreamMod.InterceptingListener
import typings.grpcGrpcJs.callStreamMod.Listener
import typings.grpcGrpcJs.callStreamMod.MessageContext
import typings.grpcGrpcJs.callStreamMod.MessageListener
import typings.grpcGrpcJs.callStreamMod.MetadataListener
import typings.grpcGrpcJs.callStreamMod.StatusListener
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.clientMod.CallOptions
import typings.grpcGrpcJs.constantsMod.Status
import typings.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientInterceptorsMod {
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "InterceptingCall")
  @js.native
  open class InterceptingCall protected ()
    extends StObject
       with InterceptingCallInterface {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
    
    /* private */ var nextCall: Any = js.native
    
    /**
      * Indicates that a status was received but could not be propagated because
      * a message was still being processed.
      */
    /* private */ var pendingHalfClose: Any = js.native
    
    /* private */ var pendingMessage: Any = js.native
    
    /**
      * Message context for a pending message that is waiting for
      */
    /* private */ var pendingMessageContext: Any = js.native
    
    /* private */ var processPendingHalfClose: Any = js.native
    
    /* private */ var processPendingMessage: Any = js.native
    
    /**
      * Indicates that a message has been passed to the requester's sendMessage
      * method but it has not been passed to the corresponding next callback
      */
    /* private */ var processingMessage: Any = js.native
    
    /**
      * Indicates that metadata has been passed to the requester's start
      * method but it has not been passed to the corresponding next callback
      */
    /* private */ var processingMetadata: Any = js.native
    
    /**
      * The requester that this InterceptingCall uses to modify outgoing operations
      */
    /* private */ var requester: Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "InterceptorConfigurationError")
  @js.native
  open class InterceptorConfigurationError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "ListenerBuilder")
  @js.native
  open class ListenerBuilder () extends StObject {
    
    def build(): Listener = js.native
    
    /* private */ var message: Any = js.native
    
    /* private */ var metadata: Any = js.native
    
    /* private */ var status: Any = js.native
    
    def withOnReceiveMessage(onReceiveMessage: MessageListener): this.type = js.native
    
    def withOnReceiveMetadata(onReceiveMetadata: MetadataListener): this.type = js.native
    
    def withOnReceiveStatus(onReceiveStatus: StatusListener): this.type = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "RequesterBuilder")
  @js.native
  open class RequesterBuilder () extends StObject {
    
    def build(): Requester = js.native
    
    /* private */ var cancel: Any = js.native
    
    /* private */ var halfClose: Any = js.native
    
    /* private */ var message: Any = js.native
    
    /* private */ var start: Any = js.native
    
    def withCancel(cancel: CancelRequester): this.type = js.native
    
    def withHalfClose(halfClose: CloseRequester): this.type = js.native
    
    def withSendMessage(sendMessage: MessageRequester): this.type = js.native
    
    def withStart(start: MetadataRequester): this.type = js.native
  }
  
  inline def getInterceptingCall(
    interceptorArgs: InterceptorArguments,
    methodDefinition: ClientMethodDefinition[Any, Any],
    options: CallOptions,
    channel: Channel
  ): InterceptingCallInterface = (^.asInstanceOf[js.Dynamic].applyDynamic("getInterceptingCall")(interceptorArgs.asInstanceOf[js.Any], methodDefinition.asInstanceOf[js.Any], options.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[InterceptingCallInterface]
  
  type CancelRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  
  type CloseRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  
  trait FullRequester extends StObject {
    
    def cancel(next: js.Function0[Unit]): Unit
    @JSName("cancel")
    var cancel_Original: CancelRequester
    
    def halfClose(next: js.Function0[Unit]): Unit
    @JSName("halfClose")
    var halfClose_Original: CloseRequester
    
    def sendMessage(message: Any, next: js.Function1[/* message */ Any, Unit]): Unit
    @JSName("sendMessage")
    var sendMessage_Original: MessageRequester
    
    def start(
      metadata: Metadata,
      listener: InterceptingListener,
      next: js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]
    ): Unit
    @JSName("start")
    var start_Original: MetadataRequester
  }
  object FullRequester {
    
    inline def apply(
      cancel: /* next */ js.Function0[Unit] => Unit,
      halfClose: /* next */ js.Function0[Unit] => Unit,
      sendMessage: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit,
      start: (/* metadata */ Metadata, /* listener */ InterceptingListener, /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]) => Unit
    ): FullRequester = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), halfClose = js.Any.fromFunction1(halfClose), sendMessage = js.Any.fromFunction2(sendMessage), start = js.Any.fromFunction3(start))
      __obj.asInstanceOf[FullRequester]
    }
    
    extension [Self <: FullRequester](x: Self) {
      
      inline def setCancel(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setHalfClose(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction1(value))
      
      inline def setSendMessage(value: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
      
      inline def setStart(
        value: (/* metadata */ Metadata, /* listener */ InterceptingListener, /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]) => Unit
      ): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait InterceptingCallInterface extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    def getPeer(): String = js.native
    
    def halfClose(): Unit = js.native
    
    def sendMessage(message: Any): Unit = js.native
    
    def sendMessageWithContext(context: MessageContext, message: Any): Unit = js.native
    
    def setCredentials(credentials: CallCredentials): Unit = js.native
    
    def start(metadata: Metadata): Unit = js.native
    def start(metadata: Metadata, listener: PartialInterceptingListen): Unit = js.native
    
    def startRead(): Unit = js.native
  }
  
  type Interceptor = js.Function2[/* options */ InterceptorOptions, /* nextCall */ NextCall, InterceptingCall]
  
  trait InterceptorArguments extends StObject {
    
    var callInterceptorProviders: js.Array[InterceptorProvider]
    
    var callInterceptors: js.Array[Interceptor]
    
    var clientInterceptorProviders: js.Array[InterceptorProvider]
    
    var clientInterceptors: js.Array[Interceptor]
  }
  object InterceptorArguments {
    
    inline def apply(
      callInterceptorProviders: js.Array[InterceptorProvider],
      callInterceptors: js.Array[Interceptor],
      clientInterceptorProviders: js.Array[InterceptorProvider],
      clientInterceptors: js.Array[Interceptor]
    ): InterceptorArguments = {
      val __obj = js.Dynamic.literal(callInterceptorProviders = callInterceptorProviders.asInstanceOf[js.Any], callInterceptors = callInterceptors.asInstanceOf[js.Any], clientInterceptorProviders = clientInterceptorProviders.asInstanceOf[js.Any], clientInterceptors = clientInterceptors.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptorArguments]
    }
    
    extension [Self <: InterceptorArguments](x: Self) {
      
      inline def setCallInterceptorProviders(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "callInterceptorProviders", value.asInstanceOf[js.Any])
      
      inline def setCallInterceptorProvidersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "callInterceptorProviders", js.Array(value*))
      
      inline def setCallInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "callInterceptors", value.asInstanceOf[js.Any])
      
      inline def setCallInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "callInterceptors", js.Array(value*))
      
      inline def setClientInterceptorProviders(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "clientInterceptorProviders", value.asInstanceOf[js.Any])
      
      inline def setClientInterceptorProvidersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "clientInterceptorProviders", js.Array(value*))
      
      inline def setClientInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "clientInterceptors", value.asInstanceOf[js.Any])
      
      inline def setClientInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "clientInterceptors", js.Array(value*))
    }
  }
  
  trait InterceptorOptions
    extends StObject
       with CallOptions {
    
    var method_definition: ClientMethodDefinition[Any, Any]
  }
  object InterceptorOptions {
    
    inline def apply(method_definition: ClientMethodDefinition[Any, Any]): InterceptorOptions = {
      val __obj = js.Dynamic.literal(method_definition = method_definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptorOptions]
    }
    
    extension [Self <: InterceptorOptions](x: Self) {
      
      inline def setMethod_definition(value: ClientMethodDefinition[Any, Any]): Self = StObject.set(x, "method_definition", value.asInstanceOf[js.Any])
    }
  }
  
  type InterceptorProvider = js.Function1[/* methodDefinition */ ClientMethodDefinition[Any, Any], Interceptor]
  
  type MessageRequester = js.Function2[/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit], Unit]
  
  type MetadataRequester = js.Function3[
    /* metadata */ Metadata, 
    /* listener */ InterceptingListener, 
    /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit], 
    Unit
  ]
  
  type NextCall = js.Function1[/* options */ InterceptorOptions, InterceptingCallInterface]
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.FullRequester> */
  trait Requester extends StObject {
    
    var cancel: js.UndefOr[CancelRequester] = js.undefined
    
    var halfClose: js.UndefOr[CloseRequester] = js.undefined
    
    var sendMessage: js.UndefOr[MessageRequester] = js.undefined
    
    var start: js.UndefOr[MetadataRequester] = js.undefined
  }
  object Requester {
    
    inline def apply(): Requester = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Requester]
    }
    
    extension [Self <: Requester](x: Self) {
      
      inline def setCancel(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setHalfClose(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction1(value))
      
      inline def setHalfCloseUndefined: Self = StObject.set(x, "halfClose", js.undefined)
      
      inline def setSendMessage(value: (/* message */ Any, /* next */ js.Function1[/* message */ Any, Unit]) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
      
      inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
      
      inline def setStart(
        value: (/* metadata */ Metadata, /* listener */ InterceptingListener, /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]) => Unit
      ): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
