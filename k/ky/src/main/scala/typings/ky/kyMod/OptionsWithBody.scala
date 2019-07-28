package typings.ky.kyMod

import org.scalablytyped.runtime.StringDictionary
import typings.ky.kyNumbers.`false`
import typings.ky.kyStrings.delete
import typings.ky.kyStrings.post
import typings.ky.kyStrings.put
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.URL
import typings.std.URLSearchParams
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsWithBody extends Options {
  @JSName("method")
  var method_OptionsWithBody: js.UndefOr[post | put | delete] = js.undefined
}

object OptionsWithBody {
  @scala.inline
  def apply(
    body: BodyInit = null,
    cache: RequestCache = null,
    credentials: RequestCredentials = null,
    headers: HeadersInit = null,
    hooks: Hooks = null,
    integrity: String = null,
    json: js.Any = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: post | put | delete = null,
    mode: RequestMode = null,
    onDownloadProgress: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit = null,
    prefixUrl: URL | String = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    retry: Int | Double = null,
    searchParams: String | (StringDictionary[String | Double]) | URLSearchParams = null,
    signal: AbortSignal = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | `false` = null,
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

