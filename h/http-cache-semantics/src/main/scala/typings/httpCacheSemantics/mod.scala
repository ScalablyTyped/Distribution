package typings.httpCacheSemantics

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-cache-semantics", JSImport.Namespace)
  @js.native
  class ^ protected () extends CachePolicy {
    def this(req: Request, res: Response) = this()
    def this(req: Request, res: Response, options: Options) = this()
  }
  
  /**
    * `policy = CachePolicy.fromObject(obj)` creates an instance from object created by `toObject()`.
    */
  /* static member */
  @JSImport("http-cache-semantics", "fromObject")
  @js.native
  def fromObject(obj: CachePolicyObject): CachePolicy = js.native
  
  @js.native
  trait CachePolicy extends StObject {
    
    /**
      * Returns updated, filtered set of response headers to return to clients receiving the cached response.
      * This function is necessary, because proxies MUST always remove hop-by-hop headers (such as `TE` and `Connection`)
      * and update response's `Age` to avoid doubling cache time.
      *
      * @example
      * cachedResponse.headers = cachePolicy.responseHeaders(cachedResponse);
      */
    def responseHeaders(): Headers = js.native
    
    /**
      * Use this method to update the cache after receiving a new response from the origin server.
      */
    def revalidatedPolicy(revalidationRequest: Request, revalidationResponse: Response): RevalidationPolicy = js.native
    
    /**
      * Returns updated, filtered set of request headers to send to the origin server to check if the cached
      * response can be reused. These headers allow the origin server to return status 304 indicating the
      * response is still fresh. All headers unrelated to caching are passed through as-is.
      *
      * Use this method when updating cache from the origin server.
      *
      * @example
      * updateRequest.headers = cachePolicy.revalidationHeaders(updateRequest);
      */
    def revalidationHeaders(newRequest: Request): Headers = js.native
    
    /**
      * This is the most important method. Use this method to check whether the cached response is still fresh
      * in the context of the new request.
      *
      * If it returns `true`, then the given `request` matches the original response this cache policy has been
      * created with, and the response can be reused without contacting the server. Note that the old response
      * can't be returned without being updated, see `responseHeaders()`.
      *
      * If it returns `false`, then the response may not be matching at all (e.g. it's for a different URL or method),
      * or may require to be refreshed first (see `revalidationHeaders()`).
      */
    def satisfiesWithoutRevalidation(newRequest: Request): Boolean = js.native
    
    /**
      * Returns `true` if the response can be stored in a cache.
      * If it's `false` then you MUST NOT store either the request or the response.
      */
    def storable(): Boolean = js.native
    
    /**
      * Returns approximate time in milliseconds until the response becomes stale (i.e. not fresh).
      *
      * After that time (when `timeToLive() <= 0`) the response might not be usable without revalidation. However,
      * there are exceptions, e.g. a client can explicitly allow stale responses, so always check with
      * `satisfiesWithoutRevalidation()`.
      */
    def timeToLive(): Double = js.native
    
    /**
      * Chances are you'll want to store the `CachePolicy` object along with the cached response.
      * `obj = policy.toObject()` gives a plain JSON-serializable object.
      */
    def toObject(): CachePolicyObject = js.native
  }
  object CachePolicy {
    
    @scala.inline
    def apply(
      responseHeaders: () => Headers,
      revalidatedPolicy: (Request, Response) => RevalidationPolicy,
      revalidationHeaders: Request => Headers,
      satisfiesWithoutRevalidation: Request => Boolean,
      storable: () => Boolean,
      timeToLive: () => Double,
      toObject: () => CachePolicyObject
    ): CachePolicy = {
      val __obj = js.Dynamic.literal(responseHeaders = js.Any.fromFunction0(responseHeaders), revalidatedPolicy = js.Any.fromFunction2(revalidatedPolicy), revalidationHeaders = js.Any.fromFunction1(revalidationHeaders), satisfiesWithoutRevalidation = js.Any.fromFunction1(satisfiesWithoutRevalidation), storable = js.Any.fromFunction0(storable), timeToLive = js.Any.fromFunction0(timeToLive), toObject = js.Any.fromFunction0(toObject))
      __obj.asInstanceOf[CachePolicy]
    }
    
    @scala.inline
    implicit class CachePolicyMutableBuilder[Self <: CachePolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResponseHeaders(value: () => Headers): Self = StObject.set(x, "responseHeaders", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRevalidatedPolicy(value: (Request, Response) => RevalidationPolicy): Self = StObject.set(x, "revalidatedPolicy", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRevalidationHeaders(value: Request => Headers): Self = StObject.set(x, "revalidationHeaders", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSatisfiesWithoutRevalidation(value: Request => Boolean): Self = StObject.set(x, "satisfiesWithoutRevalidation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStorable(value: () => Boolean): Self = StObject.set(x, "storable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTimeToLive(value: () => Double): Self = StObject.set(x, "timeToLive", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToObject(value: () => CachePolicyObject): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait CachePolicyObject extends StObject {
    
    var a: Boolean = js.native
    
    var ch: Double = js.native
    
    var h: js.UndefOr[String] = js.native
    
    var imm: Double = js.native
    
    var m: String = js.native
    
    var reqcc: StringDictionary[String] = js.native
    
    var reqh: Headers | Null = js.native
    
    var rescc: StringDictionary[String] = js.native
    
    var resh: Headers = js.native
    
    var sh: Boolean = js.native
    
    var st: Double = js.native
    
    var t: Double = js.native
    
    var u: js.UndefOr[String] = js.native
    
    var v: Double = js.native
  }
  object CachePolicyObject {
    
    @scala.inline
    def apply(
      a: Boolean,
      ch: Double,
      imm: Double,
      m: String,
      reqcc: StringDictionary[String],
      rescc: StringDictionary[String],
      resh: Headers,
      sh: Boolean,
      st: Double,
      t: Double,
      v: Double
    ): CachePolicyObject = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], ch = ch.asInstanceOf[js.Any], imm = imm.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], reqcc = reqcc.asInstanceOf[js.Any], rescc = rescc.asInstanceOf[js.Any], resh = resh.asInstanceOf[js.Any], sh = sh.asInstanceOf[js.Any], st = st.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachePolicyObject]
    }
    
    @scala.inline
    implicit class CachePolicyObjectMutableBuilder[Self <: CachePolicyObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Boolean): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCh(value: Double): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: String): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setImm(value: Double): Self = StObject.set(x, "imm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqcc(value: StringDictionary[String]): Self = StObject.set(x, "reqcc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqh(value: Headers): Self = StObject.set(x, "reqh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReqhNull: Self = StObject.set(x, "reqh", null)
      
      @scala.inline
      def setRescc(value: StringDictionary[String]): Self = StObject.set(x, "rescc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResh(value: Headers): Self = StObject.set(x, "resh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSh(value: Boolean): Self = StObject.set(x, "sh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSt(value: Double): Self = StObject.set(x, "st", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUUndefined: Self = StObject.set(x, "u", js.undefined)
      
      @scala.inline
      def setV(value: Double): Self = StObject.set(x, "v", value.asInstanceOf[js.Any])
    }
  }
  
  type Headers = StringDictionary[js.UndefOr[String | js.Array[String]]]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * A fraction of response's age that is used as a fallback cache duration. The default is 0.1 (10%),
      * e.g. if a file hasn't been modified for 100 days, it'll be cached for 100*0.1 = 10 days.
      * @default 0.1
      */
    var cacheHeuristic: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, common anti-cache directives will be completely ignored if the non-standard `pre-check`
      * and `post-check` directives are present. These two useless directives are most commonly found
      * in bad StackOverflow answers and PHP's "session limiter" defaults.
      * @default false
      */
    var ignoreCargoCult: js.UndefOr[Boolean] = js.native
    
    /**
      * A number of milliseconds to assume as the default time to cache responses with `Cache-Control: immutable`.
      * Note that [per RFC](https://httpwg.org/specs/rfc8246.html#the-immutable-cache-control-extension)
      * these can become stale, so `max-age` still overrides the default.
      * @default 24*3600*1000 (24h)
      */
    var immutableMinTimeToLive: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, then the response is evaluated from a perspective of a shared cache (i.e. `private` is not
      * cacheable and `s-maxage` is respected). If `false`, then the response is evaluated from a perspective
      * of a single-user cache (i.e. `private` is cacheable and `s-maxage` is ignored).
      * `true` is recommended for HTTP clients.
      * @default true
      */
    var shared: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false`, then server's `Date` header won't be used as the base for `max-age`. This is against the RFC,
      * but it's useful if you want to cache responses with very short `max-age`, but your local clock
      * is not exactly in sync with the server's.
      * @default true
      */
    var trustServerDate: js.UndefOr[Boolean] = js.native
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
      def setCacheHeuristic(value: Double): Self = StObject.set(x, "cacheHeuristic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheHeuristicUndefined: Self = StObject.set(x, "cacheHeuristic", js.undefined)
      
      @scala.inline
      def setIgnoreCargoCult(value: Boolean): Self = StObject.set(x, "ignoreCargoCult", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCargoCultUndefined: Self = StObject.set(x, "ignoreCargoCult", js.undefined)
      
      @scala.inline
      def setImmutableMinTimeToLive(value: Double): Self = StObject.set(x, "immutableMinTimeToLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutableMinTimeToLiveUndefined: Self = StObject.set(x, "immutableMinTimeToLive", js.undefined)
      
      @scala.inline
      def setShared(value: Boolean): Self = StObject.set(x, "shared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSharedUndefined: Self = StObject.set(x, "shared", js.undefined)
      
      @scala.inline
      def setTrustServerDate(value: Boolean): Self = StObject.set(x, "trustServerDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrustServerDateUndefined: Self = StObject.set(x, "trustServerDate", js.undefined)
    }
  }
  
  @js.native
  trait Request extends StObject {
    
    var headers: Headers = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object Request {
    
    @scala.inline
    def apply(headers: Headers): Request = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    var headers: Headers = js.native
    
    var status: js.UndefOr[Double] = js.native
  }
  object Response {
    
    @scala.inline
    def apply(headers: Headers): Response = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    @scala.inline
    implicit class ResponseMutableBuilder[Self <: Response] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait RevalidationPolicy extends StObject {
    
    var matches: Boolean = js.native
    
    /**
      * Boolean indicating whether the response body has changed.
      *
      * - If `false`, then a valid 304 Not Modified response has been received, and you can reuse the old
      * cached response body.
      * - If `true`, you should use new response's body (if present), or make another request to the origin
      * server without any conditional headers (i.e. don't use `revalidationHeaders()` this time) to get
      * the new resource.
      */
    var modified: Boolean = js.native
    
    /**
      * A new `CachePolicy` with HTTP headers updated from `revalidationResponse`. You can always replace
      * the old cached `CachePolicy` with the new one.
      */
    var policy: CachePolicy = js.native
  }
  object RevalidationPolicy {
    
    @scala.inline
    def apply(matches: Boolean, modified: Boolean, policy: CachePolicy): RevalidationPolicy = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
      __obj.asInstanceOf[RevalidationPolicy]
    }
    
    @scala.inline
    implicit class RevalidationPolicyMutableBuilder[Self <: RevalidationPolicy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: Boolean): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicy(value: CachePolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    }
  }
}
