package typings.grpcGrpcJs.clientMod

import typings.grpcGrpcJs.channelCredentialsMod.ChannelCredentials
import typings.grpcGrpcJs.channelMod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> & {  channelOverride ? :@grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel, channelFactoryOverride ? (address : string, credentials : @grpc/grpc-js.@grpc/grpc-js/build/src/channel-credentials.ChannelCredentials, options : @grpc/grpc-js.@grpc/grpc-js/build/src/client.ClientOptions): @grpc/grpc-js.@grpc/grpc-js/build/src/channel.Channel} */
trait ClientOptions extends js.Object {
  var channelFactoryOverride: js.UndefOr[
    js.Function3[
      /* address */ String, 
      /* credentials */ ChannelCredentials, 
      /* options */ ClientOptions, 
      Channel
    ]
  ] = js.undefined
  var channelOverride: js.UndefOr[Channel] = js.undefined
  @JSName("grpc.default_authority")
  var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
  @JSName("grpc.initial_reconnect_backoff_ms")
  var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.keepalive_time_ms")
  var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.keepalive_timeout_ms")
  var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_concurrent_streams")
  var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined
  @JSName("grpc.max_reconnect_backoff_ms")
  var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
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
}

object ClientOptions {
  @scala.inline
  def apply(
    channelFactoryOverride: (/* address */ String, /* credentials */ ChannelCredentials, /* options */ ClientOptions) => Channel = null,
    channelOverride: Channel = null,
    grpcDotdefault_authority: String = null,
    grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined,
    grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined,
    grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined,
    grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined,
    grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined,
    grpcDotprimary_user_agent: String = null,
    grpcDotsecondary_user_agent: String = null,
    grpcDotservice_config: String = null,
    grpcDotssl_target_name_override: String = null,
    grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (channelFactoryOverride != null) __obj.updateDynamic("channelFactoryOverride")(js.Any.fromFunction3(channelFactoryOverride))
    if (channelOverride != null) __obj.updateDynamic("channelOverride")(channelOverride.asInstanceOf[js.Any])
    if (grpcDotdefault_authority != null) __obj.updateDynamic("grpc.default_authority")(grpcDotdefault_authority.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotinitial_reconnect_backoff_ms)) __obj.updateDynamic("grpc.initial_reconnect_backoff_ms")(grpcDotinitial_reconnect_backoff_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotkeepalive_time_ms)) __obj.updateDynamic("grpc.keepalive_time_ms")(grpcDotkeepalive_time_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotkeepalive_timeout_ms)) __obj.updateDynamic("grpc.keepalive_timeout_ms")(grpcDotkeepalive_timeout_ms.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_concurrent_streams)) __obj.updateDynamic("grpc.max_concurrent_streams")(grpcDotmax_concurrent_streams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotmax_reconnect_backoff_ms)) __obj.updateDynamic("grpc.max_reconnect_backoff_ms")(grpcDotmax_reconnect_backoff_ms.get.asInstanceOf[js.Any])
    if (grpcDotprimary_user_agent != null) __obj.updateDynamic("grpc.primary_user_agent")(grpcDotprimary_user_agent.asInstanceOf[js.Any])
    if (grpcDotsecondary_user_agent != null) __obj.updateDynamic("grpc.secondary_user_agent")(grpcDotsecondary_user_agent.asInstanceOf[js.Any])
    if (grpcDotservice_config != null) __obj.updateDynamic("grpc.service_config")(grpcDotservice_config.asInstanceOf[js.Any])
    if (grpcDotssl_target_name_override != null) __obj.updateDynamic("grpc.ssl_target_name_override")(grpcDotssl_target_name_override.asInstanceOf[js.Any])
    if (!js.isUndefined(grpcDotuse_local_subchannel_pool)) __obj.updateDynamic("grpc.use_local_subchannel_pool")(grpcDotuse_local_subchannel_pool.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

