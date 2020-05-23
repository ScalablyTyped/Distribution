package typings.hapiHawk.serverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  /**
    * optional host name override. Only used when passed a node request object.
    */
  var host: js.UndefOr[String] = js.undefined
  /**
    * optional header field name, used to override the default 'Host' header when used
    * behind a cache of a proxy. Apache2 changes the value of the 'Host' header while preserving
    * the original (which is what the module must verify) in the 'x-forwarded-host' header field.
    * Only used when passed a node `http.ServerRequest` object.
    */
  var hostHeaderName: js.UndefOr[String] = js.undefined
  /**
    * Optional local clock time offset express in a number of milliseconds (positive or negative).
    * Defaults to 0.
    */
  var localtimeOffsetMsec: js.UndefOr[Double] = js.undefined
  /**
    * optional nonce validation function. The function signature is `async function(key, nonce, ts)`
    * and it must return no value for success or throw an error for invalid state.
    */
  var nonceFunc: js.UndefOr[NonceFunc] = js.undefined
  /**
    * optional payload for validation. The client calculates the hash value and includes it via the 'hash'
    * header attribute. The server always ensures the value provided has been included in the request
    * MAC. When this option is provided, it validates the hash value itself. Validation is done by calculating
    * a hash value over the entire payload (assuming it has already be normalized to the same format and
    * encoding used by the client to calculate the hash on request). If the payload is not available at the time
    * of authentication, the `authenticatePayload()` method can be used by passing it the credentials and
    * `attributes.hash` returned from `authenticate()`.
    */
  var payload: js.UndefOr[String] = js.undefined
  /**
    * optional port override. Only used when passed a node request object.
    */
  var port: js.UndefOr[Double] = js.undefined
  /**
    * optional number of seconds of permitted clock skew for incoming timestamps. Defaults to 60 seconds.
    * Provides a +/- skew which means actual allowed window is double the number of seconds.
    */
  var timestampSkewSec: js.UndefOr[Double] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(
    host: String = null,
    hostHeaderName: String = null,
    localtimeOffsetMsec: js.UndefOr[Double] = js.undefined,
    nonceFunc: (/* key */ String, /* nonce */ String, /* ts */ String) => js.Promise[Unit] | Unit = null,
    payload: String = null,
    port: js.UndefOr[Double] = js.undefined,
    timestampSkewSec: js.UndefOr[Double] = js.undefined
  ): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostHeaderName != null) __obj.updateDynamic("hostHeaderName")(hostHeaderName.asInstanceOf[js.Any])
    if (!js.isUndefined(localtimeOffsetMsec)) __obj.updateDynamic("localtimeOffsetMsec")(localtimeOffsetMsec.get.asInstanceOf[js.Any])
    if (nonceFunc != null) __obj.updateDynamic("nonceFunc")(js.Any.fromFunction3(nonceFunc))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampSkewSec)) __obj.updateDynamic("timestampSkewSec")(timestampSkewSec.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

