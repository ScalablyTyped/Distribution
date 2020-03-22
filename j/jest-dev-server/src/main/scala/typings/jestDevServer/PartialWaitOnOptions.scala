package typings.jestDevServer

import typings.std.Record
import typings.waitOn.mod.HttpSignature
import typings.waitOn.mod.WaitOnAuth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<wait-on.wait-on.WaitOnOptions> */
trait PartialWaitOnOptions extends js.Object {
  var auth: js.UndefOr[WaitOnAuth] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var followAllRedirects: js.UndefOr[Boolean] = js.undefined
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[Record[String, _]] = js.undefined
  var httpSignature: js.UndefOr[HttpSignature] = js.undefined
  var httpTimeout: js.UndefOr[Double] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[Boolean] = js.undefined
  var resources: js.UndefOr[js.Array[String]] = js.undefined
  var reverse: js.UndefOr[Boolean] = js.undefined
  var simultaneous: js.UndefOr[Double] = js.undefined
  var strictSSL: js.UndefOr[Boolean] = js.undefined
  var tcpTimeout: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
  var window: js.UndefOr[Double] = js.undefined
}

object PartialWaitOnOptions {
  @scala.inline
  def apply(
    auth: WaitOnAuth = null,
    delay: Int | Double = null,
    followAllRedirects: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: Record[String, _] = null,
    httpSignature: HttpSignature = null,
    httpTimeout: Int | Double = null,
    interval: Int | Double = null,
    log: js.UndefOr[Boolean] = js.undefined,
    resources: js.Array[String] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    simultaneous: Int | Double = null,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    tcpTimeout: Int | Double = null,
    timeout: Int | Double = null,
    verbose: js.UndefOr[Boolean] = js.undefined,
    window: Int | Double = null
  ): PartialWaitOnOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpSignature != null) __obj.updateDynamic("httpSignature")(httpSignature.asInstanceOf[js.Any])
    if (httpTimeout != null) __obj.updateDynamic("httpTimeout")(httpTimeout.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (simultaneous != null) __obj.updateDynamic("simultaneous")(simultaneous.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.asInstanceOf[js.Any])
    if (tcpTimeout != null) __obj.updateDynamic("tcpTimeout")(tcpTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWaitOnOptions]
  }
}

