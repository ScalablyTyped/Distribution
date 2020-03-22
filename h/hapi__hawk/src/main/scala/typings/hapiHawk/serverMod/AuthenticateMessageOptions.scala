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
    localtimeOffsetMsec: Int | Double = null,
    nonceFunc: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit = null,
    timestampSkewSec: Int | Double = null
  ): AuthenticateMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (localtimeOffsetMsec != null) __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec.asInstanceOf[js.Any])
    if (nonceFunc != null) __obj.updateDynamic("nonceFunc")(js.Any.fromFunction3(nonceFunc))
    if (timestampSkewSec != null) __obj.updateDynamic("timestampSkewSec")(timestampSkewSec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateMessageOptions]
  }
}

