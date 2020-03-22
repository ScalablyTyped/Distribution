package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'hostHeaderName' | 'localtimeOffsetMsec' | 'host' | 'port'> */
trait AuthenticateBewitOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var hostHeaderName: js.UndefOr[String] = js.undefined
  var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object AuthenticateBewitOptions {
  @scala.inline
  def apply(
    host: String = null,
    hostHeaderName: String = null,
    localtimeOffsetMsec: Int | Double = null,
    port: Int | Double = null
  ): AuthenticateBewitOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostHeaderName != null) __obj.updateDynamic("hostHeaderName")(hostHeaderName.asInstanceOf[js.Any])
    if (localtimeOffsetMsec != null) __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateBewitOptions]
  }
}

