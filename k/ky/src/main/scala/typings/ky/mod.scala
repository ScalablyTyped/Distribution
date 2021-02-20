package typings.ky

import org.scalablytyped.runtime.StringDictionary
import typings.ky.anon.Call
import typings.ky.anon._empty
import typings.ky.kyBooleans.`false`
import typings.ky.kyStrings.delete
import typings.ky.kyStrings.get
import typings.ky.kyStrings.head
import typings.ky.kyStrings.patch
import typings.ky.kyStrings.post
import typings.ky.kyStrings.put
import typings.std.ArrayBuffer
import typings.std.Blob
import typings.std.Error
import typings.std.FormData
import typings.std.Headers
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import typings.std.URL
import typings.std.URLSearchParams
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Fetch the given `url`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` method added.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		const parsed = await ky('https://example.com', {json: {foo: true}}).json();
    		console.log(parsed);
    		//=> `{data: '🦄'}`
    	})();
    	```
    	*/
    @JSImport("ky", JSImport.Default)
    @js.native
    def apply(url: Input): ResponsePromise = js.native
    @JSImport("ky", JSImport.Default)
    @js.native
    def apply(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with complete new defaults.
    	@returns A new Ky instance.
    	*/
    @JSImport("ky", "default.create")
    @js.native
    def create(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'delete'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.delete")
    @js.native
    def delete(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.delete")
    @js.native
    def delete(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Create a new Ky instance with some defaults overridden with your own.
    	In contrast to `ky.create()`, `ky.extend()` inherits defaults from its parent.
    	@returns A new Ky instance.
    	*/
    @JSImport("ky", "default.extend")
    @js.native
    def extend(defaultOptions: Options): Call = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'get'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.get")
    @js.native
    def get(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.get")
    @js.native
    def get(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'head'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.head")
    @js.native
    def head(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.head")
    @js.native
    def head(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'patch'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.patch")
    @js.native
    def patch(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.patch")
    @js.native
    def patch(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'post'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.post")
    @js.native
    def post(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.post")
    @js.native
    def post(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	Fetch the given `url` using the option `{method: 'put'}`.
    	@param url - `Request` object, `URL` object, or URL string.
    	@returns A promise with `Body` methods added.
    	*/
    @JSImport("ky", "default.put")
    @js.native
    def put(url: Input): ResponsePromise = js.native
    @JSImport("ky", "default.put")
    @js.native
    def put(url: Input, options: Options): ResponsePromise = js.native
    
    /**
    	A `Symbol` that can be returned by a `beforeRetry` hook to stop the retry.
    	This will also short circuit the remaining `beforeRetry` hooks.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		await ky('https://example.com', {
    			hooks: {
    				beforeRetry: [
    					async (request, options, errors, retryCount) => {
    						const shouldStopRetry = await ky('https://example.com/api');
    						if (shouldStopRetry) {
    							return ky.stop;
    						}
    					}
    				]
    			}
    		});
    	})();
    	```
    	*/
    @JSImport("ky", "default.stop")
    @js.native
    val stop: js.Symbol = js.native
  }
  
  @JSImport("ky", "HTTPError")
  @js.native
  class HTTPError protected () extends Error {
    def this(response: Response) = this()
    
    var response: Response = js.native
  }
  
  @JSImport("ky", "TimeoutError")
  @js.native
  class TimeoutError () extends Error
  
  type AfterResponseHook = js.Function3[
    /* request */ Request, 
    /* options */ NormalizedOptions, 
    /* response */ Response, 
    Response | Unit | (js.Promise[Response | Unit])
  ]
  
  type BeforeRequestHook = js.Function2[
    /* request */ Request, 
    /* options */ NormalizedOptions, 
    Request | Response | Unit | (js.Promise[Request | Response | Unit])
  ]
  
  type BeforeRetryHook = js.Function4[
    /* request */ Request, 
    /* options */ NormalizedOptions, 
    /* error */ Error, 
    /* retryCount */ Double, 
    Unit | js.Promise[Unit]
  ]
  
  @js.native
  trait DownloadProgress extends StObject {
    
    var percent: Double = js.native
    
    /**
    	Note: If it's not possible to retrieve the body size, it will be `0`.
    	*/
    var totalBytes: Double = js.native
    
    var transferredBytes: Double = js.native
  }
  object DownloadProgress {
    
    @scala.inline
    def apply(percent: Double, totalBytes: Double, transferredBytes: Double): DownloadProgress = {
      val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any], transferredBytes = transferredBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadProgress]
    }
    
    @scala.inline
    implicit class DownloadProgressMutableBuilder[Self <: DownloadProgress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalBytes(value: Double): Self = StObject.set(x, "totalBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransferredBytes(value: Double): Self = StObject.set(x, "transferredBytes", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Hooks extends StObject {
    
    /**
    	This hook enables you to read and optionally modify the response. The hook function receives normalized input, options, and a clone of the response as arguments. The return value of the hook function will be used by Ky as the response object if it's an instance of [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response).
    	@default []
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		await ky('https://example.com', {
    			hooks: {
    				afterResponse: [
    					(_input, _options, response) => {
    						// You could do something with the response, for example, logging.
    						log(response);
    						// Or return a `Response` instance to overwrite the response.
    						return new Response('A different response', {status: 200});
    					},
    					// Or retry with a fresh token on a 403 error
    					async (input, options, response) => {
    						if (response.status === 403) {
    							// Get a fresh token
    							const token = await ky('https://example.com/token').text();
    							// Retry with the token
    							options.headers.set('Authorization', `token ${token}`);
    							return ky(input, options);
    						}
    					}
    				]
    			}
    		});
    	})();
    	```
    	*/
    var afterResponse: js.UndefOr[js.Array[AfterResponseHook]] = js.native
    
    /**
    	This hook enables you to modify the request right before it is sent. Ky will make no further changes to the request after this. The hook function receives normalized input and options as arguments. You could, for example, modify `options.headers` here.
    	A [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response) can be returned from this hook to completely avoid making a HTTP request. This can be used to mock a request, check an internal cache, etc. An **important** consideration when returning a `Response` from this hook is that all the following hooks will be skipped, so **ensure you only return a `Response` from the last hook**.
    	@default []
    	*/
    var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook]] = js.native
    
    /**
    	This hook enables you to modify the request right before retry. Ky will make no further changes to the request after this. The hook function receives the normalized input and options, an error instance and the retry count as arguments. You could, for example, modify `options.headers` here.
    	@example
    	```
    	import ky from 'ky';
    	(async () => {
    		await ky('https://example.com', {
    			hooks: {
    				beforeRetry: [
    					async (input, options, errors, retryCount) => {
    						const token = await ky('https://example.com/refresh-token');
    						options.headers.set('Authorization', `token ${token}`);
    					}
    				]
    			}
    		});
    	})();
    	```
    	@default []
    	*/
    var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook]] = js.native
  }
  object Hooks {
    
    @scala.inline
    def apply(): Hooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hooks]
    }
    
    @scala.inline
    implicit class HooksMutableBuilder[Self <: Hooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterResponse(value: js.Array[AfterResponseHook]): Self = StObject.set(x, "afterResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
      
      @scala.inline
      def setAfterResponseVarargs(value: AfterResponseHook*): Self = StObject.set(x, "afterResponse", js.Array(value :_*))
      
      @scala.inline
      def setBeforeRequest(value: js.Array[BeforeRequestHook]): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      @scala.inline
      def setBeforeRequestVarargs(value: BeforeRequestHook*): Self = StObject.set(x, "beforeRequest", js.Array(value :_*))
      
      @scala.inline
      def setBeforeRetry(value: js.Array[BeforeRetryHook]): Self = StObject.set(x, "beforeRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeRetryUndefined: Self = StObject.set(x, "beforeRetry", js.undefined)
      
      @scala.inline
      def setBeforeRetryVarargs(value: BeforeRetryHook*): Self = StObject.set(x, "beforeRetry", js.Array(value :_*))
    }
  }
  
  type Input = Request | URL | String
  
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with _empty)
  
  @js.native
  trait NormalizedOptions extends RequestInit {
    
    // New type.
    @JSName("headers")
    var headers_NormalizedOptions: Headers = js.native
    
    var onDownloadProgress: js.UndefOr[js.Function2[/* progress */ DownloadProgress, /* chunk */ Uint8Array, Unit]] = js.native
    
    var prefixUrl: js.UndefOr[URL | String] = js.native
    
    // Extended from custom `KyOptions`, but ensured to be set (not optional).
    var retry: js.UndefOr[RetryOptions | Double] = js.native
  }
  object NormalizedOptions {
    
    @scala.inline
    def apply(headers: Headers): NormalizedOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[NormalizedOptions]
    }
    
    @scala.inline
    implicit class NormalizedOptionsMutableBuilder[Self <: NormalizedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      @scala.inline
      def setPrefixUrl(value: URL | String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUrlUndefined: Self = StObject.set(x, "prefixUrl", js.undefined)
      
      @scala.inline
      def setRetry(value: RetryOptions | Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
  
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHooks(value: Hooks): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      @scala.inline
      def setJson(value: js.Any): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setMethod(value: LiteralUnion[get | post | put | delete | patch | head, String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnDownloadProgress(value: (/* progress */ DownloadProgress, /* chunk */ Uint8Array) => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      @scala.inline
      def setPrefixUrl(value: URL | String): Self = StObject.set(x, "prefixUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUrlUndefined: Self = StObject.set(x, "prefixUrl", js.undefined)
      
      @scala.inline
      def setRetry(value: RetryOptions | Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setSearchParams(
        value: String | (StringDictionary[String | Double | Boolean]) | (js.Array[js.Array[String | Double | Boolean]]) | URLSearchParams
      ): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
      
      @scala.inline
      def setSearchParamsVarargs(value: (js.Array[String | Double | Boolean])*): Self = StObject.set(x, "searchParams", js.Array(value :_*))
      
      @scala.inline
      def setThrowHttpErrors(value: Boolean): Self = StObject.set(x, "throwHttpErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowHttpErrorsUndefined: Self = StObject.set(x, "throwHttpErrors", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | `false`): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  @js.native
  trait ResponsePromise
    extends js.Promise[Response] {
    
    def arrayBuffer(): js.Promise[ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    def formData(): js.Promise[FormData] = js.native
    
    // TODO: Use `json<T extends JSONValue>(): Promise<T>;` when it's fixed in TS.
    // See https://github.com/microsoft/TypeScript/issues/15300 and https://github.com/sindresorhus/ky/pull/80
    /**
    	Get the response body as JSON.
    	@example
    	```
    	import ky from 'ky';
    	const parsed = await ky(…).json();
    	```
    	@example
    	```
    	import ky from 'ky';
    	interface Result {
    		value: number;
    	}
    	const result = await ky(…).json<Result>();
    	```
    	*/
    def json[T](): js.Promise[T] = js.native
    
    def text(): js.Promise[String] = js.native
  }
  
  @js.native
  trait RetryOptions extends StObject {
    
    /**
    	The HTTP status codes allowed to retry with a `Retry-After` header.
    	@default [413, 429, 503]
    	*/
    var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.native
    
    /**
    	The number of times to retry failed requests.
    	@default 2
    	*/
    var limit: js.UndefOr[Double] = js.native
    
    /**
    	If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
    	@default Infinity
    	*/
    var maxRetryAfter: js.UndefOr[Double] = js.native
    
    /**
    	The HTTP methods allowed to retry.
    	@default ['get', 'put', 'head', 'delete', 'options', 'trace']
    	*/
    var methods: js.UndefOr[js.Array[String]] = js.native
    
    /**
    	The HTTP status codes allowed to retry.
    	@default [408, 413, 429, 500, 502, 503, 504]
    	*/
    var statusCodes: js.UndefOr[js.Array[Double]] = js.native
  }
  object RetryOptions {
    
    @scala.inline
    def apply(): RetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryOptions]
    }
    
    @scala.inline
    implicit class RetryOptionsMutableBuilder[Self <: RetryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "afterStatusCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterStatusCodesUndefined: Self = StObject.set(x, "afterStatusCodes", js.undefined)
      
      @scala.inline
      def setAfterStatusCodesVarargs(value: Double*): Self = StObject.set(x, "afterStatusCodes", js.Array(value :_*))
      
      @scala.inline
      def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      @scala.inline
      def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRetryAfterUndefined: Self = StObject.set(x, "maxRetryAfter", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      @scala.inline
      def setStatusCodesVarargs(value: Double*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
    }
  }
}
