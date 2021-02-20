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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientInterceptorsMod {
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "InterceptingCall")
  @js.native
  class InterceptingCall protected () extends InterceptingCallInterface {
    def this(nextCall: InterceptingCallInterface) = this()
    def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
    
    var nextCall: js.Any = js.native
    
    /**
      * Indicates that a status was received but could not be propagated because
      * a message was still being processed.
      */
    var pendingHalfClose: js.Any = js.native
    
    /**
      * Indicates that a message has been passed to the listener's onReceiveMessage
      * method it has not been passed to the corresponding next callback
      */
    var processingMessage: js.Any = js.native
    
    /**
      * The requester that this InterceptingCall uses to modify outgoing operations
      */
    var requester: js.Any = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "InterceptorConfigurationError")
  @js.native
  class InterceptorConfigurationError protected () extends Error {
    def this(message: String) = this()
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "ListenerBuilder")
  @js.native
  class ListenerBuilder () extends StObject {
    
    def build(): Listener = js.native
    
    var message: js.Any = js.native
    
    var metadata: js.Any = js.native
    
    var status: js.Any = js.native
    
    def withOnReceiveMessage(onReceiveMessage: MessageListener): this.type = js.native
    
    def withOnReceiveMetadata(onReceiveMetadata: MetadataListener): this.type = js.native
    
    def withOnReceiveStatus(onReceiveStatus: StatusListener): this.type = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "RequesterBuilder")
  @js.native
  class RequesterBuilder () extends StObject {
    
    def build(): Requester = js.native
    
    var cancel: js.Any = js.native
    
    var halfClose: js.Any = js.native
    
    var message: js.Any = js.native
    
    var start: js.Any = js.native
    
    def withCancel(cancel: CancelRequester): this.type = js.native
    
    def withHalfClose(halfClose: CloseRequester): this.type = js.native
    
    def withSendMessage(sendMessage: MessageRequester): this.type = js.native
    
    def withStart(start: MetadataRequester): this.type = js.native
  }
  
  @JSImport("@grpc/grpc-js/build/src/client-interceptors", "getInterceptingCall")
  @js.native
  def getInterceptingCall(
    interceptorArgs: InterceptorArguments,
    methodDefinition: ClientMethodDefinition[_, _],
    options: CallOptions,
    channel: Channel
  ): InterceptingCallInterface = js.native
  
  type CancelRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  
  type CloseRequester = js.Function1[/* next */ js.Function0[Unit], Unit]
  
  @js.native
  trait FullRequester extends StObject {
    
    def cancel(next: js.Function0[Unit]): Unit = js.native
    @JSName("cancel")
    var cancel_Original: CancelRequester = js.native
    
    def halfClose(next: js.Function0[Unit]): Unit = js.native
    @JSName("halfClose")
    var halfClose_Original: CloseRequester = js.native
    
    def sendMessage(message: js.Any, next: js.Function1[/* message */ js.Any, Unit]): Unit = js.native
    @JSName("sendMessage")
    var sendMessage_Original: MessageRequester = js.native
    
    def start(
      metadata: Metadata,
      listener: InterceptingListener,
      next: js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]
    ): Unit = js.native
    @JSName("start")
    var start_Original: MetadataRequester = js.native
  }
  
  @js.native
  trait InterceptingCallInterface extends StObject {
    
    def cancelWithStatus(status: Status, details: String): Unit = js.native
    
    def getPeer(): String = js.native
    
    def halfClose(): Unit = js.native
    
    def sendMessage(message: js.Any): Unit = js.native
    
    def sendMessageWithContext(context: MessageContext, message: js.Any): Unit = js.native
    
    def setCredentials(credentials: CallCredentials): Unit = js.native
    
    def start(metadata: Metadata): Unit = js.native
    def start(metadata: Metadata, listener: PartialInterceptingListen): Unit = js.native
    
    def startRead(): Unit = js.native
  }
  
  type Interceptor = js.Function2[/* options */ InterceptorOptions, /* nextCall */ NextCall, InterceptingCall]
  
  @js.native
  trait InterceptorArguments extends StObject {
    
    var callInterceptorProviders: js.Array[InterceptorProvider] = js.native
    
    var callInterceptors: js.Array[Interceptor] = js.native
    
    var clientInterceptorProviders: js.Array[InterceptorProvider] = js.native
    
    var clientInterceptors: js.Array[Interceptor] = js.native
  }
  object InterceptorArguments {
    
    @scala.inline
    def apply(
      callInterceptorProviders: js.Array[InterceptorProvider],
      callInterceptors: js.Array[Interceptor],
      clientInterceptorProviders: js.Array[InterceptorProvider],
      clientInterceptors: js.Array[Interceptor]
    ): InterceptorArguments = {
      val __obj = js.Dynamic.literal(callInterceptorProviders = callInterceptorProviders.asInstanceOf[js.Any], callInterceptors = callInterceptors.asInstanceOf[js.Any], clientInterceptorProviders = clientInterceptorProviders.asInstanceOf[js.Any], clientInterceptors = clientInterceptors.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptorArguments]
    }
    
    @scala.inline
    implicit class InterceptorArgumentsMutableBuilder[Self <: InterceptorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallInterceptorProviders(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "callInterceptorProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallInterceptorProvidersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "callInterceptorProviders", js.Array(value :_*))
      
      @scala.inline
      def setCallInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "callInterceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "callInterceptors", js.Array(value :_*))
      
      @scala.inline
      def setClientInterceptorProviders(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "clientInterceptorProviders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInterceptorProvidersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "clientInterceptorProviders", js.Array(value :_*))
      
      @scala.inline
      def setClientInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "clientInterceptors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "clientInterceptors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InterceptorOptions extends CallOptions {
    
    var method_definition: ClientMethodDefinition[_, _] = js.native
  }
  object InterceptorOptions {
    
    @scala.inline
    def apply(method_definition: ClientMethodDefinition[_, _]): InterceptorOptions = {
      val __obj = js.Dynamic.literal(method_definition = method_definition.asInstanceOf[js.Any])
      __obj.asInstanceOf[InterceptorOptions]
    }
    
    @scala.inline
    implicit class InterceptorOptionsMutableBuilder[Self <: InterceptorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod_definition(value: ClientMethodDefinition[_, _]): Self = StObject.set(x, "method_definition", value.asInstanceOf[js.Any])
    }
  }
  
  type InterceptorProvider = js.Function1[/* methodDefinition */ ClientMethodDefinition[js.Any, js.Any], Interceptor]
  
  type MessageRequester = js.Function2[/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit], Unit]
  
  type MetadataRequester = js.Function3[
    /* metadata */ Metadata, 
    /* listener */ InterceptingListener, 
    /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit], 
    Unit
  ]
  
  type NextCall = js.Function1[/* options */ InterceptorOptions, InterceptingCallInterface]
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.FullRequester> */
  @js.native
  trait Requester extends StObject {
    
    var cancel: js.UndefOr[CancelRequester] = js.native
    
    var halfClose: js.UndefOr[CloseRequester] = js.native
    
    var sendMessage: js.UndefOr[MessageRequester] = js.native
    
    var start: js.UndefOr[MetadataRequester] = js.native
  }
  object Requester {
    
    @scala.inline
    def apply(): Requester = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Requester]
    }
    
    @scala.inline
    implicit class RequesterMutableBuilder[Self <: Requester] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setHalfClose(value: /* next */ js.Function0[Unit] => Unit): Self = StObject.set(x, "halfClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHalfCloseUndefined: Self = StObject.set(x, "halfClose", js.undefined)
      
      @scala.inline
      def setSendMessage(value: (/* message */ js.Any, /* next */ js.Function1[/* message */ js.Any, Unit]) => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
      
      @scala.inline
      def setStart(
        value: (/* metadata */ Metadata, /* listener */ InterceptingListener, /* next */ js.Function2[/* metadata */ Metadata, /* listener */ InterceptingListener | Listener, Unit]) => Unit
      ): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
