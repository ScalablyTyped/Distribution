package typings.grpcGrpcJs

import org.scalablytyped.runtime.StringDictionary
import typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcChannelOptionsMod {
  
  @JSImport("@grpc/grpc-js/build/src/channel-options", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def channelOptionsEqual(options1: ChannelOptions, options2: ChannelOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("channelOptionsEqual")(options1.asInstanceOf[js.Any], options2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  object recognizedOptions {
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.default_authority")
    @js.native
    def grpcDefaultAuthority: Boolean = js.native
    
    inline def grpcDefaultAuthority_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.default_authority")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.dns_min_time_between_resolutions_ms")
    @js.native
    def grpcDnsMinTimeBetweenResolutionsMs: Boolean = js.native
    
    inline def grpcDnsMinTimeBetweenResolutionsMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.dns_min_time_between_resolutions_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.enable_channelz")
    @js.native
    def grpcEnableChannelz: Boolean = js.native
    
    inline def grpcEnableChannelz_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.enable_channelz")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.enable_http_proxy")
    @js.native
    def grpcEnableHttpProxy: Boolean = js.native
    
    inline def grpcEnableHttpProxy_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.enable_http_proxy")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.enable_retries")
    @js.native
    def grpcEnableRetries: Boolean = js.native
    
    inline def grpcEnableRetries_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.enable_retries")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.initial_reconnect_backoff_ms")
    @js.native
    def grpcInitialReconnectBackoffMs: Boolean = js.native
    
    inline def grpcInitialReconnectBackoffMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.initial_reconnect_backoff_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.keepalive_permit_without_calls")
    @js.native
    def grpcKeepalivePermitWithoutCalls: Boolean = js.native
    
    inline def grpcKeepalivePermitWithoutCalls_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_permit_without_calls")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.keepalive_time_ms")
    @js.native
    def grpcKeepaliveTimeMs: Boolean = js.native
    
    inline def grpcKeepaliveTimeMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_time_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.keepalive_timeout_ms")
    @js.native
    def grpcKeepaliveTimeoutMs: Boolean = js.native
    
    inline def grpcKeepaliveTimeoutMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.keepalive_timeout_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_concurrent_streams")
    @js.native
    def grpcMaxConcurrentStreams: Boolean = js.native
    
    inline def grpcMaxConcurrentStreams_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_concurrent_streams")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_connection_age_grace_ms")
    @js.native
    def grpcMaxConnectionAgeGraceMs: Boolean = js.native
    
    inline def grpcMaxConnectionAgeGraceMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_connection_age_grace_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_connection_age_ms")
    @js.native
    def grpcMaxConnectionAgeMs: Boolean = js.native
    
    inline def grpcMaxConnectionAgeMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_connection_age_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_receive_message_length")
    @js.native
    def grpcMaxReceiveMessageLength: Boolean = js.native
    
    inline def grpcMaxReceiveMessageLength_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_receive_message_length")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_reconnect_backoff_ms")
    @js.native
    def grpcMaxReconnectBackoffMs: Boolean = js.native
    
    inline def grpcMaxReconnectBackoffMs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_reconnect_backoff_ms")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.max_send_message_length")
    @js.native
    def grpcMaxSendMessageLength: Boolean = js.native
    
    inline def grpcMaxSendMessageLength_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.max_send_message_length")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc-node.max_session_memory")
    @js.native
    def grpcNodeMaxSessionMemory: Boolean = js.native
    
    inline def grpcNodeMaxSessionMemory_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc-node.max_session_memory")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.per_rpc_retry_buffer_size")
    @js.native
    def grpcPerRpcRetryBufferSize: Boolean = js.native
    
    inline def grpcPerRpcRetryBufferSize_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.per_rpc_retry_buffer_size")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.primary_user_agent")
    @js.native
    def grpcPrimaryUserAgent: Boolean = js.native
    
    inline def grpcPrimaryUserAgent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.primary_user_agent")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.retry_buffer_size")
    @js.native
    def grpcRetryBufferSize: Boolean = js.native
    
    inline def grpcRetryBufferSize_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.retry_buffer_size")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.secondary_user_agent")
    @js.native
    def grpcSecondaryUserAgent: Boolean = js.native
    
    inline def grpcSecondaryUserAgent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.secondary_user_agent")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.service_config")
    @js.native
    def grpcServiceConfig: Boolean = js.native
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.service_config_disable_resolution")
    @js.native
    def grpcServiceConfigDisableResolution: Boolean = js.native
    
    inline def grpcServiceConfigDisableResolution_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.service_config_disable_resolution")(x.asInstanceOf[js.Any])
    
    inline def grpcServiceConfig_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.service_config")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.ssl_target_name_override")
    @js.native
    def grpcSslTargetNameOverride: Boolean = js.native
    
    inline def grpcSslTargetNameOverride_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.ssl_target_name_override")(x.asInstanceOf[js.Any])
    
    @JSImport("@grpc/grpc-js/build/src/channel-options", "recognizedOptions.grpc.use_local_subchannel_pool")
    @js.native
    def grpcUseLocalSubchannelPool: Boolean = js.native
    
    inline def grpcUseLocalSubchannelPool_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grpc.use_local_subchannel_pool")(x.asInstanceOf[js.Any])
  }
  
  trait ChannelOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    @JSName("grpc-node.max_session_memory")
    var `grpc-nodeDotmax_session_memory`: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.default_authority")
    var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.default_compression_algorithm")
    var grpcDotdefault_compression_algorithm: js.UndefOr[CompressionAlgorithms] = js.undefined
    
    @JSName("grpc.dns_min_time_between_resolutions_ms")
    var grpcDotdns_min_time_between_resolutions_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.enable_channelz")
    var grpcDotenable_channelz: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.enable_http_proxy")
    var grpcDotenable_http_proxy: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.enable_retries")
    var grpcDotenable_retries: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.http_connect_creds")
    var grpcDothttp_connect_creds: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.http_connect_target")
    var grpcDothttp_connect_target: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.initial_reconnect_backoff_ms")
    var grpcDotinitial_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_permit_without_calls")
    var grpcDotkeepalive_permit_without_calls: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_time_ms")
    var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.keepalive_timeout_ms")
    var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_concurrent_streams")
    var grpcDotmax_concurrent_streams: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_connection_age_grace_ms")
    var grpcDotmax_connection_age_grace_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_connection_age_ms")
    var grpcDotmax_connection_age_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_receive_message_length")
    var grpcDotmax_receive_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_reconnect_backoff_ms")
    var grpcDotmax_reconnect_backoff_ms: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.max_send_message_length")
    var grpcDotmax_send_message_length: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.per_rpc_retry_buffer_size")
    var grpcDotper_rpc_retry_buffer_size: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.primary_user_agent")
    var grpcDotprimary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.retry_buffer_size")
    var grpcDotretry_buffer_size: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.secondary_user_agent")
    var grpcDotsecondary_user_agent: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.service_config")
    var grpcDotservice_config: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.service_config_disable_resolution")
    var grpcDotservice_config_disable_resolution: js.UndefOr[Double] = js.undefined
    
    @JSName("grpc.ssl_target_name_override")
    var grpcDotssl_target_name_override: js.UndefOr[String] = js.undefined
    
    @JSName("grpc.use_local_subchannel_pool")
    var grpcDotuse_local_subchannel_pool: js.UndefOr[Double] = js.undefined
  }
  object ChannelOptions {
    
    inline def apply(): ChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelOptions] (val x: Self) extends AnyVal {
      
      inline def `setGrpc-nodeDotmax_session_memory`(value: Double): Self = StObject.set(x, "grpc-node.max_session_memory", value.asInstanceOf[js.Any])
      
      inline def `setGrpc-nodeDotmax_session_memoryUndefined`: Self = StObject.set(x, "grpc-node.max_session_memory", js.undefined)
      
      inline def setGrpcDotdefault_authority(value: String): Self = StObject.set(x, "grpc.default_authority", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotdefault_authorityUndefined: Self = StObject.set(x, "grpc.default_authority", js.undefined)
      
      inline def setGrpcDotdefault_compression_algorithm(value: CompressionAlgorithms): Self = StObject.set(x, "grpc.default_compression_algorithm", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotdefault_compression_algorithmUndefined: Self = StObject.set(x, "grpc.default_compression_algorithm", js.undefined)
      
      inline def setGrpcDotdns_min_time_between_resolutions_ms(value: Double): Self = StObject.set(x, "grpc.dns_min_time_between_resolutions_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotdns_min_time_between_resolutions_msUndefined: Self = StObject.set(x, "grpc.dns_min_time_between_resolutions_ms", js.undefined)
      
      inline def setGrpcDotenable_channelz(value: Double): Self = StObject.set(x, "grpc.enable_channelz", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotenable_channelzUndefined: Self = StObject.set(x, "grpc.enable_channelz", js.undefined)
      
      inline def setGrpcDotenable_http_proxy(value: Double): Self = StObject.set(x, "grpc.enable_http_proxy", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotenable_http_proxyUndefined: Self = StObject.set(x, "grpc.enable_http_proxy", js.undefined)
      
      inline def setGrpcDotenable_retries(value: Double): Self = StObject.set(x, "grpc.enable_retries", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotenable_retriesUndefined: Self = StObject.set(x, "grpc.enable_retries", js.undefined)
      
      inline def setGrpcDothttp_connect_creds(value: String): Self = StObject.set(x, "grpc.http_connect_creds", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_credsUndefined: Self = StObject.set(x, "grpc.http_connect_creds", js.undefined)
      
      inline def setGrpcDothttp_connect_target(value: String): Self = StObject.set(x, "grpc.http_connect_target", value.asInstanceOf[js.Any])
      
      inline def setGrpcDothttp_connect_targetUndefined: Self = StObject.set(x, "grpc.http_connect_target", js.undefined)
      
      inline def setGrpcDotinitial_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotinitial_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.initial_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_permit_without_calls(value: Double): Self = StObject.set(x, "grpc.keepalive_permit_without_calls", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_permit_without_callsUndefined: Self = StObject.set(x, "grpc.keepalive_permit_without_calls", js.undefined)
      
      inline def setGrpcDotkeepalive_time_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_time_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_time_msUndefined: Self = StObject.set(x, "grpc.keepalive_time_ms", js.undefined)
      
      inline def setGrpcDotkeepalive_timeout_ms(value: Double): Self = StObject.set(x, "grpc.keepalive_timeout_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotkeepalive_timeout_msUndefined: Self = StObject.set(x, "grpc.keepalive_timeout_ms", js.undefined)
      
      inline def setGrpcDotmax_concurrent_streams(value: Double): Self = StObject.set(x, "grpc.max_concurrent_streams", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_concurrent_streamsUndefined: Self = StObject.set(x, "grpc.max_concurrent_streams", js.undefined)
      
      inline def setGrpcDotmax_connection_age_grace_ms(value: Double): Self = StObject.set(x, "grpc.max_connection_age_grace_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_connection_age_grace_msUndefined: Self = StObject.set(x, "grpc.max_connection_age_grace_ms", js.undefined)
      
      inline def setGrpcDotmax_connection_age_ms(value: Double): Self = StObject.set(x, "grpc.max_connection_age_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_connection_age_msUndefined: Self = StObject.set(x, "grpc.max_connection_age_ms", js.undefined)
      
      inline def setGrpcDotmax_receive_message_length(value: Double): Self = StObject.set(x, "grpc.max_receive_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_receive_message_lengthUndefined: Self = StObject.set(x, "grpc.max_receive_message_length", js.undefined)
      
      inline def setGrpcDotmax_reconnect_backoff_ms(value: Double): Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_reconnect_backoff_msUndefined: Self = StObject.set(x, "grpc.max_reconnect_backoff_ms", js.undefined)
      
      inline def setGrpcDotmax_send_message_length(value: Double): Self = StObject.set(x, "grpc.max_send_message_length", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotmax_send_message_lengthUndefined: Self = StObject.set(x, "grpc.max_send_message_length", js.undefined)
      
      inline def setGrpcDotper_rpc_retry_buffer_size(value: Double): Self = StObject.set(x, "grpc.per_rpc_retry_buffer_size", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotper_rpc_retry_buffer_sizeUndefined: Self = StObject.set(x, "grpc.per_rpc_retry_buffer_size", js.undefined)
      
      inline def setGrpcDotprimary_user_agent(value: String): Self = StObject.set(x, "grpc.primary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotprimary_user_agentUndefined: Self = StObject.set(x, "grpc.primary_user_agent", js.undefined)
      
      inline def setGrpcDotretry_buffer_size(value: Double): Self = StObject.set(x, "grpc.retry_buffer_size", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotretry_buffer_sizeUndefined: Self = StObject.set(x, "grpc.retry_buffer_size", js.undefined)
      
      inline def setGrpcDotsecondary_user_agent(value: String): Self = StObject.set(x, "grpc.secondary_user_agent", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotsecondary_user_agentUndefined: Self = StObject.set(x, "grpc.secondary_user_agent", js.undefined)
      
      inline def setGrpcDotservice_config(value: String): Self = StObject.set(x, "grpc.service_config", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotservice_configUndefined: Self = StObject.set(x, "grpc.service_config", js.undefined)
      
      inline def setGrpcDotservice_config_disable_resolution(value: Double): Self = StObject.set(x, "grpc.service_config_disable_resolution", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotservice_config_disable_resolutionUndefined: Self = StObject.set(x, "grpc.service_config_disable_resolution", js.undefined)
      
      inline def setGrpcDotssl_target_name_override(value: String): Self = StObject.set(x, "grpc.ssl_target_name_override", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotssl_target_name_overrideUndefined: Self = StObject.set(x, "grpc.ssl_target_name_override", js.undefined)
      
      inline def setGrpcDotuse_local_subchannel_pool(value: Double): Self = StObject.set(x, "grpc.use_local_subchannel_pool", value.asInstanceOf[js.Any])
      
      inline def setGrpcDotuse_local_subchannel_poolUndefined: Self = StObject.set(x, "grpc.use_local_subchannel_pool", js.undefined)
    }
  }
}
