package typings.atGrpcGrpcDashJs.buildSrcChannelDashOptionsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelOptions
  extends /* key */ StringDictionary[js.UndefOr[String | Double]] {
  var `grpc.default_authority`: js.UndefOr[String] = js.undefined
  var `grpc.keepalive_time_ms`: js.UndefOr[Double] = js.undefined
  var `grpc.keepalive_timeout_ms`: js.UndefOr[Double] = js.undefined
  var `grpc.primary_user_agent`: js.UndefOr[String] = js.undefined
  var `grpc.secondary_user_agent`: js.UndefOr[String] = js.undefined
  var `grpc.ssl_target_name_override`: js.UndefOr[String] = js.undefined
}

object ChannelOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String | Double]] = null,
    `grpc.default_authority`: String = null,
    `grpc.keepalive_time_ms`: Int | Double = null,
    `grpc.keepalive_timeout_ms`: Int | Double = null,
    `grpc.primary_user_agent`: String = null,
    `grpc.secondary_user_agent`: String = null,
    `grpc.ssl_target_name_override`: String = null
  ): ChannelOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`grpc.default_authority` != null) __obj.updateDynamic("grpc.default_authority")(`grpc.default_authority`.asInstanceOf[js.Any])
    if (`grpc.keepalive_time_ms` != null) __obj.updateDynamic("grpc.keepalive_time_ms")(`grpc.keepalive_time_ms`.asInstanceOf[js.Any])
    if (`grpc.keepalive_timeout_ms` != null) __obj.updateDynamic("grpc.keepalive_timeout_ms")(`grpc.keepalive_timeout_ms`.asInstanceOf[js.Any])
    if (`grpc.primary_user_agent` != null) __obj.updateDynamic("grpc.primary_user_agent")(`grpc.primary_user_agent`.asInstanceOf[js.Any])
    if (`grpc.secondary_user_agent` != null) __obj.updateDynamic("grpc.secondary_user_agent")(`grpc.secondary_user_agent`.asInstanceOf[js.Any])
    if (`grpc.ssl_target_name_override` != null) __obj.updateDynamic("grpc.ssl_target_name_override")(`grpc.ssl_target_name_override`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelOptions]
  }
}

