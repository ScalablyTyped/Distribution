package typings.grpcGrpcJs.channelOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOptions
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  @JSName("grpc.default_authority")
  var grpcDotdefault_authority: js.UndefOr[String] = js.undefined
  @JSName("grpc.keepalive_time_ms")
  var grpcDotkeepalive_time_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.keepalive_timeout_ms")
  var grpcDotkeepalive_timeout_ms: js.UndefOr[Double] = js.undefined
  @JSName("grpc.primary_user_agent")
  var grpcDotprimary_user_agent: js.UndefOr[String] = js.undefined
  @JSName("grpc.secondary_user_agent")
  var grpcDotsecondary_user_agent: js.UndefOr[String] = js.undefined
  @JSName("grpc.ssl_target_name_override")
  var grpcDotssl_target_name_override: js.UndefOr[String] = js.undefined
}

object ChannelOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double]] = null,
    grpcDotdefault_authority: String = null,
    grpcDotkeepalive_time_ms: Int | Double = null,
    grpcDotkeepalive_timeout_ms: Int | Double = null,
    grpcDotprimary_user_agent: String = null,
    grpcDotsecondary_user_agent: String = null,
    grpcDotssl_target_name_override: String = null
  ): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (grpcDotdefault_authority != null) __obj.updateDynamic("grpc.default_authority")(grpcDotdefault_authority.asInstanceOf[js.Any])
    if (grpcDotkeepalive_time_ms != null) __obj.updateDynamic("grpc.keepalive_time_ms")(grpcDotkeepalive_time_ms.asInstanceOf[js.Any])
    if (grpcDotkeepalive_timeout_ms != null) __obj.updateDynamic("grpc.keepalive_timeout_ms")(grpcDotkeepalive_timeout_ms.asInstanceOf[js.Any])
    if (grpcDotprimary_user_agent != null) __obj.updateDynamic("grpc.primary_user_agent")(grpcDotprimary_user_agent.asInstanceOf[js.Any])
    if (grpcDotsecondary_user_agent != null) __obj.updateDynamic("grpc.secondary_user_agent")(grpcDotsecondary_user_agent.asInstanceOf[js.Any])
    if (grpcDotssl_target_name_override != null) __obj.updateDynamic("grpc.ssl_target_name_override")(grpcDotssl_target_name_override.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
}

