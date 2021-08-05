package typings.grpcGrpcJs

import typings.grpcGrpcJs.callCredentialsMod.CallCredentials
import typings.grpcGrpcJs.callMod.ClientDuplexStream
import typings.grpcGrpcJs.callMod.ClientReadableStream
import typings.grpcGrpcJs.callMod.ClientUnaryCall
import typings.grpcGrpcJs.callMod.ClientWritableStream
import typings.grpcGrpcJs.callMod.ServiceError
import typings.grpcGrpcJs.callMod.SurfaceCall
import typings.grpcGrpcJs.callStreamMod.Deadline
import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.clientInterceptorsMod.Interceptor
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptorProvider
import typings.grpcGrpcJs.makeClientMod.ClientMethodDefinition
import typings.grpcGrpcJs.metadataMod.Metadata
import typings.grpcGrpcJs.serverCallMod.ServerDuplexStream
import typings.grpcGrpcJs.serverCallMod.ServerReadableStream
import typings.grpcGrpcJs.serverCallMod.ServerUnaryCall
import typings.grpcGrpcJs.serverCallMod.ServerWritableStream
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
  @JSImport("@grpc/grpc-js/build/src/client", "Client")
  @js.native
  class Client protected () extends StObject {
    def this(address: String, credentials: ChannelCredentials) = this()
    def this(address: String, credentials: ChannelCredentials, options: ClientOptions) = this()
    
    /* private */ var checkMetadataAndOptions: js.Any = js.native
    
    /* private */ var checkOptionalUnaryResponseArguments: js.Any = js.native
    
    def close(): Unit = js.native
    
    def getChannel(): Channel = js.native
    
    def makeBidiStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType]
    ): ClientDuplexStream[RequestType, ResponseType] = js.native
    def makeBidiStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      metadata: Metadata
    ): ClientDuplexStream[RequestType, ResponseType] = js.native
    def makeBidiStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      metadata: Metadata,
      options: CallOptions
    ): ClientDuplexStream[RequestType, ResponseType] = js.native
    def makeBidiStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      options: CallOptions
    ): ClientDuplexStream[RequestType, ResponseType] = js.native
    
    def makeClientStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      callback: UnaryCallback[ResponseType]
    ): ClientWritableStream[RequestType] = js.native
    def makeClientStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      metadata: Metadata,
      callback: UnaryCallback[ResponseType]
    ): ClientWritableStream[RequestType] = js.native
    def makeClientStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[ResponseType]
    ): ClientWritableStream[RequestType] = js.native
    def makeClientStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      options: CallOptions,
      callback: UnaryCallback[ResponseType]
    ): ClientWritableStream[RequestType] = js.native
    
    def makeServerStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType
    ): ClientReadableStream[ResponseType] = js.native
    def makeServerStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      metadata: Metadata
    ): ClientReadableStream[ResponseType] = js.native
    def makeServerStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      metadata: Metadata,
      options: CallOptions
    ): ClientReadableStream[ResponseType] = js.native
    def makeServerStreamRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      options: CallOptions
    ): ClientReadableStream[ResponseType] = js.native
    
    def makeUnaryRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      callback: UnaryCallback[ResponseType]
    ): ClientUnaryCall = js.native
    def makeUnaryRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      metadata: Metadata,
      callback: UnaryCallback[ResponseType]
    ): ClientUnaryCall = js.native
    def makeUnaryRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      metadata: Metadata,
      options: CallOptions,
      callback: UnaryCallback[ResponseType]
    ): ClientUnaryCall = js.native
    def makeUnaryRequest[RequestType, ResponseType](
      method: String,
      serialize: js.Function1[/* value */ RequestType, Buffer],
      deserialize: js.Function1[/* value */ Buffer, ResponseType],
      argument: RequestType,
      options: CallOptions,
      callback: UnaryCallback[ResponseType]
    ): ClientUnaryCall = js.native
    
    def waitForReady(deadline: Deadline, callback: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  }
  
  type CallInvocationTransformer = js.Function1[
    /* callProperties */ CallProperties[js.Any, js.Any], 
    CallProperties[js.Any, js.Any]
  ]
  
  trait CallOptions extends StObject {
    
    var credentials: js.UndefOr[CallCredentials] = js.undefined
    
    var deadline: js.UndefOr[Deadline] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.undefined
    
    var interceptors: js.UndefOr[js.Array[Interceptor]] = js.undefined
    
    var parent: js.UndefOr[
        (ServerUnaryCall[js.Any, js.Any]) | (ServerReadableStream[js.Any, js.Any]) | (ServerWritableStream[js.Any, js.Any]) | (ServerDuplexStream[js.Any, js.Any])
      ] = js.undefined
    
    var propagate_flags: js.UndefOr[Double] = js.undefined
  }
  object CallOptions {
    
    inline def apply(): CallOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallOptions]
    }
    
    extension [Self <: CallOptions](x: Self) {
      
      inline def setCredentials(value: CallCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDeadline(value: Deadline): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
      
      inline def setDeadlineUndefined: Self = StObject.set(x, "deadline", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setInterceptor_providers(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "interceptor_providers", value.asInstanceOf[js.Any])
      
      inline def setInterceptor_providersUndefined: Self = StObject.set(x, "interceptor_providers", js.undefined)
      
      inline def setInterceptor_providersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "interceptor_providers", js.Array(value :_*))
      
      inline def setInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      inline def setInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
      
      inline def setParent(
        value: (ServerUnaryCall[js.Any, js.Any]) | (ServerReadableStream[js.Any, js.Any]) | (ServerWritableStream[js.Any, js.Any]) | (ServerDuplexStream[js.Any, js.Any])
      ): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPropagate_flags(value: Double): Self = StObject.set(x, "propagate_flags", value.asInstanceOf[js.Any])
      
      inline def setPropagate_flagsUndefined: Self = StObject.set(x, "propagate_flags", js.undefined)
    }
  }
  
  trait CallProperties[RequestType, ResponseType] extends StObject {
    
    var argument: js.UndefOr[RequestType] = js.undefined
    
    var call: SurfaceCall
    
    var callOptions: CallOptions
    
    var callback: js.UndefOr[UnaryCallback[ResponseType]] = js.undefined
    
    var channel: Channel
    
    var metadata: Metadata
    
    var methodDefinition: ClientMethodDefinition[RequestType, ResponseType]
  }
  object CallProperties {
    
    inline def apply[RequestType, ResponseType](
      call: SurfaceCall,
      callOptions: CallOptions,
      channel: Channel,
      metadata: Metadata,
      methodDefinition: ClientMethodDefinition[RequestType, ResponseType]
    ): CallProperties[RequestType, ResponseType] = {
      val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], callOptions = callOptions.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], methodDefinition = methodDefinition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallProperties[RequestType, ResponseType]]
    }
    
    extension [Self <: CallProperties[?, ?], RequestType, ResponseType](x: Self & (CallProperties[RequestType, ResponseType])) {
      
      inline def setArgument(value: RequestType): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
      
      inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
      
      inline def setCall(value: SurfaceCall): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
      
      inline def setCallOptions(value: CallOptions): Self = StObject.set(x, "callOptions", value.asInstanceOf[js.Any])
      
      inline def setCallback(value: (/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType]) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMethodDefinition(value: ClientMethodDefinition[RequestType, ResponseType]): Self = StObject.set(x, "methodDefinition", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> & {  channelOverride :@grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel | undefined,   channelFactoryOverride :(address : string, credentials : @grpc/grpc-js.@grpc/grpc-js/build/src/channel-credentials.ChannelCredentials, options : @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions): @grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel | undefined,   interceptors :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.Interceptor> | undefined,   interceptor_providers :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.InterceptorProvider> | undefined,   callInvocationTransformer :@grpc/grpc-js.@grpc/grpc-js/build/src/client.CallInvocationTransformer | undefined} */
  trait ClientOptions extends StObject {
    
    var callInvocationTransformer: js.UndefOr[CallInvocationTransformer] = js.undefined
    
    var channelFactoryOverride: js.UndefOr[
        js.Function3[
          /* address */ String, 
          /* credentials */ ChannelCredentials, 
          /* options */ this.type, 
          Channel
        ]
      ] = js.undefined
    
    var channelOverride: js.UndefOr[Channel] = js.undefined
    
    @JSName("grpc.default_authority")
    var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.enable_http_proxy")
    var grpcDotenable_http_proxy: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.http_connect_creds")
    var grpcDothttp_connect_creds: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.http_connect_target")
    var grpcDothttp_connect_target: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.initial_reconnect_backoff_ms")
    var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_time_ms")
    var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_timeout_ms")
    var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_concurrent_streams")
    var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_receive_message_length")
    var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_reconnect_backoff_ms")
    var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_send_message_length")
    var grpcDotmax_send_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.primary_user_agent")
    var grpcDotprimary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.secondary_user_agent")
    var grpcDotsecondary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.service_config")
    var grpcDotservice_config: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.ssl_target_name_override")
    var grpcDotssl_target_name_override: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.use_local_subchannel_pool")
    var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined
    
    var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.undefined
    
    var interceptors: js.UndefOr[js.Array[Interceptor]] = js.undefined
  }
  object ClientOptions {
    
    inline def apply(): ClientOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientOptions]
    }
    
    extension [Self <: ClientOptions](x: Self) {
      
      inline def setCallInvocationTransformer(value: /* callProperties */ CallProperties[js.Any, js.Any] => CallProperties[js.Any, js.Any]): Self = StObject.set(x, "callInvocationTransformer", js.Any.fromFunction1(value))
      
      inline def setCallInvocationTransformerUndefined: Self = StObject.set(x, "callInvocationTransformer", js.undefined)
      
      inline def setChannelFactoryOverride(value: (/* address */ String, /* credentials */ ChannelCredentials, ClientOptions) => Channel): Self = StObject.set(x, "channelFactoryOverride", js.Any.fromFunction3(value))
      
      inline def setChannelFactoryOverrideUndefined: Self = StObject.set(x, "channelFactoryOverride", js.undefined)
      
      inline def setChannelOverride(value: Channel): Self = StObject.set(x, "channelOverride", value.asInstanceOf[js.Any])
      
      inline def setChannelOverrideUndefined: Self = StObject.set(x, "channelOverride", js.undefined)
      
      inline def setGrpcDotdefault_authority(value: String): Self = StObject.set(x, "grpc.default_authority", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotdefault_authorityUndefined: Self = StObject.set(x, "grpc.default_authority", js.undefined)
      
      inline def setGrpcDotenable_http_proxy(value: Double): Self = StObject.set(x, "grpc.enable_http_proxy", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotenable_http_proxyUndefined: Self = StObject.set(x, "grpc.enable_http_proxy", js.undefined)
      
      inline def setGrpcDothttp_connect_creds(value: String): Self = StObject.set(x, "grpc.http_connect_creds", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_credsUndefined: Self = StObject.set(x, "grpc.http_connect_creds", js.undefined)
      
      inline def setGrpcDothttp_connect_target(value: String): Self = StObject.set(x, "grpc.http_connect_target", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_targetUndefined: Self = StObject.set(x, "grpc.http_connect_target", js.undefined)
      
      inline def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotinitial_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_time_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_time_msUndefined: Self = StObject.set(x, "grpc.keepalive_time_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_timeout_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_timeout_msUndefined: Self = StObject.set(x, "grpc.keepalive_timeout_ms", js.undefined)
      
      inline def setGrpcDotmax_concurrent_streams(value: Double): Self = StObject.set(x, "grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_concurrent_streamsUndefined: Self = StObject.set(x, "grpc.max_concurrent_streams", js.undefined)
      
      inline def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_receive_message_lengthUndefined: Self = StObject.set(x, "grpc.max_receive_message_length", js.undefined)
      
      inline def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_send_message_lengthUndefined: Self = StObject.set(x, "grpc.max_send_message_length", js.undefined)
      
      inline def setGrpcDotprimary_user_agent(value: String): Self = StObject.set(x, "grpc.primary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotprimary_user_agentUndefined: Self = StObject.set(x, "grpc.primary_user_agent", js.undefined)
      
      inline def setGrpcDotsecondary_user_agent(value: String): Self = StObject.set(x, "grpc.secondary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotsecondary_user_agentUndefined: Self = StObject.set(x, "grpc.secondary_user_agent", js.undefined)
      
      inline def setGrpcDotservice_config(value: String): Self = StObject.set(x, "grpc.service_config", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotservice_configUndefined: Self = StObject.set(x, "grpc.service_config", js.undefined)
      
      inline def setGrpcDotssl_target_name_override(value: String): Self = StObject.set(x, "grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotssl_target_name_overrideUndefined: Self = StObject.set(x, "grpc.ssl_target_name_override", js.undefined)
      
      inline def setGrpcDotuse_local_subchannel_pool(value: Double): Self = StObject.set(x, "grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotuse_local_subchannel_poolUndefined: Self = StObject.set(x, "grpc.use_local_subchannel_pool", js.undefined)
      
      inline def setInterceptor_providers(value: js.Array[InterceptorProvider]): Self = StObject.set(x, "interceptor_providers", value.asInstanceOf[js.Any])
      
      inline def setInterceptor_providersUndefined: Self = StObject.set(x, "interceptor_providers", js.undefined)
      
      inline def setInterceptor_providersVarargs(value: InterceptorProvider*): Self = StObject.set(x, "interceptor_providers", js.Array(value :_*))
      
      inline def setInterceptors(value: js.Array[Interceptor]): Self = StObject.set(x, "interceptors", value.asInstanceOf[js.Any])
      
      inline def setInterceptorsUndefined: Self = StObject.set(x, "interceptors", js.undefined)
      
      inline def setInterceptorsVarargs(value: Interceptor*): Self = StObject.set(x, "interceptors", js.Array(value :_*))
    }
  }
  
  type UnaryCallback[ResponseType] = js.Function2[/* err */ ServiceError | Null, /* value */ js.UndefOr[ResponseType], Unit]
}
