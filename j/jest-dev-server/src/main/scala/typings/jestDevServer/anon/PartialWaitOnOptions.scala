package typings.jestDevServer.anon

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
    delay: js.UndefOr[Double] = js.undefined,
    followAllRedirects: js.UndefOr[Boolean] = js.undefined,
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    headers: Record[String, _] = null,
    httpSignature: HttpSignature = null,
    httpTimeout: js.UndefOr[Double] = js.undefined,
    interval: js.UndefOr[Double] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    resources: js.Array[String] = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    simultaneous: js.UndefOr[Double] = js.undefined,
    strictSSL: js.UndefOr[Boolean] = js.undefined,
    tcpTimeout: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined,
    window: js.UndefOr[Double] = js.undefined
  ): PartialWaitOnOptions = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followAllRedirects)) __obj.updateDynamic("followAllRedirects")(followAllRedirects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.get.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (httpSignature != null) __obj.updateDynamic("httpSignature")(httpSignature.asInstanceOf[js.Any])
    if (!js.isUndefined(httpTimeout)) __obj.updateDynamic("httpTimeout")(httpTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(simultaneous)) __obj.updateDynamic("simultaneous")(simultaneous.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictSSL)) __obj.updateDynamic("strictSSL")(strictSSL.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tcpTimeout)) __obj.updateDynamic("tcpTimeout")(tcpTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(window)) __obj.updateDynamic("window")(window.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialWaitOnOptions]
  }
}

