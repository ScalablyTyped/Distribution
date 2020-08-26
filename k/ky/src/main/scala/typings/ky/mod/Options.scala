package typings.ky.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ky.kyBooleans.`false`
import typings.ky.kyStrings.delete
import typings.ky.kyStrings.get
import typings.ky.kyStrings.head
import typings.ky.kyStrings.patch
import typings.ky.kyStrings.post
import typings.ky.kyStrings.put
import typings.std.RequestInit
import typings.std.URL
import typings.std.URLSearchParams
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends RequestInit {
  /**
  	Hooks allow modifications during the request lifecycle. Hook functions may be async and are run serially.
  	*/
  var hooks: js.UndefOr[Hooks] = js.native
  /**
  	Shortcut for sending JSON. Use this instead of the `body` option.
  	Accepts any plain object or value, which will be `JSON.stringify()`'d and sent in the body with the correct header set.
  	*/
  var json: js.UndefOr[js.Any] = js.native
  /**
  	HTTP method used to make the request.
  	Internally, the standard methods (`GET`, `POST`, `PUT`, `PATCH`, `HEAD` and `DELETE`) are uppercased in order to avoid server errors due to case sensitivity.
  	*/
  @JSName("method")
  var method_Options: js.UndefOr[LiteralUnion[get | post | put | delete | patch | head, String]] = js.native
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
  var onDownloadProgress: js.UndefOr[js.Function2[/* progress */ DownloadProgress, /* chunk */ Uint8Array, Unit]] = js.native
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
  var prefixUrl: js.UndefOr[URL | String] = js.native
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
  var retry: js.UndefOr[RetryOptions | Double] = js.native
  /**
  	Search parameters to include in the request URL. Setting this will override all existing search parameters in the input URL.
  	Accepts any value supported by [`URLSearchParams()`](https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams).
  	*/
  var searchParams: js.UndefOr[
    String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
  ] = js.native
  /**
  	Throw a `HTTPError` for error responses (non-2xx status codes).
  	Setting this to `false` may be useful if you are checking for resource availability and are expecting error responses.
  	@default true
  	*/
  var throwHttpErrors: js.UndefOr[Boolean] = js.native
  /**
  	Timeout in milliseconds for getting a response. Can not be greater than 2147483647.
  	If set to `false`, there will be no timeout.
  	@default 10000
  	*/
  var timeout: js.UndefOr[Double | `false`] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHooks(value: Hooks): Self = this.set("hooks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    @scala.inline
    def setJson(value: js.Any): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMethod(value: LiteralUnion[get | post | put | delete | patch | head, String]): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit): Self = this.set("onDownloadProgress", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnDownloadProgress: Self = this.set("onDownloadProgress", js.undefined)
    @scala.inline
    def setPrefixUrl(value: URL | String): Self = this.set("prefixUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixUrl: Self = this.set("prefixUrl", js.undefined)
    @scala.inline
    def setRetry(value: RetryOptions | Double): Self = this.set("retry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetry: Self = this.set("retry", js.undefined)
    @scala.inline
    def setSearchParamsVarargs(value: (js.Array[String | Double | Boolean])*): Self = this.set("searchParams", js.Array(value :_*))
    @scala.inline
    def setSearchParams(
      value: String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
    ): Self = this.set("searchParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchParams: Self = this.set("searchParams", js.undefined)
    @scala.inline
    def setThrowHttpErrors(value: Boolean): Self = this.set("throwHttpErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowHttpErrors: Self = this.set("throwHttpErrors", js.undefined)
    @scala.inline
    def setTimeout(value: Double | `false`): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

