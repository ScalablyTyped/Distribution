package typings.grpcGrpcJs.channelOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelOptions
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
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
}

object ChannelOptions {
  @scala.inline
  def apply(): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelOptions]
  }
  @scala.inline
  implicit class ChannelOptionsOps[Self <: ChannelOptions] (val x: Self) extends AnyVal {
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
  }
  
}

