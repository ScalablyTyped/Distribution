package typings.ky.kyMod

import org.scalablytyped.runtime.StringDictionary
import typings.ky.kyNumbers.`false`
import typings.ky.kyStrings.delete
import typings.ky.kyStrings.get
import typings.ky.kyStrings.head
import typings.ky.kyStrings.patch
import typings.ky.kyStrings.post
import typings.ky.kyStrings.put
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.URL
import typings.std.URLSearchParams
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends RequestInit {
  /**
  	Hooks allow modifications during the request lifecycle. Hook functions may be async and are run serially.
  	*/
  var hooks: js.UndefOr[Hooks] = js.undefined
  /**
  	Shortcut for sending JSON. Use this instead of the `body` option.
  	Accepts a plain object which will be `JSON.stringify()`'d and the correct header will be set for you.
  	*/
  var json: js.UndefOr[js.Any] = js.undefined
  /**
  	HTTP method used to make the request.
  	Internally, the standard methods (`GET`, `POST`, `PUT`, `PATCH`, `HEAD` and `DELETE`) are uppercased in order to avoid server errors due to case sensitivity.
  	*/
  @JSName("method")
  var method_Options: js.UndefOr[LiteralUnion[get | post | put | delete | patch | head, String]] = js.undefined
  /**
  	Download progress event handler.
  	@param chunk - Note: It's empty for the first call.
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		await ky('https://example.com', {
  			onDownloadProgress: (progress, chunk) => {
  				// Example output:
  				// `0% - 0 of 1271 bytes`
  				// `100% - 1271 of 1271 bytes`
  				console.log(`${progress.percent * 100}% - ${progress.transferredBytes} of ${progress.totalBytes} bytes`);
  			}
  		});
  	})();
  	```
  	*/
  var onDownloadProgress: js.UndefOr[js.Function2[/* progress */ DownloadProgress, /* chunk */ Uint8Array, Unit]] = js.undefined
  /**
  	A prefix to prepend to the `input` URL when making the request. It can be any valid URL, either relative or absolute. A trailing slash `/` is optional and will be added automatically, if needed, when it is joined with `input`. Only takes effect when `input` is a string. The `input` argument cannot start with a slash `/` when using this option.
  	Useful when used with [`ky.extend()`](#kyextenddefaultoptions) to create niche-specific Ky-instances.
  	Notes:
  	 - After `prefixUrl` and `input` are joined, the result is resolved against the [base URL](https://developer.mozilla.org/en-US/docs/Web/API/Node/baseURI) of the page (if any).
  	 - Leading slashes in `input` are disallowed when using this option to enforce consistency and avoid confusion about how the `input` URL is handled, given that `input` will not follow the normal URL resolution rules when `prefixUrl` is being used, which changes the meaning of a leading slash.
  	@example
  	```
  	import ky from 'ky';
  	// On https://example.com
  	(async () => {
  		await ky('unicorn', {prefixUrl: '/api'});
  		//=> 'https://example.com/api/unicorn'
  		await ky('unicorn', {prefixUrl: 'https://cats.com'});
  		//=> 'https://cats.com/unicorn'
  	})();
  	```
  	*/
  var prefixUrl: js.UndefOr[URL | String] = js.undefined
  /**
  	An object representing `limit`, `methods`, `statusCodes` and `maxRetryAfter` fields for maximum retry count, allowed methods, allowed status codes and maximum [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) time.
  	If `retry` is a number, it will be used as `limit` and other defaults will remain in place.
  	If `maxRetryAfter` is set to `undefined`, it will use `options.timeout`. If [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) header is greater than `maxRetryAfter`, it will cancel the request.
  	Delays between retries is calculated with the function `0.3 * (2 ** (retry - 1)) * 1000`, where `retry` is the attempt number (starts from 1).
  	@example
  	```
  	import ky from 'ky';
  	(async () => {
  		const parsed = await ky('https://example.com', {
  			retry: {
  				limit: 10,
  				methods: ['get'],
  				statusCodes: [413]
  			}
  		}).json();
  	})();
  	```
  	*/
  var retry: js.UndefOr[RetryOptions | Double] = js.undefined
  /**
  	Search parameters to include in the request URL. Setting this will override all existing search parameters in the input URL.
  	Accepts any value supported by [`URLSearchParams()`](https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams).
  	*/
  var searchParams: js.UndefOr[
    String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
  ] = js.undefined
  /**
  	Throw a `HTTPError` for error responses (non-2xx status codes).
  	Setting this to `false` may be useful if you are checking for resource availability and are expecting error responses.
  	@default true
  	*/
  var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
  /**
  	Timeout in milliseconds for getting a response. Can not be greater than 2147483647.
  	If set to `false`, there will be no timeout.
  	@default 10000
  	*/
  var timeout: js.UndefOr[Double | `false`] = js.undefined
}

object Options {
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
    method: LiteralUnion[get | post | put | delete | patch | head, String] = null,
    mode: RequestMode = null,
    onDownloadProgress: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit = null,
    prefixUrl: URL | String = null,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    retry: RetryOptions | Double = null,
    searchParams: String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams = null,
    signal: AbortSignal = null,
    throwHttpErrors: js.UndefOr[Boolean] = js.undefined,
    timeout: Double | `false` = null,
    window: js.Any = null
  ): Options = {
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
    __obj.asInstanceOf[Options]
  }
}

