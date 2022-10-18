package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.buildSrcCompressionAlgorithmsMod.CompressionAlgorithms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/channel-options.ChannelOptions> */
trait PartialChannelOptions extends StObject {
  
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
}
object PartialChannelOptions {
  
  inline def apply(): PartialChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialChannelOptions]
  }
  
  extension [Self <: PartialChannelOptions](x: Self) {
    
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
  }
}
