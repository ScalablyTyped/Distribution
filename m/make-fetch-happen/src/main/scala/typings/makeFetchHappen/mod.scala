package typings.makeFetchHappen

import org.scalablytyped.runtime.Shortcut
import typings.makeFetchHappen.anon.FnCall
import typings.node.bufferMod.global.Buffer
import typings.node.httpMod.Agent
import typings.node.tlsMod.KeyObject
import typings.node.urlMod.URL_
import typings.nodeFetch.mod.BodyInit
import typings.nodeFetch.mod.HeadersInit
import typings.nodeFetch.mod.RequestRedirect
import typings.nodeFetch.mod.Response
import typings.retry.mod.TimeoutsOptions
import typings.ssri.mod.Integrity
import typings.std.Request
import typings.std.RequestCache
import typings.std.ReturnType
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("make-fetch-happen", JSImport.Namespace)
  @js.native
  val ^ : FetchInterface = js.native
  
  @js.native
  trait FetchInterface extends StObject {
    
    def apply(opts: FetchOptions): js.Promise[Response] = js.native
    def apply(uriOrRequest: String): js.Promise[Response] = js.native
    def apply(uriOrRequest: String, opts: FetchOptions): js.Promise[Response] = js.native
    def apply(uriOrRequest: Request): js.Promise[Response] = js.native
    def apply(uriOrRequest: Request, opts: FetchOptions): js.Promise[Response] = js.native
    
    def defaults(): FetchInterface = js.native
    def defaults(opts: FetchOptions): FetchInterface = js.native
    def defaults(uri: String): FetchInterface = js.native
    def defaults(uri: String, opts: FetchOptions): FetchInterface = js.native
    
    def delete(uri: String): ReturnType[FnCall] = js.native
    def delete(uri: String, opts: FetchOptions): ReturnType[FnCall] = js.native
  }
  
  /* Inlined make-fetch-happen.make-fetch-happen.NodeFetchOptions & make-fetch-happen.make-fetch-happen.TlsOptions & make-fetch-happen.make-fetch-happen.MakeFetchHappenOptions */
  trait FetchOptions extends StObject {
    
    var agent: js.UndefOr[
        Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])
      ] = js.undefined
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    /**
      * A string `Path` to be used as the cache root for [`cacache`](https://npm.im/cacache).
      *
      * Ref: https://github.com/npm/make-fetch-happen/#opts-cache-path
      */
    var cachePath: js.UndefOr[String] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    /**
      * Matches the response body against the given [Subresource
      * Integrity](https://developer.mozilla.org/en-US/docs/Web/Security/Subresource_Integrity)
      * metadata. If verification fails, the request will fail with an
      * `EINTEGRITY` error.
      *
      * `integrity` may either be a string or an
      * [`ssri`](https://npm.im/ssri) `Integrity`-like.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    /**
      * Passed directly to `http` and `https` request calls. Determines the
      * local address to bind to.
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum number of active concurrent sockets to use for the underlying
      * Http/Https/Proxy agents. This setting applies once per spawned agent.
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    /**
      * If present, should be a comma-separated string or an array of domain
      * extensions that a proxy should _not_ be used for.
      *
      * This option may also be provided through `process.env.NO_PROXY`.
      */
    var noProxy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * A function called whenever a retry is attempted.
      */
    var onRetry: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var proxy: js.UndefOr[String | URL_ | URL] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /**
      * An object that can be used to tune request retry settings. Retries
      * will only be attempted on the following conditions:
      *
      * - Request method is NOT `POST`; **AND**
      * - Request status is one of: `408`, `420`, `429`, or any status in the
      *   500-range.; **OR**
      * - Request errored with `ECONNRESET`, `ECONNREFUSED`, `EADDRINUSE`,
      *   `ETIMEDOUT`, or the `fetch` error `request-timeout`.
      *
      * The following are worth noting as explicitly not retried:
      *
      * - `getaddrinfo ENOTFOUND` and will be assumed to be either an
      *   unreachable domain or the user will be assumed offline. If a
      *   response is cached, it will be returned immediately.
      * - `ECONNRESET` currently has no support for restarting. It will
      *   eventually be supported but requires a bit more juggling due to
      *   streaming.
      *
      * If `opts.retry` is `false`, it is equivalent to `{retries: 0}`
      *
      * If `opts.retry` is a number, it is equivalent to `{retries: num}`
      *
      * The following retry options are available if you want more control
      * over it:
      *
      * - `retries`
      * - `factor`
      * - `minTimeout`
      * - `maxTimeout`
      * - `randomize`
      *
      * For details on what each of these do, refer to the
      * [`retry`](https://npm.im/retry) documentation.
      */
    var retry: js.UndefOr[Boolean | Double | TimeoutsOptions] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var timeout: js.UndefOr[Any] = js.undefined
  }
  object FetchOptions {
    
    inline def apply(): FetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FetchOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL => js.UndefOr[Agent | Boolean]): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setNoProxy(value: String | js.Array[String]): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
      
      inline def setNoProxyUndefined: Self = StObject.set(x, "noProxy", js.undefined)
      
      inline def setNoProxyVarargs(value: String*): Self = StObject.set(x, "noProxy", js.Array(value*))
      
      inline def setOnRetry(value: () => Unit): Self = StObject.set(x, "onRetry", js.Any.fromFunction0(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setProxy(value: String | URL_ | URL): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setRetry(value: Boolean | Double | TimeoutsOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait MakeFetchHappenOptions extends StObject {
    
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    /**
      * A string `Path` to be used as the cache root for [`cacache`](https://npm.im/cacache).
      *
      * Ref: https://github.com/npm/make-fetch-happen/#opts-cache-path
      */
    var cachePath: js.UndefOr[String] = js.undefined
    
    /**
      * Matches the response body against the given [Subresource
      * Integrity](https://developer.mozilla.org/en-US/docs/Web/Security/Subresource_Integrity)
      * metadata. If verification fails, the request will fail with an
      * `EINTEGRITY` error.
      *
      * `integrity` may either be a string or an
      * [`ssri`](https://npm.im/ssri) `Integrity`-like.
      */
    var integrity: js.UndefOr[String | Integrity] = js.undefined
    
    /**
      * Passed directly to `http` and `https` request calls. Determines the
      * local address to bind to.
      */
    var localAddress: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum number of active concurrent sockets to use for the underlying
      * Http/Https/Proxy agents. This setting applies once per spawned agent.
      */
    var maxSockets: js.UndefOr[Double] = js.undefined
    
    /**
      * If present, should be a comma-separated string or an array of domain
      * extensions that a proxy should _not_ be used for.
      *
      * This option may also be provided through `process.env.NO_PROXY`.
      */
    var noProxy: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * A function called whenever a retry is attempted.
      */
    var onRetry: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var proxy: js.UndefOr[String | URL_ | URL] = js.undefined
    
    /**
      * An object that can be used to tune request retry settings. Retries
      * will only be attempted on the following conditions:
      *
      * - Request method is NOT `POST`; **AND**
      * - Request status is one of: `408`, `420`, `429`, or any status in the
      *   500-range.; **OR**
      * - Request errored with `ECONNRESET`, `ECONNREFUSED`, `EADDRINUSE`,
      *   `ETIMEDOUT`, or the `fetch` error `request-timeout`.
      *
      * The following are worth noting as explicitly not retried:
      *
      * - `getaddrinfo ENOTFOUND` and will be assumed to be either an
      *   unreachable domain or the user will be assumed offline. If a
      *   response is cached, it will be returned immediately.
      * - `ECONNRESET` currently has no support for restarting. It will
      *   eventually be supported but requires a bit more juggling due to
      *   streaming.
      *
      * If `opts.retry` is `false`, it is equivalent to `{retries: 0}`
      *
      * If `opts.retry` is a number, it is equivalent to `{retries: num}`
      *
      * The following retry options are available if you want more control
      * over it:
      *
      * - `retries`
      * - `factor`
      * - `minTimeout`
      * - `maxTimeout`
      * - `randomize`
      *
      * For details on what each of these do, refer to the
      * [`retry`](https://npm.im/retry) documentation.
      */
    var retry: js.UndefOr[Boolean | Double | TimeoutsOptions] = js.undefined
  }
  object MakeFetchHappenOptions {
    
    inline def apply(): MakeFetchHappenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MakeFetchHappenOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MakeFetchHappenOptions] (val x: Self) extends AnyVal {
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCachePath(value: String): Self = StObject.set(x, "cachePath", value.asInstanceOf[js.Any])
      
      inline def setCachePathUndefined: Self = StObject.set(x, "cachePath", js.undefined)
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setIntegrity(value: String | Integrity): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      inline def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      inline def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
      
      inline def setNoProxy(value: String | js.Array[String]): Self = StObject.set(x, "noProxy", value.asInstanceOf[js.Any])
      
      inline def setNoProxyUndefined: Self = StObject.set(x, "noProxy", js.undefined)
      
      inline def setNoProxyVarargs(value: String*): Self = StObject.set(x, "noProxy", js.Array(value*))
      
      inline def setOnRetry(value: () => Unit): Self = StObject.set(x, "onRetry", js.Any.fromFunction0(value))
      
      inline def setOnRetryUndefined: Self = StObject.set(x, "onRetry", js.undefined)
      
      inline def setProxy(value: String | URL_ | URL): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setRetry(value: Boolean | Double | TimeoutsOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
  
  /* Inlined std.Pick<node-fetch.node-fetch.RequestInit, 'method' | 'body' | 'redirect' | 'follow' | 'timeout' | 'compress' | 'size' | 'headers' | 'agent'> */
  trait NodeFetchOptions extends StObject {
    
    var agent: js.UndefOr[
        Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])
      ] = js.undefined
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Any] = js.undefined
  }
  object NodeFetchOptions {
    
    inline def apply(): NodeFetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeFetchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeFetchOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent | Boolean | (js.Function1[/* parsedUrl */ URL, js.UndefOr[Agent | Boolean]])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* parsedUrl */ URL => js.UndefOr[Agent | Boolean]): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTimeout(value: Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined std.Pick<node.tls.SecureContextOptions, 'ca' | 'cert' | 'key'> & {  strictSSL :boolean | undefined} */
  trait TlsOptions extends StObject {
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
  }
  object TlsOptions {
    
    inline def apply(): TlsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TlsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TlsOptions] (val x: Self) extends AnyVal {
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
    }
  }
  
  type _To = FetchInterface
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FetchInterface = ^
}
