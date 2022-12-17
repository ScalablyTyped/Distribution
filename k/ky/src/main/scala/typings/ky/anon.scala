package typings.ky

import typings.ky.distributionTypesCommonMod.LiteralUnion
import typings.ky.distributionTypesHooksMod.AfterResponseHook
import typings.ky.distributionTypesHooksMod.BeforeErrorHook
import typings.ky.distributionTypesHooksMod.BeforeRequestHook
import typings.ky.distributionTypesHooksMod.BeforeRetryHook
import typings.ky.distributionTypesHooksMod.Hooks
import typings.ky.distributionTypesOptionsMod.DownloadProgress
import typings.ky.distributionTypesOptionsMod.HttpMethod
import typings.ky.distributionTypesOptionsMod.KyHeadersInit
import typings.ky.distributionTypesOptionsMod.SearchParamsOption
import typings.ky.distributionTypesRetryMod.RetryOptions
import typings.ky.kyBooleans.`false`
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.IterableIterator
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.Response
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(input: RequestInfo): js.Promise[Response] = js.native
    def apply(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    def apply(input: URL): js.Promise[Response] = js.native
    def apply(input: URL, init: RequestInit): js.Promise[Response] = js.native
  }
  
  /* Inlined std.Partial<ky.ky/distribution/types/options.Options> */
  trait PartialOptions extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    var fetch: js.UndefOr[
        js.Function2[/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit], js.Promise[Response]]
      ] = js.undefined
    
    var headers: js.UndefOr[KyHeadersInit] = js.undefined
    
    var hooks: js.UndefOr[Hooks] = js.undefined
    
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
    
    var retry: js.UndefOr[RetryOptions | Double] = js.undefined
    
    var searchParams: js.UndefOr[SearchParamsOption] = js.undefined
    
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    var throwHttpErrors: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Double | `false`] = js.undefined
    
    var window: js.UndefOr[Null] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
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
  
  /* Inlined ky.ky/distribution/types/common.Required<std.Headers, keyof std.Headers> */
  @js.native
  trait RequiredHeaderskeyofHeade extends StObject {
    
    /* standard dom */
    def append(name: String, value: String): Unit = js.native
    @JSName("append")
    var append_Original: js.Function2[/* name */ String, /* value */ String, Unit] = js.native
    
    /* standard dom */
    def delete(name: String): Unit = js.native
    @JSName("delete")
    var delete_Original: js.Function1[/* name */ String, Unit] = js.native
    
    /** Returns an iterator allowing to go through all key/value pairs contained in this object. */
    /* standard dom.iterable */
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    @JSName("entries")
    var entries_Original: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    /* standard dom */
    def forEach(callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit]): Unit = js.native
    def forEach(
      callbackfn: js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit],
      thisArg: Any
    ): Unit = js.native
    @JSName("forEach")
    var forEach_Original: js.Function1[
        /* callbackfn */ js.Function3[/* value */ String, /* key */ String, /* parent */ this.type, Unit], 
        Unit
      ] = js.native
    
    /* standard dom */
    def get(name: String): String | Null = js.native
    @JSName("get")
    var get_Original: js.Function1[/* name */ String, String | Null] = js.native
    
    /* standard dom */
    def has(name: String): Boolean = js.native
    @JSName("has")
    var has_Original: js.Function1[/* name */ String, Boolean] = js.native
    
    /* standard dom.iterable */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[String, String]]] = js.native
    
    /** Returns an iterator allowing to go through all keys of the key/value pairs contained in this object. */
    /* standard dom.iterable */
    def keys(): IterableIterator[String] = js.native
    @JSName("keys")
    var keys_Original: js.Function0[IterableIterator[String]] = js.native
    
    /* standard dom */
    def set(name: String, value: String): Unit = js.native
    @JSName("set")
    var set_Original: js.Function2[/* name */ String, /* value */ String, Unit] = js.native
    
    /** Returns an iterator allowing to go through all values of the key/value pairs contained in this object. */
    /* standard dom.iterable */
    def values(): IterableIterator[String] = js.native
    @JSName("values")
    var values_Original: js.Function0[IterableIterator[String]] = js.native
  }
  
  /* Inlined ky.ky/distribution/types/common.Required<ky.ky/distribution/types/hooks.Hooks, keyof ky.ky/distribution/types/hooks.Hooks> */
  trait RequiredHookskeyofHooks extends StObject {
    
    /**
      This hook enables you to read and optionally modify the response. The hook function receives normalized input, options, and a clone of the response as arguments. The return value of the hook function will be used by Ky as the response object if it's an instance of [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response).
      @default []
      @example
      ```
      import ky from 'ky';
      const response = await ky('https://example.com', {
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
      ```
      */
    var afterResponse: js.UndefOr[js.Array[AfterResponseHook]] = js.undefined
    
    /**
      This hook enables you to modify the `HTTPError` right before it is thrown. The hook function receives a `HTTPError` as an argument and should return an instance of `HTTPError`.
      @default []
      @example
      ```
      import ky from 'ky';
      await ky('https://example.com', {
      hooks: {
      beforeError: [
      error => {
      const {response} = error;
      if (response && response.body) {
      error.name = 'GitHubError';
      error.message = `${response.body.message} (${response.statusCode})`;
      }
      return error;
      }
      ]
      }
      });
      ```
      */
    var beforeError: js.UndefOr[js.Array[BeforeErrorHook]] = js.undefined
    
    /**
      This hook enables you to modify the request right before it is sent. Ky will make no further changes to the request after this. The hook function receives normalized input and options as arguments. You could, forf example, modiy `options.headers` here.
      A [`Response`](https://developer.mozilla.org/en-US/docs/Web/API/Response) can be returned from this hook to completely avoid making a HTTP request. This can be used to mock a request, check an internal cache, etc. An **important** consideration when returning a `Response` from this hook is that all the following hooks will be skipped, so **ensure you only return a `Response` from the last hook**.
      @default []
      */
    var beforeRequest: js.UndefOr[js.Array[BeforeRequestHook]] = js.undefined
    
    /**
      This hook enables you to modify the request right before retry. Ky will make no further changes to the request after this. The hook function receives an object with the normalized request and options, an error instance, and the retry count. You could, for example, modify `request.headers` here.
      If the request received a response, the error will be of type `HTTPError` and the `Response` object will be available at `error.response`. Be aware that some types of errors, such as network errors, inherently mean that a response was not received. In that case, the error will not be an instance of `HTTPError`.
      You can prevent Ky from retrying the request by throwing an error. Ky will not handle it in any way and the error will be propagated to the request initiator. The rest of the `beforeRetry` hooks will not be called in this case. Alternatively, you can return the [`ky.stop`](#ky.stop) symbol to do the same thing but without propagating an error (this has some limitations, see `ky.stop` docs for details).
      @example
      ```
      import ky from 'ky';
      const response = await ky('https://example.com', {
      hooks: {
      beforeRetry: [
      async ({request, options, error, retryCount}) => {
      const token = await ky('https://example.com/refresh-token');
      options.headers.set('Authorization', `token ${token}`);
      }
      ]
      }
      });
      ```
      @default []
      */
    var beforeRetry: js.UndefOr[js.Array[BeforeRetryHook]] = js.undefined
  }
  object RequiredHookskeyofHooks {
    
    inline def apply(): RequiredHookskeyofHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequiredHookskeyofHooks]
    }
    
    extension [Self <: RequiredHookskeyofHooks](x: Self) {
      
      inline def setAfterResponse(value: js.Array[AfterResponseHook]): Self = StObject.set(x, "afterResponse", value.asInstanceOf[js.Any])
      
      inline def setAfterResponseUndefined: Self = StObject.set(x, "afterResponse", js.undefined)
      
      inline def setAfterResponseVarargs(value: AfterResponseHook*): Self = StObject.set(x, "afterResponse", js.Array(value*))
      
      inline def setBeforeError(value: js.Array[BeforeErrorHook]): Self = StObject.set(x, "beforeError", value.asInstanceOf[js.Any])
      
      inline def setBeforeErrorUndefined: Self = StObject.set(x, "beforeError", js.undefined)
      
      inline def setBeforeErrorVarargs(value: BeforeErrorHook*): Self = StObject.set(x, "beforeError", js.Array(value*))
      
      inline def setBeforeRequest(value: js.Array[BeforeRequestHook]): Self = StObject.set(x, "beforeRequest", value.asInstanceOf[js.Any])
      
      inline def setBeforeRequestUndefined: Self = StObject.set(x, "beforeRequest", js.undefined)
      
      inline def setBeforeRequestVarargs(value: BeforeRequestHook*): Self = StObject.set(x, "beforeRequest", js.Array(value*))
      
      inline def setBeforeRetry(value: js.Array[BeforeRetryHook]): Self = StObject.set(x, "beforeRetry", value.asInstanceOf[js.Any])
      
      inline def setBeforeRetryUndefined: Self = StObject.set(x, "beforeRetry", js.undefined)
      
      inline def setBeforeRetryVarargs(value: BeforeRetryHook*): Self = StObject.set(x, "beforeRetry", js.Array(value*))
    }
  }
  
  /* Inlined std.Required<ky.ky/distribution/types/retry.RetryOptions> */
  trait RequiredRetryOptions extends StObject {
    
    var afterStatusCodes: js.Array[Double]
    
    var limit: Double
    
    var maxRetryAfter: Double
    
    var methods: js.Array[String]
    
    var statusCodes: js.Array[Double]
  }
  object RequiredRetryOptions {
    
    inline def apply(
      afterStatusCodes: js.Array[Double],
      limit: Double,
      maxRetryAfter: Double,
      methods: js.Array[String],
      statusCodes: js.Array[Double]
    ): RequiredRetryOptions = {
      val __obj = js.Dynamic.literal(afterStatusCodes = afterStatusCodes.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], maxRetryAfter = maxRetryAfter.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], statusCodes = statusCodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredRetryOptions]
    }
    
    extension [Self <: RequiredRetryOptions](x: Self) {
      
      inline def setAfterStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "afterStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setAfterStatusCodesVarargs(value: Double*): Self = StObject.set(x, "afterStatusCodes", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesVarargs(value: Double*): Self = StObject.set(x, "statusCodes", js.Array(value*))
    }
  }
  
  /* Inlined ky.ky/distribution/types/common.Required<ky.ky/distribution/types/retry.RetryOptions, keyof ky.ky/distribution/types/retry.RetryOptions> */
  trait RequiredRetryOptionskeyof extends StObject {
    
    /**
      The HTTP status codes allowed to retry with a `Retry-After` header.
      @default [413, 429, 503]
      */
    var afterStatusCodes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      The number of times to retry failed requests.
      @default 2
      */
    var limit: js.UndefOr[Double] = js.undefined
    
    /**
      If the `Retry-After` header is greater than `maxRetryAfter`, the request will be canceled.
      @default Infinity
      */
    var maxRetryAfter: js.UndefOr[Double] = js.undefined
    
    /**
      The HTTP methods allowed to retry.
      @default ['get', 'put', 'head', 'delete', 'options', 'trace']
      */
    var methods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      The HTTP status codes allowed to retry.
      @default [408, 413, 429, 500, 502, 503, 504]
      */
    var statusCodes: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object RequiredRetryOptionskeyof {
    
    inline def apply(): RequiredRetryOptionskeyof = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequiredRetryOptionskeyof]
    }
    
    extension [Self <: RequiredRetryOptionskeyof](x: Self) {
      
      inline def setAfterStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "afterStatusCodes", value.asInstanceOf[js.Any])
      
      inline def setAfterStatusCodesUndefined: Self = StObject.set(x, "afterStatusCodes", js.undefined)
      
      inline def setAfterStatusCodesVarargs(value: Double*): Self = StObject.set(x, "afterStatusCodes", js.Array(value*))
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryAfterUndefined: Self = StObject.set(x, "maxRetryAfter", js.undefined)
      
      inline def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      inline def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value*))
      
      inline def setStatusCodes(value: js.Array[Double]): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
      
      inline def setStatusCodesVarargs(value: Double*): Self = StObject.set(x, "statusCodes", js.Array(value*))
    }
  }
  
  trait _empty extends StObject {
    
    @JSName("_")
    var _underscore: js.UndefOr[scala.Nothing] = js.undefined
  }
}
