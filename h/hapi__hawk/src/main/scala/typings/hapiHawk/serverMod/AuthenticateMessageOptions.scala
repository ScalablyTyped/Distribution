package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<@hapi/hawk.@hapi/hawk/lib/server.AuthenticateOptions, 'nonceFunc' | 'timestampSkewSec' | 'localtimeOffsetMsec'> */
trait AuthenticateMessageOptions extends js.Object {
  var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
  var nonceFunc: js.UndefOr[NonceFunc] = js.undefined
  var timestampSkewSec: js.UndefOr[Double] = js.undefined
}

object AuthenticateMessageOptions {
  @scala.inline
  def apply(
    localtimeOffsetMsec: js.UndefOr[Double] = js.undefined,
    nonceFunc: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit = null,
    timestampSkewSec: js.UndefOr[Double] = js.undefined
  ): AuthenticateMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(localtimeOffsetMsec)) __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec.get.asInstanceOf[js.Any])
    if (nonceFunc != null) __obj.updateDynamic("nonceFunc")(js.Any.fromFunction3(nonceFunc))
    if (!js.isUndefined(timestampSkewSec)) __obj.updateDynamic("timestampSkewSec")(timestampSkewSec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateMessageOptions]
  }
}

