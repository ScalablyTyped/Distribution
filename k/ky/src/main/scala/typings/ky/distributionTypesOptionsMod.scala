package typings.ky

import typings.ky.anon.RequiredHookskeyofHooks
import typings.ky.anon.RequiredRetryOptionskeyof
import typings.ky.distributionTypesCommonMod.LiteralUnion
import typings.ky.distributionTypesHooksMod.Hooks
import typings.ky.distributionTypesRetryMod.RetryOptions
import typings.ky.kyBooleans.`false`
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.Record
import typings.std.ReferrerPolicy
import typings.std.Request
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionTypesOptionsMod {
  
  trait DownloadProgress extends StObject {
    
    var percent: Double
    
    /**
      Note: If it's not possible to retrieve the body size, it will be `0`.
      */
    var totalBytes: Double
    
    var transferredBytes: Double
  }
  object DownloadProgress {
    
    inline def apply(percent: Double, totalBytes: Double, transferredBytes: Double): DownloadProgress = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], transferredBytes = transferredBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadProgress] (val x: Self) extends AnyVal {
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      inline def setTransferredBytes(value: Double): Self = StObject.set(x, "transferredBytes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ky.kyStrings.get
    - typings.ky.kyStrings.post
    - typings.ky.kyStrings.put
    - typings.ky.kyStrings.patch
    - typings.ky.kyStrings.head
    - typings.ky.kyStrings.delete
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def delete: typings.ky.kyStrings.delete = "delete".asInstanceOf[typings.ky.kyStrings.delete]
    
    inline def get: typings.ky.kyStrings.get = "get".asInstanceOf[typings.ky.kyStrings.get]
    
    inline def head: typings.ky.kyStrings.head = "head".asInstanceOf[typings.ky.kyStrings.head]
    
    inline def patch: typings.ky.kyStrings.patch = "patch".asInstanceOf[typings.ky.kyStrings.patch]
    
    inline def post: typings.ky.kyStrings.post = "post".asInstanceOf[typings.ky.kyStrings.post]
    
    inline def put: typings.ky.kyStrings.put = "put".asInstanceOf[typings.ky.kyStrings.put]
  }
  
  type Input = String | URL | Request
  
  /* Inlined ky.ky/distribution/types/common.Required<std.Omit<ky.ky/distribution/types/options.Options, 'hooks' | 'retry'>, 'credentials' | 'fetch' | 'prefixUrl' | 'timeout'> & {  headers :ky.ky/distribution/types/common.Required<std.Headers, keyof std.Headers>,   hooks :ky.ky/distribution/types/common.Required<ky.ky/distribution/types/hooks.Hooks, keyof ky.ky/distribution/types/hooks.Hooks>,   retry :ky.ky/distribution/types/common.Required<ky.ky/distribution/types/retry.RetryOptions, keyof ky.ky/distribution/types/retry.RetryOptions>,   prefixUrl :string} */
  trait InternalOptions extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    def fetch(input: RequestInfo): js.Promise[Response]
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response]
    @JSName("fetch")
    var fetch_Original: js.UndefOr[
        js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
      ] = js.undefined
    
    var headers: js.UndefOr[KyHeadersInit] = js.undefined
    
    var hooks: RequiredHookskeyofHooks
    
    var integrity: js.UndefOr[String] = js.undefined
    
    var json: js.UndefOr[Any] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[LiteralUnion[HttpMethod, String]] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var onDownloadProgress: js.UndefOr[
        js.Function2[/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array, Unit]
      ] = js.undefined
    
    var parseJson: js.UndefOr[js.Function1[/* text */ String, Any]] = js.undefined
    
    var prefixUrl: js.UndefOr[URL | String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    var retry: RequiredRetryOptionskeyof
    
    var searchParams: js.UndefOr[SearchParamsOption] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double | `false`] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object InternalOptions {
    
    inline def apply(hooks: RequiredHookskeyofHooks, retry: RequiredRetryOptionskeyof): InternalOptions = {
      val __obj = js.Dynamic.literal(hooks = hooks.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHeaders(value: KyHeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setHooks(value: RequiredHookskeyofHooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: LiteralUnion[HttpMethod, String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction2(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setParseJson(value: /* text */ String => Any): Self = StObject.set(x, "parseJson", js.Any.fromFunction1(value))
      
      inline def setParseJsonUndefined: Self = StObject.set(x, "parseJson", js.undefined)
      
      inline def setPrefixUrl(value: URL | String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
      
      inline def setPrefixUrlUndefined: Self = StObject.set(x, "prefixUrl", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setRetry(value: RequiredRetryOptionskeyof): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setSearchParams(value: SearchParamsOption): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
      
      inline def setSearchParamsVarargs(value: (js.Array[Boolean | Double | String])*): Self = StObject.set(x, "searchParams", js.Array(value*))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type KyHeadersInit = HeadersInit | (Record[String, js.UndefOr[String]])
  
  trait NormalizedOptions
    extends StObject
       with RequestInit {
    
    var onDownloadProgress: js.UndefOr[
        js.Function2[/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array, Unit]
      ] = js.undefined
    
    var prefixUrl: String
    
    var retry: RetryOptions
  }
  object NormalizedOptions {
    
    inline def apply(prefixUrl: String, retry: RetryOptions): NormalizedOptions = {
      val __obj = js.Dynamic.literal(prefixUrl = prefixUrl.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NormalizedOptions] (val x: Self) extends AnyVal {
      
      inline def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction2(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setPrefixUrl(value: String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
      
      inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Omit<std.RequestInit, 'headers'> */
  trait Options extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    /**
      User-defined `fetch` function.
      Has to be fully compatible with the [Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API) standard.
      Use-cases:
      1. Use custom `fetch` implementations like [`isomorphic-unfetch`](https://www.npmjs.com/package/isomorphic-unfetch).
      2. Use the `fetch` wrapper function provided by some frameworks that use server-side rendering (SSR).
      @default fetch
      @example
      ```
      import ky from 'ky';
      import fetch from 'isomorphic-unfetch';
      const json = await ky('https://example.com', {fetch}).json();
      ```
      */
    var fetch: js.UndefOr[
        js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
      ] = js.undefined
    
    /**
      HTTP headers used to make the request.
      You can pass a `Headers` instance or a plain object.
      You can remove a header with `.extend()` by passing the header with an `undefined` value.
      @example
      ```
      import ky from 'ky';
      const url = 'https://sindresorhus.com';
      const original = ky.create({
      headers: {
      rainbow: 'rainbow',
      unicorn: 'unicorn'
      }
      });
      const extended = original.extend({
      headers: {
      rainbow: undefined
      }
      });
      const response = await extended(url).json();
      console.log('rainbow' in response);
      //=> false
      console.log('unicorn' in response);
      //=> true
      ```
      */
    var headers: js.UndefOr[KyHeadersInit] = js.undefined
    
    /**
      Hooks allow modifications during the request lifecycle. Hook functions may be async and are run serially.
      */
    var hooks: js.UndefOr[Hooks] = js.undefined
    
    var integrity: js.UndefOr[String] = js.undefined
    
    /**
      Shortcut for sending JSON. Use this instead of the `body` option.
      Accepts any plain object or value, which will be `JSON.stringify()`'d and sent in the body with the correct header set.
      */
    var json: js.UndefOr[Any] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /**
      HTTP method used to make the request.
      Internally, the standard methods (`GET`, `POST`, `PUT`, `PATCH`, `HEAD` and `DELETE`) are uppercased in order to avoid server errors due to case sensitivity.
      */
    var method: js.UndefOr[LiteralUnion[HttpMethod, String]] = js.undefined
    
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    /**
      Download progress event handler.
      @param chunk - Note: It's empty for the first call.
      @example
      ```
      import ky from 'ky';
      const response = await ky('https://example.com', {
      onDownloadProgress: (progress, chunk) => {
      // Example output:
      // `0% - 0 of 1271 bytes`
      // `100% - 1271 of 1271 bytes`
      console.log(`${progress.percent * 100}% - ${progress.transferredBytes} of ${progress.totalBytes} bytes`);
      }
      });
      ```
      */
    var onDownloadProgress: js.UndefOr[
        js.Function2[/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array, Unit]
      ] = js.undefined
    
    /**
      User-defined JSON-parsing function.
      Use-cases:
      1. Parse JSON via the [`bourne` package](https://github.com/hapijs/bourne) to protect from prototype pollution.
      2. Parse JSON with [`reviver` option of `JSON.parse()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/JSON/parse).
      @default JSON.parse()
      @example
      ```
      import ky from 'ky';
      import bourne from '@hapijs/bourne';
      const json = await ky('https://example.com', {
      parseJson: text => bourne(text)
      }).json();
      ```
      */
    var parseJson: js.UndefOr[js.Function1[/* text */ String, Any]] = js.undefined
    
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
      const response = await ky('unicorn', {prefixUrl: '/api'});
      //=> 'https://example.com/api/unicorn'
      const response = await ky('unicorn', {prefixUrl: 'https://cats.com'});
      //=> 'https://cats.com/unicorn'
      ```
      */
    var prefixUrl: js.UndefOr[URL | String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var referrer: js.UndefOr[String] = js.undefined
    
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /**
      An object representing `limit`, `methods`, `statusCodes` and `maxRetryAfter` fields for maximum retry count, allowed methods, allowed status codes and maximum [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) time.
      If `retry` is a number, it will be used as `limit` and other defaults will remain in place.
      If `maxRetryAfter` is set to `undefined`, it will use `options.timeout`. If [`Retry-After`](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After) header is greater than `maxRetryAfter`, it will cancel the request.
      Delays between retries is calculated with the function `0.3 * (2 ** (retry - 1)) * 1000`, where `retry` is the attempt number (starts from 1).
      Retries are not triggered following a timeout.
      @example
      ```
      import ky from 'ky';
      const json = await ky('https://example.com', {
      retry: {
      limit: 10,
      methods: ['get'],
      statusCodes: [413]
      }
      }).json();
      ```
      */
    var retry: js.UndefOr[RetryOptions | Double] = js.undefined
    
    /**
      Search parameters to include in the request URL. Setting this will override all existing search parameters in the input URL.
      Accepts any value supported by [`URLSearchParams()`](https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams/URLSearchParams).
      */
    var searchParams: js.UndefOr[SearchParamsOption] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    /**
      Throw an `HTTPError` when, after following redirects, the response has a non-2xx status code. To also throw for redirects instead of following them, set the [`redirect`](https://developer.mozilla.org/en-US/docs/Web/API/WindowOrWorkerGlobalScope/fetch#Parameters) option to `'manual'`.
      Setting this to `false` may be useful if you are checking for resource availability and are expecting error responses.
      Note: If `false`, error responses are considered successful and the request will not be retried.
      @default true
      */
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      Timeout in milliseconds for getting a response, including any retries. Can not be greater than 2147483647.
      If set to `false`, there will be no timeout.
      @default 10000
      */
    var timeout: js.UndefOr[Double | `false`] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setFetch(value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[Response]): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
      
      inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
      
      inline def setHeaders(value: KyHeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setJson(value: Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: LiteralUnion[HttpMethod, String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ js.typedarray.Uint8Array) => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction2(value))
      
      inline def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      inline def setParseJson(value: /* text */ String => Any): Self = StObject.set(x, "parseJson", js.Any.fromFunction1(value))
      
      inline def setParseJsonUndefined: Self = StObject.set(x, "parseJson", js.undefined)
      
      inline def setPrefixUrl(value: URL | String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
      
      inline def setPrefixUrlUndefined: Self = StObject.set(x, "prefixUrl", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setRetry(value: RetryOptions | Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSearchParams(value: SearchParamsOption): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
      
      inline def setSearchParamsVarargs(value: (js.Array[Boolean | Double | String])*): Self = StObject.set(x, "searchParams", js.Array(value*))
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      inline def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      inline def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      inline def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type SearchParamsInit = js.UndefOr[String | js.Array[js.Array[String]] | (Record[String, String]) | URLSearchParams]
  
  type SearchParamsOption = SearchParamsInit | (Record[String, String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]])
}
