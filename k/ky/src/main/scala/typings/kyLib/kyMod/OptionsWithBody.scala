package typings
package kyLib.kyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithBody extends Options {
  @JSName("method")
  var method_OptionsWithBody: js.UndefOr[kyLib.kyLibStrings.post | kyLib.kyLibStrings.put | kyLib.kyLibStrings.delete] = js.undefined
}

object OptionsWithBody {
  @scala.inline
  def apply(
    body: stdLib.BodyInit = null,
    cache: stdLib.RequestCache = null,
    credentials: stdLib.RequestCredentials = null,
    headers: stdLib.HeadersInit = null,
    hooks: Hooks = null,
    integrity: java.lang.String = null,
    json: js.Any = null,
    keepalive: js.UndefOr[scala.Boolean] = js.undefined,
    method: kyLib.kyLibStrings.post | kyLib.kyLibStrings.put | kyLib.kyLibStrings.delete = null,
    mode: stdLib.RequestMode = null,
    onDownloadProgress: (/* progress */ DownloadProgress, /* chunk */ stdLib.Uint8Array) => scala.Unit = null,
    prefixUrl: stdLib.URL | java.lang.String = null,
    redirect: stdLib.RequestRedirect = null,
    referrer: java.lang.String = null,
    referrerPolicy: stdLib.ReferrerPolicy = null,
    retry: scala.Int | scala.Double = null,
    searchParams: java.lang.String | (org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]) | stdLib.URLSearchParams = null,
    signal: stdLib.AbortSignal = null,
    throwHttpErrors: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | kyLib.kyLibNumbers.`false` = null,
    window: js.Any = null
  ): OptionsWithBody = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache)
    if (credentials != null) __obj.updateDynamic("credentials")(credentials)
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks)
    if (integrity != null) __obj.updateDynamic("integrity")(integrity)
    if (json != null) __obj.updateDynamic("json")(json)
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive)
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onDownloadProgress != null) __obj.updateDynamic("onDownloadProgress")(js.Any.fromFunction2(onDownloadProgress))
    if (prefixUrl != null) __obj.updateDynamic("prefixUrl")(prefixUrl.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy)
    if (retry != null) __obj.updateDynamic("retry")(retry.asInstanceOf[js.Any])
    if (searchParams != null) __obj.updateDynamic("searchParams")(searchParams.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal)
    if (!js.isUndefined(throwHttpErrors)) __obj.updateDynamic("throwHttpErrors")(throwHttpErrors)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[OptionsWithBody]
  }
}

