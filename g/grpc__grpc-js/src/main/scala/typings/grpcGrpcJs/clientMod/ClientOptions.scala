package typings.grpcGrpcJs.clientMod

import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import typings.grpcGrpcJs.clientInterceptorsMod.Interceptor
import typings.grpcGrpcJs.clientInterceptorsMod.InterceptorProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> & {  channelOverride :@grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel | undefined,   channelFactoryOverride :(address : string, credentials : @grpc/grpc-js.@grpc/grpc-js/build/src/channel-credentials.ChannelCredentials, options : @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions): @grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel | undefined,   interceptors :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.Interceptor> | undefined,   interceptor_providers :std.Array<@grpc/grpc-js.@grpc/grpc-js/build/src/client-interceptors.InterceptorProvider> | undefined,   callInvocationTransformer :@grpc/grpc-js.@grpc/grpc-js/build/src/client.CallInvocationTransformer | undefined} */
@js.native
trait ClientOptions extends js.Object {
  var callInvocationTransformer: js.UndefOr[CallInvocationTransformer] = js.native
  var channelFactoryOverride: js.UndefOr[
    js.Function3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ this.type, 
      Channel
    ]
  ] = js.native
  var channelOverride: js.UndefOr[Channel] = js.native
  @JSName("grpc.default_authority")
  var grpcDotdefault_authority: js.UndefOr[String] = js.native
  @JSName("grpc.enable_http_proxy")
  var grpcDotenable_http_proxy: js.UndefOr[Double] = js.native
  @JSName("grpc.initial_reconnect_backoff_ms")
  var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.keepalive_time_ms")
  var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.keepalive_timeout_ms")
  var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.max_concurrent_streams")
  var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.native
  @JSName("grpc.max_receive_message_length")
  var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.native
  @JSName("grpc.max_reconnect_backoff_ms")
  var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.native
  @JSName("grpc.max_send_message_length")
  var grpcDotmax_send_message_length: js.UndefOr[Double] = js.native
  @JSName("grpc.primary_user_agent")
  var grpcDotprimary_user_agent: js.UndefOr[String] = js.native
  @JSName("grpc.secondary_user_agent")
  var grpcDotsecondary_user_agent: js.UndefOr[String] = js.native
  @JSName("grpc.service_config")
  var grpcDotservice_config: js.UndefOr[String] = js.native
  @JSName("grpc.ssl_target_name_override")
  var grpcDotssl_target_name_override: js.UndefOr[String] = js.native
  @JSName("grpc.use_local_subchannel_pool")
  var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.native
  var interceptor_providers: js.UndefOr[js.Array[InterceptorProvider]] = js.native
  var interceptors: js.UndefOr[js.Array[Interceptor]] = js.native
}

object ClientOptions {
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCallInvocationTransformer(value: /* callProperties */ CallProperties[js.Any, js.Any] => CallProperties[js.Any, js.Any]): Self = this.set("callInvocationTransformer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallInvocationTransformer: Self = this.set("callInvocationTransformer", js.undefined)
    @scala.inline
    def setChannelFactoryOverride(value: (/* address */ String, /* credentials */ ChannelCredentials, ClientOptions) => Channel): Self = this.set("channelFactoryOverride", js.Any.fromFunction3(value))
    @scala.inline
    def deleteChannelFactoryOverride: Self = this.set("channelFactoryOverride", js.undefined)
    @scala.inline
    def setChannelOverride(value: Channel): Self = this.set("channelOverride", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelOverride: Self = this.set("channelOverride", js.undefined)
    @scala.inline
    def setGrpcDotdefault_authority(value: String): Self = this.set("grpc.default_authority", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotdefault_authority: Self = this.set("grpc.default_authority", js.undefined)
    @scala.inline
    def setGrpcDotenable_http_proxy(value: Double): Self = this.set("grpc.enable_http_proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotenable_http_proxy: Self = this.set("grpc.enable_http_proxy", js.undefined)
    @scala.inline
    def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = this.set("grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotinitial_reconnect_backoff_ms: Self = this.set("grpc.initial_reconnect_backoff_ms", js.undefined)
    @scala.inline
    def setGrpcDotkeepalive_time_ms(value: Double): Self = this.set("grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotkeepalive_time_ms: Self = this.set("grpc.keepalive_time_ms", js.undefined)
    @scala.inline
    def setGrpcDotkeepalive_timeout_ms(value: Double): Self = this.set("grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotkeepalive_timeout_ms: Self = this.set("grpc.keepalive_timeout_ms", js.undefined)
    @scala.inline
    def setGrpcDotmax_concurrent_streams(value: Double): Self = this.set("grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotmax_concurrent_streams: Self = this.set("grpc.max_concurrent_streams", js.undefined)
    @scala.inline
    def setGrpcDotmax_receive_message_length(value: Double): Self = this.set("grpc.max_receive_message_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotmax_receive_message_length: Self = this.set("grpc.max_receive_message_length", js.undefined)
    @scala.inline
    def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = this.set("grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotmax_reconnect_backoff_ms: Self = this.set("grpc.max_reconnect_backoff_ms", js.undefined)
    @scala.inline
    def setGrpcDotmax_send_message_length(value: Double): Self = this.set("grpc.max_send_message_length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotmax_send_message_length: Self = this.set("grpc.max_send_message_length", js.undefined)
    @scala.inline
    def setGrpcDotprimary_user_agent(value: String): Self = this.set("grpc.primary_user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotprimary_user_agent: Self = this.set("grpc.primary_user_agent", js.undefined)
    @scala.inline
    def setGrpcDotsecondary_user_agent(value: String): Self = this.set("grpc.secondary_user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotsecondary_user_agent: Self = this.set("grpc.secondary_user_agent", js.undefined)
    @scala.inline
    def setGrpcDotservice_config(value: String): Self = this.set("grpc.service_config", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotservice_config: Self = this.set("grpc.service_config", js.undefined)
    @scala.inline
    def setGrpcDotssl_target_name_override(value: String): Self = this.set("grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotssl_target_name_override: Self = this.set("grpc.ssl_target_name_override", js.undefined)
    @scala.inline
    def setGrpcDotuse_local_subchannel_pool(value: Double): Self = this.set("grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrpcDotuse_local_subchannel_pool: Self = this.set("grpc.use_local_subchannel_pool", js.undefined)
    @scala.inline
    def setInterceptor_providersVarargs(value: InterceptorProvider*): Self = this.set("interceptor_providers", js.Array(value :_*))
    @scala.inline
    def setInterceptor_providers(value: js.Array[InterceptorProvider]): Self = this.set("interceptor_providers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptor_providers: Self = this.set("interceptor_providers", js.undefined)
    @scala.inline
    def setInterceptorsVarargs(value: Interceptor*): Self = this.set("interceptors", js.Array(value :_*))
    @scala.inline
    def setInterceptors(value: js.Array[Interceptor]): Self = this.set("interceptors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterceptors: Self = this.set("interceptors", js.undefined)
  }
  
}

