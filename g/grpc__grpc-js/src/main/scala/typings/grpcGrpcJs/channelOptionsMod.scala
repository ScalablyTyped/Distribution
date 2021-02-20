package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelOptionsMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel-options", "channelOptionsEqual")
  @js.native
  def channelOptionsEqual(options1: ChannelOptions, options2: ChannelOptions): Boolean = js.native
  
  object recognizedOptions {
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.default_authority")
    @js.native
    def grpcDefaultAuthority: Boolean = js.native
    
    @scala.inline
    def grpcDefaultAuthority_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.default_authority")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.enable_http_proxy")
    @js.native
    def grpcEnableHttpProxy: Boolean = js.native
    
    @scala.inline
    def grpcEnableHttpProxy_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.enable_http_proxy")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.initial_reconnect_backoff_ms")
    @js.native
    def grpcInitialReconnectBackoffMs: Boolean = js.native
    
    @scala.inline
    def grpcInitialReconnectBackoffMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.initial_reconnect_backoff_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.keepalive_time_ms")
    @js.native
    def grpcKeepaliveTimeMs: Boolean = js.native
    
    @scala.inline
    def grpcKeepaliveTimeMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_time_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.keepalive_timeout_ms")
    @js.native
    def grpcKeepaliveTimeoutMs: Boolean = js.native
    
    @scala.inline
    def grpcKeepaliveTimeoutMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_timeout_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_concurrent_streams")
    @js.native
    def grpcMaxConcurrentStreams: Boolean = js.native
    
    @scala.inline
    def grpcMaxConcurrentStreams_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_concurrent_streams")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_receive_message_length")
    @js.native
    def grpcMaxReceiveMessageLength: Boolean = js.native
    
    @scala.inline
    def grpcMaxReceiveMessageLength_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_receive_message_length")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_reconnect_backoff_ms")
    @js.native
    def grpcMaxReconnectBackoffMs: Boolean = js.native
    
    @scala.inline
    def grpcMaxReconnectBackoffMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_reconnect_backoff_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_send_message_length")
    @js.native
    def grpcMaxSendMessageLength: Boolean = js.native
    
    @scala.inline
    def grpcMaxSendMessageLength_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_send_message_length")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.primary_user_agent")
    @js.native
    def grpcPrimaryUserAgent: Boolean = js.native
    
    @scala.inline
    def grpcPrimaryUserAgent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.primary_user_agent")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.secondary_user_agent")
    @js.native
    def grpcSecondaryUserAgent: Boolean = js.native
    
    @scala.inline
    def grpcSecondaryUserAgent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.secondary_user_agent")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.service_config")
    @js.native
    def grpcServiceConfig: Boolean = js.native
    
    @scala.inline
    def grpcServiceConfig_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.service_config")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.ssl_target_name_override")
    @js.native
    def grpcSslTargetNameOverride: Boolean = js.native
    
    @scala.inline
    def grpcSslTargetNameOverride_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.ssl_target_name_override")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.use_local_subchannel_pool")
    @js.native
    def grpcUseLocalSubchannelPool: Boolean = js.native
    
    @scala.inline
    def grpcUseLocalSubchannelPool_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.use_local_subchannel_pool")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ChannelOptions
    extends /* key */ StringDictionary[js.Any] {
    
    @JSName("grpc.default_authority")
    var grpcDotdefault_authority: js.UndefOr[String] = js.native
    
    @JSName("grpc.enable_http_proxy")
    var grpcDotenable_http_proxy: js.UndefOr[Double] = js.native
    
    @JSName("grpc.http_connect_creds")
    var grpcDothttp_connect_creds: js.UndefOr[String] = js.native
    
    @JSName("grpc.http_connect_target")
    var grpcDothttp_connect_target: js.UndefOr[String] = js.native
    
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
  }
  object ChannelOptions {
    
    @scala.inline
    def apply(): ChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelOptions]
    }
    
    @scala.inline
    implicit class ChannelOptionsMutableBuilder[Self <: ChannelOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGrpcDotdefault_authority(value: String): Self = StObject.set(x, "grpc.default_authority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotdefault_authorityUndefined: Self = StObject.set(x, "grpc.default_authority", js.undefined)
      
      @scala.inline
      def setGrpcDotenable_http_proxy(value: Double): Self = StObject.set(x, "grpc.enable_http_proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotenable_http_proxyUndefined: Self = StObject.set(x, "grpc.enable_http_proxy", js.undefined)
      
      @scala.inline
      def setGrpcDothttp_connect_creds(value: String): Self = StObject.set(x, "grpc.http_connect_creds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDothttp_connect_credsUndefined: Self = StObject.set(x, "grpc.http_connect_creds", js.undefined)
      
      @scala.inline
      def setGrpcDothttp_connect_target(value: String): Self = StObject.set(x, "grpc.http_connect_target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDothttp_connect_targetUndefined: Self = StObject.set(x, "grpc.http_connect_target", js.undefined)
      
      @scala.inline
      def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotinitial_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotkeepalive_time_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotkeepalive_time_msUndefined: Self = StObject.set(x, "grpc.keepalive_time_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotkeepalive_timeout_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotkeepalive_timeout_msUndefined: Self = StObject.set(x, "grpc.keepalive_timeout_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_concurrent_streams(value: Double): Self = StObject.set(x, "grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_concurrent_streamsUndefined: Self = StObject.set(x, "grpc.max_concurrent_streams", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_receive_message_lengthUndefined: Self = StObject.set(x, "grpc.max_receive_message_length", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", js.undefined)
      
      @scala.inline
      def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotmax_send_message_lengthUndefined: Self = StObject.set(x, "grpc.max_send_message_length", js.undefined)
      
      @scala.inline
      def setGrpcDotprimary_user_agent(value: String): Self = StObject.set(x, "grpc.primary_user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotprimary_user_agentUndefined: Self = StObject.set(x, "grpc.primary_user_agent", js.undefined)
      
      @scala.inline
      def setGrpcDotsecondary_user_agent(value: String): Self = StObject.set(x, "grpc.secondary_user_agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotsecondary_user_agentUndefined: Self = StObject.set(x, "grpc.secondary_user_agent", js.undefined)
      
      @scala.inline
      def setGrpcDotservice_config(value: String): Self = StObject.set(x, "grpc.service_config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotservice_configUndefined: Self = StObject.set(x, "grpc.service_config", js.undefined)
      
      @scala.inline
      def setGrpcDotssl_target_name_override(value: String): Self = StObject.set(x, "grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotssl_target_name_overrideUndefined: Self = StObject.set(x, "grpc.ssl_target_name_override", js.undefined)
      
      @scala.inline
      def setGrpcDotuse_local_subchannel_pool(value: Double): Self = StObject.set(x, "grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrpcDotuse_local_subchannel_poolUndefined: Self = StObject.set(x, "grpc.use_local_subchannel_pool", js.undefined)
    }
  }
}
